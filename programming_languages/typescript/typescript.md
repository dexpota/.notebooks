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

We will soon write typescript code and transpiling it into javascript.  The
following is a simple typescript example that alert the user when the button is
pressed. Copy this example and save it inside the `ts` directory with the name
`greeter.ts`.

<!-- AUTO-GENERATED-CONTENT:START (CODE:src=./.code/hello-typescript-world/ts/greeter.ts) -->
<!-- AUTO-GENERATED-CONTENT:END -->

The result of the transpiling will be save into the `js` directory. But before
this, we need to add this configuration to the `package.json` file.
