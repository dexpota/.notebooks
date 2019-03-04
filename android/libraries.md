# Libraries

## Retrofit2

### Authentication

#### Header authentication

- Adding an annotation and a parameter to each methods of the retrofit
  interface;
  - in this solution we need to change every interface that need an
    authentication header;

```kotlin
fun user(@Header("Authorization") token: String)
```

- Another solution is to use an OkHttp interceptor that add an header to each requests;
  - in this solution we need to find a way to specify which endpoint need an authentication header;
    - we can simply check the url to see if its an endpoint that need an auth header;

### Service Generator
> Pattern service generator, TODO integrate with koin system
> [Reference](https://futurestud.io/tutorials/retrofit-2-creating-a-sustainable-android-client)

### Errors
> [Reference](https://futurestud.io/tutorials/retrofit-2-how-to-detect-network-and-conversion-errors-in-onfailure)
> [Reference](https://futurestud.io/tutorials/retrofit-2-simple-error-handling)
> [Reference](https://futurestud.io/tutorials/retrofit-2-catch-server-errors-globally-with-response-interceptor)
