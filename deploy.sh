#!/bin/zsh

mvn clean
mvn -U deploy -Dmaven.test.skip=true