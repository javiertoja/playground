# quarkus multi module project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

This project is an example of a multi-module maven setup with different repositories this means that we are going to
have two different repositories that will provide access to the same data in different technologies and systems
leanXcale and Mongodb

## Building the application

It's important to note that we rely on the maven profiles to manage the different configuration options to generate the
final executable.

https://maven.apache.org/guides/introduction/introduction-to-profiles.html

For example to build the service with a mongodb repository we will execute the following command
``
mvn clean install -p mongo
``
While in order to support leanXcale we will use
``
mvn clean install -p mongo
``

Those commands will compile the whole project and install the dependencies bundling either repository implementation.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```
mvn clean install -p {prfile} quarkus:dev
```

## Packaging and running the application

In order to package the application it's important to note that we are going to have different packages depending on the
repository implementation for that situation we are going to use image-variants to create containers with the same
version but different variants depending on the repository implementation