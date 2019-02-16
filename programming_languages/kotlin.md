# Kotlin Programming Language

## Scripting

Kotlin can also be run as a script, create a file with `kts` extension and
optionally a shebang. The following is an example of script file:

```kotlin
#!/usr/bin/env kotlinc -script

println("Hello World!")
```

```bash
kotlin -c <script> <args>
```

## Basics

### Variables

Kotlin has two keywords for declaring variables, `val` for read-only variables
and `var` for mutable variables. The mutability refers to the variable itself
not the instance it refers to.

```kotlin
var <name>[: <type>] [= <value>]
val <name>[: <type>] = <value>
```

### Type inference

### Basic Types

In kotlin, all primitive types are promoted to objects: `Char`, `Byte`,
`Short`, `Int`, `Long`, `Float`, `Double`.

<!-- TODO Char -->

### String
<!-- TODO String and string templates -->

### Arrays

### Packages and imports
