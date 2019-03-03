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
