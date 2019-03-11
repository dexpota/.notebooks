# Exception handling

> Handling an exception with a chain of responsibility.

The objective of this pattern is to chain together a series of strategies to
react to an exception. The first strategy that handle the exceptions will stop
the propagation of the exception to the other strategies.


## Use cases

- Handling the exception coming from `retrofit2`'s callback or ReactiveX's
  `Observable`, in order to communicate to the user a more insightful message
  and react with the correct actions;
    - for example when an HttpException occurs the chain can react with a more
      useful message, like unauthorized for 401 or not found for 404;
