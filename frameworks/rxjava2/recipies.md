# Recipies

## Delayed execution
> [Reference](https://stackoverflow.com/a/44699057/9942979)!

You can use the following example to execute a function or a method after some
delay. The function `getTransactionDetails` will be execute after 5 seconds on
the main Android thread.

```kt
Completable
  .timer(5, TimeUnit.SECONDS, AndroidSchedulers.mainThread())
  .subscribe(this::getTransactionDetails);
```
