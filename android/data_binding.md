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

The Data Binding library generates all the code necessary to bind your data
objects to the layout. The following is an example of a layout that will be
processed by the library:

```xml
<?xml version="1.0" encoding="utf-8" ?>
<!-- This tag tells the library to process this layout -->
<layout>
  <data>
    <!-- Variables -->
    <variable name="user" type="com.example.User" />
  </data>

  <ViewGroup>
  </ViewGroup>
</layout>
```

Inside the `data` section are defined the variables that might be used in the
expression within the layout.

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
