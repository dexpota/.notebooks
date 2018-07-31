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

In the first step of the protocol the application requests authorization to access service resources from the user. If the user authorized the request, the application receives an authorization grant.
