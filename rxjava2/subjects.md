# Subjects

Subjects are a class of objects that behave both as `Observer` and as
`Observable`. There are multiple implementations of `Subject`, where the
simplest one is `PublishSubject`.

The `Subject` behaves like an `Observer`, it waits for external events signaled
by calling `onNext`, `onComplete` or `onError` on it. At the same time it
behaves like an `Observable`, in fact multiple `Observer`can subscribe to it
and wait for events. All events signaled to the `Subject`, via its `Observer`
interface, are **hotly** broadcasted to all subscribed Observers.

There are multiple flavors of `Subjects`. The `BehaviorSubject` will replay
the last emitted item to each new subscribed Observer and emit all later
events. The `ReplaySubject` captures all emissions regardless of the presence
of downstream Observers and replay them to each new subscriber. The
`AsyncSubject` will only push the last value emitted before the onComplete
event, this Subject must be used only with finite sources. The `UnicastSubject`
will buffer all emissions until an Observer subscribes to it, only one Observer
can subscribe to this Subject.

## Using Subjects

> Do not expose your Subjects or at least cast it down.

> Subjects are not disposable, they will not release the resources of upstream Observables.

Subjects are usually used to bridge together imperative programming with
reactive programming. They should be used with caution, if you are going to
expose a Subject you could loose the integrity of the source, other values
could be emitted outside your control. To mitigate this issue you should
encapsulate a Subject inside a class and cast it down to Observable if you have
to expose it.

Be aware, Subjects are not disposable either and they will not release their
sources int he event `dispose` on a subscription downstream.
