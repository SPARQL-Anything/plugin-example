# Plugin Example
This project shows how to create a plugin for SPARQL Anything.

You can compile the project by using Maven.

```commandline
mvn clean install -DbuildJAR=true
```

this generates the JAR file at the path `/target/plugin-0.0.1-shaded.jar`

You can load the plugin in SPARQL Anything with the following command

```
java -jar sparql.anything-<version> -q <query> -j /path/to/the/project/target/plugin-0.0.1-shaded.jar
```


## Licence

This project is distributed under  [Apache 2.0 License](LICENSE).
