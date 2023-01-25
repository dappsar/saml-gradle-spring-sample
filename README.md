![java](https://img.shields.io/badge/java-informational?style=flat&logo=java&logoColor=white&color=6aa6f8)
![gradle](https://img.shields.io/badge/gradle-informational?style=flat&logo=gradle&logoColor=white&color=6aa6f8)
![maven](https://img.shields.io/badge/maven-informational?style=flat&logo=maven&logoColor=white&color=6aa6f8)


# saml2-tutorial

## Introduction

Sample integración Java with SAML (IDP and SP)

## How to run

### Maven

```sh
cd identity-provider-example
mvn install
mvn spring-boot:run
```

In other console:

```sh
cd service-provider-example
mvn install
mvn spring-boot:run

# Then, open: http://localhost:8080/sample-sp 
# Select el IDP de la lista (one option only)
# Input user: user / password: password
```


### Gradle

```sh
cd identity-provider-example
gradle build
./gradle bootRun
```

In other console:

```sh
cd service-provider-example
gradle build
gradle bootRun

# Then, open: http://localhost:8080/sample-sp 
# Select el IDP de la lista (one option only)
# Input user: user / password: password
```


## References

### Maven to Gradle

Just un "gradle init" en root folder

Then add in build.gradle:

```sh
plugins {
  id "org.springframework.boot" version "2.4.1"
}

buildscript {
  repositories {
    maven {
      url "https://plugins.gradle.org/m2/"
    }
  }
  dependencies {
    classpath "org.springframework.boot:spring-boot-gradle-plugin:2.4.1"
  }
}

apply plugin: "org.springframework.boot"
```

More info: 
- https://plugins.gradle.org/plugin/org.springframework.boot
- https://sagioto.github.io/maven2gradle/
- https://www.baeldung.com/maven-convert-to-gradle

### Gradle to Maven

Since Gradle 7, when using [Gradle's Maven-Publish plugin](https://docs.gradle.org/current/userguide/publishing_maven.html), publishToMavenLocal and publish are automatically added to your tasks, and calling either will always generate a POM file.

More info: 
- https://stackoverflow.com/questions/12888490/gradle-build-gradle-to-maven-pom-xml
- https://howtodoinjava.com/gradle/convert-maven-project-to-gradle-project/

