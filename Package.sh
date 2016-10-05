#!/bin/bash

export PATH=/home/miguel/Descargas/apache-maven-3.3.9/bin:$PATH
mvn clean -Denvironment.type=develop
mvn test -Denvironment.type=develop
mvn package -Denvironment.type=preproduction
