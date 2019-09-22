# Error Handling

We can intercept exceptions before they get to the Observer and attempt recovery. We can use these operators to handle error events, remember that their placement matters:

- `onErrorReturn` and `onErrorReturnItem` will returns a default value and
  terminate;
- `onErrorResumeNext` will emit the values of another `Observable`;
- `retry` will resubscribe to the `Observable` when an error occures, it is
  possible to specify a fixed number of retries or a `Predicate` to
  conditionally control when to retry;
- `retryWhen` can be used for delaying retries.
