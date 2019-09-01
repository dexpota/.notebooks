# Tips

- Use `Single<T>` when you expect a single result to be returned, for example a
  network call returning its response;

- Use `Compleatable<T>` when you are only interest in knowing if the requested
  action has been completed or not, for example a database inseration;
