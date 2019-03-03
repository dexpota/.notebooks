# koin on Android

> Dependency injection for Kotlin

## Introduction

Koin is pragmatic lightweight dependency injection framework for Kotlin
developers. The library `koin-core` is not tied up to any particular framework,
if you want to take advantage of Koin on Android use `koin-android`. Start
using `koin-android` with your Gradle project by adding the following
dependency.

```groovy
// Add Jcenter to your repositories if needed
repositories {
  jcenter()
}

dependencies {
  // Koin for Android
  implementation 'org.koin:koin-android:{revnumber}'
}
```

## Up and running

1. Define your components, for example a Repository and a Presenter;

```kotlin

interface HelloRepository {
  fun giveHello(): String
}

class HelloRepositoryImpl() : HelloRepository {
  override fun giveHello() = "Hello Koin"
}

class MySimplePresenter(val repo: HelloRepository) {
  fun sayHello() = "${repo.giveHello()} from $this"
}
```

2. User the `module` function to declare a Koin module;

```kotlin
val appModule = module {
  // single instance of HelloRepository
  single<HelloRepository> { HelloRepositoryImpl()  }
  // Simple Presenter Factory
  factory { MySimplePresenter(get())  }
}
```

3. Start Koin by calling `startKoin` inside your Application class;

```kotlin
class MyApplication : Application(){
  override fun onCreate() {
    super.onCreate()
    // Start Koin
    startKoin(this, listOf(appModule))
  }
}
```

4. Inject the dependencies by using the `inject` delegator;

```kotlin
class MySimpleActivity : AppCompatActivity() {
  // Lazy injected MySimplePresenter
  val firstPresenter: MySimplePresenter by inject()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    //...
  }
}
```

## Scopes

A Scope define the amount of time an object’s state persists, when the scope
context ends, any objects bound under that scope cannot be injected again.

On Android the lifecycle of its components is managed by the system itself, we
don't have any control over it but the system provides us with useful callbacks.

If we want to tie togheter the scopes of Koin modules to an Android components
we need to be aware of its lifecycle. The `koin-android-scope` library provides
us with this capability, to start using it add this dependency to your Gradle
project.

```groovy
// Add Jcenter to your repositories if needed
repositories {
jcenter()
}

dependencies {
  // Scope for Android
  implementation 'org.koin:koin-android-scope:{revnumber}'
  // or Scope for AndroidX
  implementation 'org.koin:koin-androidx-scope:{revnumber}'
}
```

We can roughly categorize components by their lifecycle into three categories.

- Long live components are used by several screens and lives as long as the
  application, examples: Services and Data Repositories;
  - We can define these components inside our Koin module by using a `single`
    definition;

- Medium live components are used by several screens and must be dropped after
  some amount of time;
  - We can use a `scope` definition to declare these components and manage
    manually the opening and closening of it;
  - When we need to start using a component binded to a scope we can create the
    scope with `getKoin().createScope()`;
  - When we no longer need the component we can close the scope with
    `getKoin().getScope().close()`;

- Short live components are used by only one screen and must be dropped when no
  longer needed, these components are usually tied up to the UI;
    - These components must be created each time they are requested, this can
      be accomplished by defining it with a `factory` definition;
    - An alternative is to use a `scope` definition and bind it to the
      lifecycle with `bindScope`, this way the scope will be closed when the
      lifecycle ends;

Most of Android memory leaks comes from referencing a UI/Android component from
a non Android component. The system keeps a reference on it and can’t totally
drop it via garbage collection.
