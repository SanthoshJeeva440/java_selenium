Java Selenium TestNG Automation
===============================

Introduction
------------
Selenium is one of the most widely used open-source Web UI automation testing tools. It supports the automation of websites across different browsers, platforms, and programming languages.

Pre-Request Installation
------------------------

### Java
### MAVEN
### Intelij IDEA CE or Eclipse Photon 

Maven Archetype
---------------
Maven Version = 3.8.6

Project Type = Maven Archetype Quick Start

Maven Life Cycle
---------------
Maven Clean
```bash
mvn clean
```
Maven Install
```bash
mvn install
```
Maven Test
```bash
mvn test
```

Maven Execution
---------------
### Execute Single Test Suite
```bash
mvn clean test -Dtest=login
```

### Execute All Test Suite
```bash
mvn clean test -DsuiteTest=suiteTest
```

### Cross Browser Testing
```bash
mvn clean test -DsuiteTest=crossBrow
```

### Environment Test
### QA
```bash
mvn clean test -Dtest=login -Denv=qa
```

### DEV
```bash
mvn clean test -Dtest-login -Denv-dev
```