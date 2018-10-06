# PyCharm

## Type declaration

- Types:
	- `Foo` Foo class;
	- `x.y.Bar` Bar class inside module `x.y`;
	- `Foo | Bar` Foo or Bar class;
	- `(Foo, Bar)` a tuple of Foo and Bar class;
	- `list[Foo]` a list of Foo objects;
	- `dict[Foo, Bar]` a dictionary from Foo to Bar;
	- `(Foo) -> Bar` a function taking a Foo and returning a Bar;	

- Syntax to specify variables' type inside comments;
	- for a local variable write `""":type : <type>"""` after its use;
	- alternatively, for a local variable write this code `assert(isinstance(<variable>, type))`;
	- for an attribute write `""":type <attribute>: <type> """` inside a class;
	- for arguments of a function or method write `:type <argument>: <type>` inside the docs comment;
	- for the return value of a function or method write `:rtype :<type>` inside the docs comment;


## Documentation

> How to easily document your code

- Start writing a block comment after a definition and press enter, the result is a block comment with all tags for arguments and return value;

- Enable the generation of tag for types by going in `File->Settings->Editor->General->Smart Keys` and enabling the option `Insert type placheholders in the documentation comment stub`;
