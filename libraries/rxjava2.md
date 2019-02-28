# RxJava

## Subjects

Subjects are a class of objects that behave both as `Observer` and as
`Observable`. There are multiple implementations of `Subject`, where the
simplest one is `PublishSubject`.

The `Subject` behaves like an `Observer`, it waits for external events signaled
by calling `onNext`, `onComplete` or `onError` on it. At the same time it
behaves like an Observable, in fact multiple `Observer`can subscribe to it and
wait for events.All events signaled to the Subject, via its `Observer`
interface, are hotly broadcasted to all subscribed Observers.

Subjects are usually used to bridge together imperative programming with
reactive programming.

### Using Subjects for combining Observables

More likely, you will use Subjects to eagerly subscribe to an unknown
number of multiple source Observables and consolidate their emissions as a
single Observable. This can be helpful in modularized code bases where
decoupling between Observables and Observers takes place and executing
Observable.merge() is not that easy.

<!-- AUTO-GENERATED-CONTENT:START (CODE:src=https://raw.githubusercontent.com/dexpota/rxjava2-playground/master/src/main/kotlin/me/destro/playground/rxjava2/subjects/Subjects.kt) -->
<!-- The below code snippet is automatically added from https://raw.githubusercontent.com/dexpota/rxjava2-playground/master/src/main/kotlin/me/destro/playground/rxjava2/subjects/Subjects.kt -->
```kt
package me.destro.playground.rxjava2.subjects

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject
import java.util.concurrent.TimeUnit

fun main() {
    val source1 = Observable.interval(1, TimeUnit.SECONDS).map { "Seconds: $it" }
    val source2 = Observable.interval(100, TimeUnit.MILLISECONDS).map { "Milliseconds: $it" }.take(15)

    val subject = PublishSubject.create<String>()

    subject.subscribe({
        println("New item: $it")
    }, {
        println("On error called.")
    }, {
        println("On complete called.")
    })

    // the first source sends an infinite numbers of events
    source1.subscribe(subject)
    // but the second source will send only 15 events, after that it will call onComplete and the subject
    // will stop receiving events, because its onComplete event have been called.
    source2.subscribe(subject)

    Thread.sleep(4000)
}
```
<!-- AUTO-GENERATED-CONTENT:END -->