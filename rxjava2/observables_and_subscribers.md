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

```java
import io.reactivex.Observable;
public class Launcher {
  public static void main(String[] args) {
    Observable<String> source = Observable.create(emitter -> {
      try {
        emitter.onNext("Alpha");
        emitter.onNext("Beta");
        emitter.onNext("Gamma");
        emitter.onNext("Delta");
        emitter.onNext("Epsilon");
        emitter.onComplete();
      } catch(Throwable e) {
        emitter.onError(e);
      }
    });
    source.subscribe(s -> System.out.println("RECEIVED: " + s));
  }
}
```
