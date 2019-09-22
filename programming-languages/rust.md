# Rust

## Ownership

In Rust, every value has a single **owner** that determines its lifetime. When
the owner is freed —dropped, in Rust terminology— the owned value is dropped
too. The Rust's ownership model permits only a single owner to own a value at a
time.

This model is too rigid to be usable, this is why it is extended to include
other rules:

- you can **move** or **copy** values from one owner to another;
- you can **borrow a reference** to a value, these references do not own the
  values they point to;
- `Rc` and `Arc` types allow values to have multiple owners.

### Moving and copying rules

In Rust, operations like assigning a value to a variable, passing it to a
function, or returning it from a function **copy** or **move** the value,
depending on the data type.

#### Moving

When a value is being moved, it means that the source gives  ownership of the
value to the destination, and becomes uninitialized. The destination now
controls the value's lifetime, and the source is not valid anymore because
uninitialized.

```rust
let s = vec!["udon".to_string(), "ramen".to_string(), "soba".to_string()];
let t = s;
let u = s; // Error! Use of moved value 's'
```

If the data type declare a clone function you can explicity ask for copies when
you want them. The clone method performs a deep copy of ithe value and leave
the source valid.

```rust
let s = vec!["udon".to_string(), "ramen".to_string(), "soba".to_string()];
let t = s.clone();
let u = s.clone();
```

In a more complex control flow how does rust decide if a value is still
uninitialized? The general principle is that, if it’s possible for a variable
to have had its value moved away, and it hasn’t definitely been given a new
value since, it’s considered uninitialized.

```rust
let x = vec![10, 20, 30];

if c {
  f(x)
}

h(x) // Error! x is considered uninitialized.
```

```rust
let x = vec![10, 20, 30];
while f() {
  g(x); // Error! x would be moved in first iteration and uninitialized in the
        // others
}
```

What happens when we try to move the content of a structure like a vector?
Trying to move the content of a vector inside another variable is not permitted
in Rust, this is why the following example won't compile.

```rust
let x = vec!["Hello".to_string(), "World!".to_string()];
let first = x[1];
```

#### Copying

The types Rust designates as `Copy` types are never moved and always copied.
The source of the assignment remains initialized and usable, with the same
value it had before.

Here are some of the types that are `Copy`:
- All basic types: integers, boolean, floating point types, character type;
- Tuples containing `Copy` types;
- Arrays of fixed size containing `Copy` types.


What about types you define yourself? These types are by default considered non
`Copy` type. If all the fields of your type are `Copy` types, then your type
can be Copy as well by placing this attribute `#[derive(Copy, Cloen)]` above
the definition.

```rust
// Example of user defined Copy type.
#[derive(Copy, Clone)]
struct Label { number: u32 }
```

### Summary

- Every value in Rust has a **single owner at a time**, when the owner goes out
  of scopes, the value is dropped;
- Data types which don't implement the `Copy` trait are **moved**, the other
  ones are **copied**;
- When you **move** a value to another **owner** the old one becomes
  uninitialized and the new one not controls the value's lifetime;
- Basic types, such as integers, float, characters, don't follow the move
  semantic; their values are **copied**;
- Data types defined by the user are by default non `Copy` types;
- A user defined data type can be a `Copy` type if all of its fields are `Copy`
  and it declares itself as a `Copy` type by using this attribute
`#[derive(Copy, Clone)]`;

## References

A reference lets you access a value without affecting the owner or the value's
lifetime. Everytime you create a reference to some value you are **borrowing**
it from its owner. Eventually you will have to return the value to its owner.

References come in two kinds, **shared	references** and **mutable
references**. A shared reference lets you read but not modify its referent, you
can hava as many of those at a time as you like. With a mutable reference you
may both read and modify the value, but you cannot have any other references to
that value at the same time.

- Blandy, J. and Orendorff, J. (2017). Programming Rust. 1st ed.
- Doc.rust-lang.org. (2018). The Rust Programming Language. [online] Available
  at: https://doc.rust-lang.org/book/2018-edition [Accessed 22 Aug. 2018].
ok at a different kind of reference: slices.
