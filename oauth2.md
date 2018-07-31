# An Introduction to OAuth2

## Introduction

OAuth 2 is an authorization framework that enables applications to obtain limited access to user accounts by delegating authentication to the service that hosts the user account. OAuth 2 provides authorization flows for web and desktop applications, and mobile devices.

## Roles

The *resource owner* is the user who authorizes an application to access their account.

The *resource server* hosts the protected user accounts, and the authorization server verifies the identity of the user then issues access tokens to the application.

The client is the application that wants to access the user's account. Before it may do so, it must be authorized by the user, and the authorization must be validated by the API.

## Application Registration

Before using OAuth with your application, you must register your application with the service. This is done through a registration form in the "developer" or "API" portion of the service's website.

## Client ID and Client Secret

Once your application is registered, the service will issue "client credentials" in the form of a client identifier and a client secret.

## Protocol

## Authorization Grant

In the first step of the protocol the application requests authorization to access service resources from theuser. If the user authorized the request, the application receives an authorization grant. OAuth 2 defines four grant types, each of which is useful in different cases.

- **Authorization Code**: used with server-side applications;
- **Implicit**: used with mobile apps or web applications;
- **Resource Owner Password Credentials**: used with trusted Applications, such as those owned by the service itself;
- **Client Credentials**: used with Applications API access.

### Authorization Code

1. The user is given an authorization code link to the *resource server*, when the user clicks it they must first log in to the service and then authorize or deny the application access to their account;

2. If the user clicks "Authorize Application", the service redirects the user-agent to the application redirect URI, which was specified during the client registration, along with an authorization code;

3. The application requests an access token from the API, by passing the authorization code along with authentication details, including the client secret, to the API token endpoint.

Now the application is authorized! It may use the token to access the user's account via the service API, limited to the scope of access, until the token expires or is revoked. If a refresh token was issued, it may be used to request new access tokens if the original token has expired.

### Implicit

The implicit grant type is used for mobile apps and web applications, where the client secret confidentiality is not guaranteed.

- the access token may be exposed to the user and other applications on the user's device;
- this flow does not authenticate the identity of the application;
- does not support refresh tokens;

1. With the implicit grant type, the user is presented with an authorization link, that requests a token from the API;

2. When the user clicks the link, they must first log in to the service, to authenticate their identity;

3. If the user clicks "Authorize Application", the service redirects the user-agent to the application redirect URI, and includes a URI fragment containing the access token;

4. The user-agent follows the redirect URI but retains the access token.

5. The application returns a webpage that contains a script that can extract the access token from the full redirect URI that the user-agent has retained.

6. The user-agent executes the provided script and passes the extracted access token to the application.

## Resources

- https://www.digitalocean.com/community/tutorials/an-introduction-to-oauth-2;
- https://aaronparecki.com/oauth-2-simplified/;
- https://www.oauth.com;

