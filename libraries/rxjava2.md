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
