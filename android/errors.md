# An imcomplete list of errors

## Gradle

> All errors generating from the gradle's build configuration files.

### Error message

```
No toolchains found in the NDK toolchains folder for ABI with prefix: mips64el-linux-android
```

#### Solutions

- **Update android gradle plugin**: If the version of the NDK you are using is
  greater than 17, then you have to update your android gradle plugin to a
version greater than 3.1.2
([stackoverflow.com](https://stackoverflow.com/a/52402004/9942979));

## Data Binding

### Error message

```
Unresolved reference: BR
```

#### Solutions

- **Add** this line to your gradle build configuration;
  ```
  apply plugin: 'kotlin-kapt'
  ```

## com.android.test projects and multiple flavours

### Error message

```
FAILURE: Build failed with an exception.

* What went wrong:
Could not determine the dependencies of task ':testing:compileDebugJavaWithJavac'.
> Could not resolve all task dependencies for configuration ':testing:debugCompileClasspath'.
   > Could not resolve project :app.
     Required by:
         project :testing
      > Cannot choose between the following variants of project :app:
        - ...
        - ...
        - ...
        - ...
```

#### Solutions

Replicate flavours inside second testing project.

#### Reference

See https://developer.android.com/studio/test#use_separate_test_modules_for_instrumented_tests

> If your app module defines multiple product flavors, you can recreate those flavors in your test module, and, using variant aware dependency management, the test module attempts to test the matching flavor in the target module.
