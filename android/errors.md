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
