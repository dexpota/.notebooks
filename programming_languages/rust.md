# Rust

## Ownership

In Rust, every value has a single **owner** that determines its lifetime. When
the owner is freed —dropped, in Rust terminology— the owned value is dropped
too. The Rust's ownership model permits only a single owner to own a value at a
time.

This model is too rigid to be usable, this is why it is extended to include
other rules:

- you can move values from one owner to another (assignment operation);
- you can *borrow a reference* to a value, these references do not own the
  values they point to;
- `Rc` and `Arc` types allow values to have multiple owners.

### Moving rules

### Summary

- Every value in Rust has a **single owner at a time**, when the owner goes out
  of scopes, the value is dropped.

# References

- Blandy, J. and Orendorff, J. (2017). Programming Rust. 1st ed.
- Doc.rust-lang.org. (2018). The Rust Programming Language. [online] Available at: https://doc.rust-lang.org/book/2018-edition [Accessed 22 Aug. 2018].
