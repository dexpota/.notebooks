# Typescript

TypeScript is a typed superset of JavaScript that compiles to plain JavaScript.
It offers classes, modules, and interfaces to help you build robust components.

## Installation with npm

You will need to install the TypeScript compiler either globally or in your
workspace to transpile TypeScript source code to JavaScript.

```bash
# install typescript globally
npm -g install typescript
```

```bash
# install typescript locally to your project
npm install typescript
```

## A simple Hello World!

We will build a simple Hello World application running on your browser. First,
create a new project with `npm init` and fill in all required fields. Then,
install typescript locally as a dev dependency `npm install --save-dev
typescript`.

We are now going to write a typescript file and transpiling it into javascript.
The following is a simple typescript example that alert the user when the
button is pressed. Copy this example and save it inside the `ts` directory with
the name `greeter.ts`.

<!-- AUTO-GENERATED-CONTENT:START (CODE:src=./.code/hello-typescript-world/ts/greeter.ts) -->
<!-- The below code snippet is automatically added from ./.code/hello-typescript-world/ts/greeter.ts -->
```ts
class Greeter {
    greeting: string;

    constructor(message: string) {
        this.greeting = message;
    }

    greet() {
        return "Hello, " + this.greeting;
    }
}

var greeter = new Greeter("world");

var button = document.createElement('button');
button.textContent = "Say Hello";
button.onclick = function() {
    alert(greeter.greet());
}

document.body.appendChild(button);
```
<!-- AUTO-GENERATED-CONTENT:END -->

Before we can transpile the script we need to add this configuration to the
`package.json` file. This lines define a script command that will be executed
by `npm`. Now running the command `npm run tsc` will invoke the typescript
compiler and generate the javascript into the `js` directory.

```json
{
  …
  "scripts": {
    "tsc": "tsc --outDir=js ts/greeter.ts"
  }
  …
}
```

To see the result of the script we first need a simple html file to include the
generated javascript. Copy the following html code and save it into a file at
the root of the project.

<!-- AUTO-GENERATED-CONTENT:START (CODE:src=./.code/hello-typescript-world/index.html) -->
<!-- The below code snippet is automatically added from ./.code/hello-typescript-world/index.html -->
```html
<!DOCTYPE html>
<html>
  <head>
    <title>Typescript Greeeter</title>
  </head>
  <body>
    <script src="js/greeter.js"></script>
  </body>
</html>
```
<!-- AUTO-GENERATED-CONTENT:END -->
