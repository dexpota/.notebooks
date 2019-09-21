# Observables and Subscribers

## Observer and Observable

The `Observer<T>` is an interface used by an `Observable` to signal events down
a chain, this interface define the followings methods:

- `onNext(T value)` is called when a new item is ready;
- `onComplete()` is called at the end of the stream;
- `onError()` is called when an error occured.

### Observable

An `Observable` source is where the emissions of a stream originate from and is
the starting point of a chain of `Observable`.

#### Observable.create()

The `Observable.create` factory method allows us to create a source
`Observable` by simply specifing a lambda receiving an `emitter` object. The
emitter is an object that can be used to manually emit events down the chain.

<!-- AUTO-GENERATED-CONTENT:START (CODE:src=https://raw.githubusercontent.com/dexpota/rxjava2-playground/master/src/main/kotlin/me/destro/playground/rxjava2/observables/creation/Create.kt) -->
<!-- The below code snippet is automatically added from https://raw.githubusercontent.com/dexpota/rxjava2-playground/master/src/main/kotlin/me/destro/playground/rxjava2/observables/creation/Create.kt -->
```kt
package me.destro.playground.rxjava2.observables.creation

import io.reactivex.Observable

fun main() {
    val source = Observable.create<String> { emitter ->
        try {
            emitter.onNext("Alpha")
            emitter.onNext("Beta")
            emitter.onNext("Gamma")
            emitter.onNext("Delta")
            emitter.onNext("Epsilon")
            emitter.onComplete()
        } catch (e: Throwable) {
            emitter.onError(e)
        }
    }
    source.subscribe { s -> println("RECEIVED: $s") }
}
```
<!-- AUTO-GENERATED-CONTENT:END -->
