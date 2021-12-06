FROM openjdk:8u191-jre-alpine3.8

# workspace
WORKDIR /usr/share/seleniumDocker

# Add files , jar
ADD target/selenium-docker-tests.jar selenium-docker-tests.jar
ADD target/libs libs
ADD testng.xml testng.xml

# Entry point
# $BROWSER
# $HUB_HOST
ENTRYPOINT java -cp selenium-docker-tests.jar:libs/*  -DBROWSER=$BROWSER -DHUB_HOST=$HUB_HOST org.testng.TestNG  testng.xml
