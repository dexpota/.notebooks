# LaTeX

## Definitions.

A **fragile command** is a command that expands into illegal TeX code during
the save process.

## Macros

### Define new commands

```latex
\newcommand{<name>}[<num>]{<definition>}
```

- `<name>`: the name of the command you want to create, only alpha characters;
- `<definition>`: the definition of the command;
- `<num>`: optional value that specifies the number of arguments the 
  command takes.

```latex
\newcommand{\wbal}{The Wikibook about \LaTeX}
```

`\newcommand` cannot be used to replace a command with the same name, in case
you explicitly want this you can use `\renewcommand`. You might want LaTex to
silently ignore the redefinition of a command, in such case you can use
`\providecommand`.

If the command is **fragile** then it's worth trying to replace its declaration
with `\DeclareRobustCommand`.

#### Arguments

If the command includes arguments you must specify how many it takes in the
`<num>` parameter. It is possible to specify up to 9 parameters. Inside the
definition of the command each tag `#<n>` get replaced by the n-th argument,
each argument is specified by adding an extra set of brackets.

```latex
\newcommand{\wbalsup}[1] { This is the Wikibook about \LaTeX supported by #1}
\wbalsup{Wikimedia}
```

#### Spaces

Spaces are produced, inside a macro as elsewhere, by space or tab characters,
or by end-of-line characters.  Spaces are ignored in vertical mode (between
paragraphs), at the beginning of a line, and after a command name.

The principal technique for suppressing spaces is the use of % characters:
everything after a % is ignored, even the end of line itself. The secondary
technique is to ensure that the end of line is preceded by a command name 


# References

- En.wikibooks.org. (2018). LaTeX - Wikibooks, open books for an open world.
  [online] Available at: https://en.wikibooks.org/wiki/LaTeX [Accessed 24 Aug.
2018].
- The TeX FAQ. (2018). Spaces in macros. [online] Available at:
  https://texfaq.org/FAQ-spinmacro [Accessed 24 Aug. 2018]. 
