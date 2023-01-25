/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    java
    `maven-publish`
    id("org.springframework.boot") version "2.5.9"
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.springframework.security:spring-security-saml2-service-provider:5.4.2")
    implementation("org.springframework.security:spring-security-config:5.4.2")
    implementation("org.thymeleaf.extras:thymeleaf-extras-springsecurity5:3.0.4.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf:2.5.9")
    implementation("org.springframework.boot:spring-boot-starter-web:2.5.9")
}

group = "com.codetinkering"
version = "1.0-SNAPSHOT"
description = "spring-security-saml2-service-provider-example"
java.sourceCompatibility = JavaVersion.VERSION_1_8

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

buildscript {
  repositories {
    maven {
      url = uri("https://plugins.gradle.org/m2/")
    }
  }
  dependencies {
    classpath("org.springframework.boot:spring-boot-gradle-plugin:2.5.9")
  }
}

apply(plugin = "org.springframework.boot")


