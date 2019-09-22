# Errors

## Updating pip on Ubuntu

Installing some packages with `pip` as a dependency might broke pip itself.

https://github.com/pypa/pipenv/issues/2122

A possible solution is to append `~/.local/bin` to `PATH` in your shell configuration file. It is important for the entry to be appended before any other path.

```bash
PATH=~/.local/bin:$PATH
export $PATH
```

https://github.com/pypa/pipenv/issues/2122#issuecomment-386065287
