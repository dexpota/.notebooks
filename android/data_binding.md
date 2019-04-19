[1]: https://developer.android.com/topic/libraries/data-binding
[2]: https://android.googlesource.com/platform/frameworks/data-binding/+/studio-master-dev/extensions/baseAdapters/src/main/java/androidx/databinding/adapters

# Data Binding

> The Data Binding Library is a support library that allows you to bind UI
> components in your layouts to data sources in your app using a declarative
> format rather than programmatically. For more information visit [here][1].

## Up and Running

To configure your app to use data binding, add the `dataBinding` element to
your `build.gradle` file in the app module, as shown in the following example:

```gradle
android {
  dataBinding {
    enabled true
  }
}
```

## Layout and Binding Expressions

## Binding Adapters

### Dynamic Binding Adapters

## Binding Convertes

## Binding Methods

## Architecture Components

## Testing

## 2 Way Data Binding

# References

## Code Samples

- [A basic example on Data Binding](https://github.com/googlecodelabs/android-databinding):
  it shows how to define custom binding adapters, binding converters and
  binding methods;

## Useful links

- [List of common binding adapters][2];
