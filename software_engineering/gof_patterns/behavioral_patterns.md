# Behavioral Patterns

## Chain of responsibility
> [Reference]()

- The *Chain of responsibility pattern avoids coupling the sender of a request
  to its receiver;

- The **sender** doesn't know who is going to handle a request, the request has
  an **implicit receiver**;

- The **receivers** are chained together and they pass the request along the
  chain until an object handles it;

<p align="center">
<img src="./.assets/chain_of_responsibility.png" height="350px"/>
</p>

## Command
## Interpreter
## Iterator
## Mediator
## Memento
## Observer
## State

## Strategy

> [Reference](https://sourcemaking.com/design_patterns/strategy)

- The *Strategy* pattern gives you the ability to define a family of algorithms,
encapsulate each one, and make them interchangeable.

- *Strategy* reduces the *coupling* between the clients and the algorithms. The
algorithm can vary independently from the clients that use it.

- The pattern capture the abstraction in an interface, and bury the
  implementation details in derived classes.

<p align="center">
<img src="strategy.png" height="350px"/>
</p>

## Template method
## Visitor
