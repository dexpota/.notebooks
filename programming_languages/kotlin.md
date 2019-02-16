# Kotlin Programming Language

## Basics

### Basic Types

In kotlin all primitive types are promoted to objects: `Byte`, `Short`, `Int`,
`Long`, `Float`, `Double`.

### Variables

Kotlin has two keywords for declaring variables, `val` for read-only variables
and `var` for mutable variables. The mutability refers to the variable itself
not the instance it refers to.

```kotlin
var <name>[: <type>] [= <value>]
val <name>[: <type>] = <value>
```
