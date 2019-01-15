# Java

## Interfaces

### Default Methods or Extension Methods
> [Reference](https://winterbe.com/posts/2014/03/16/java-8-tutorial/)
> Requirements: Java 8

Starting from Java 8 it is possible to add non-abstract method implementations
to interfaces by using `default` keyword.

```Java
interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
```

### Functional Interfaces
> Requirements: Java 8

An interface with exactly one abstract method declaration is called *functional
interface*. To ensure that an interface meets the requirements you can add the
`@FunctionalInterface` annotation.

```Java
@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
```

#### Built-in Functional Interfaces
> [Reference](https://www.baeldung.com/java-8-functional-interfaces)

The JDK 1.8 API contains many built-in functional interfaces.

| Functional Interface | Description                                                                 |
|----------------------|-----------------------------------------------------------------------------|
| Predicate            | boolean-valued functions of one argument.                                   |
| Function             | Functions accept one argument and produce a result.                         |
| Supplier             | Suppliers produce a result of a given generic type.                         |
| Consumer             | Consumers represents operations to be performed on a single input argument. |
| UnaryOperator        | A unary operator from T -> T                                                |
| BinaryOperator       | A binary operator from (T, T) -> T                                          |

## Lambda
> [Reference](https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/Lambda-QuickStart/index.html)
> [Reference](https://winterbe.com/posts/2014/03/16/java-8-tutorial/)
> See: Functional Interfaces.

Java 8 introduces the concept of *lambda*, these provides a clear and concise a
way to represent an instance of a functional interface using an expression.

Each *lambda* expression has a type specified by a functional interface and its
signature must match the interface's method. This is the general syntax of a
*lambda* expression:

```java
([<arguments>]) -> {<body>}
```

Here some examples of *lambdas*.

```java
(int x, int y) -> x + y

() -> 42

(String s) -> { System.out.println(s); }
```

## Streams

> [Reference](https://winterbe.com/posts/2014/03/16/java-8-tutorial/)
> [Reference](https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/)

A java.util.Stream represents a sequence of elements on which one or more
operations can be performed. Stream operations are either intermediate or
terminal. While terminal operations return a result of a certain type,
intermediate operations return the stream itself so you can chain multiple
method calls in a row.

### Operations

| Operation | Description                                                                                         |
|-----------|-----------------------------------------------------------------------------------------------------|
| filter    | Filter accepts a predicate to filter all elements of the stream.                                    |
| sorted    | Sorted is an intermediate operation which returns a sorted view of the stream.                      |
| map       | The intermediate operation map converts each element into another object via the given function.    |
| count     | Count is a terminal operation returning the number of elements in the stream as a long.             |
| reduce    | This terminal operation performs a reduction on the elements of the stream with the given function. |
