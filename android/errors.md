# An imcomplete list of errors

## Gradle
`No toolchains found in the NDK toolchains folder for ABI with prefix: mips64el-linux-android [duplicate]`

- If you are using NDK >= 18 you have to update your android gradle plugin to >=3.1.x;
	- reference: https://stackoverflow.com/a/52402004/9942979;
