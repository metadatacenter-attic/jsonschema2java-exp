JSON Schema to Java Convertor
=============================

Minimal Maven Java project that uses [jsonschema2pojo](https://github.com/joelittlejohn/jsonschema2pojo) to generate Java classes from JSON Schema.

The ```./src/main/resources/json-schema``` directory contains an example JSON Schema file.

The ```./src/main/resources/json``` directory contains an example instance.

The main class ```exp.jsonschema2java.JSONSchema2Java``` contains an example of reading a JSON instance and printing out its contents.

#### Building and Running

To build this library you must have the following items installed:

+ [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
+ A tool for checking out a [Git](http://git-scm.com/) repository.
+ Apache's [Maven](http://maven.apache.org/index.html).

Get a copy of the latest code:

    git clone https://github.com/metadatacenter/jsonschema2java.git

Change into the jsonschema2java directory:

    cd jonschema2java 

Then build it with Maven:

    mvn clean install

To run:

    mvn exec:java

