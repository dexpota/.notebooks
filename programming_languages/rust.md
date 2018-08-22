# Rust

## Ownership

In Rust, every value has a single **owner** that determines its lifetime. When
the owner is freed —dropped, in Rust terminology— the owned value is dropped
too. The Rust's ownership model permits only a single owner to own a value at a
time.

This model is too rigid to be usable, this is why it is extended to include
other rules:

- you can **move** or **copy** values from one owner to another;
- you can *borrow a reference* to a value, these references do not own the
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
let s = vec!["udon", "ramen", "soba"];
let t = s;
let u = s; // Error! Use of moved value 's'
```

In a more complex control flow how does rust decide if a value is still
uninitialized? The general principle is that, if it’s possible for a variable
to have had its value moved away, and it hasn’t definitely been given a new
value since, it’s considered uninitialized. 


### Summary

- Every value in Rust has a **single owner at a time**, when the owner goes out
  of scopes, the value is dropped;
- Data types which don't implement the `Copy` trait are **moved**, the other
  ones are **cloned**;

# References

- Blandy, J. and Orendorff, J. (2017). Programming Rust. 1st ed.
- Doc.rust-lang.org. (2018). The Rust Programming Language. [online] Available at: https://doc.rust-lang.org/book/2018-edition [Accessed 22 Aug. 2018].
