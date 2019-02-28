# Prove of concept for Cucumber in Java project

## Prerequisite
Some software are required before run the program:

1. [Java 8] - Programming language of backend

2. [Apache Maven] - Software project management and comprehension tool. We are using it to build and run our project.

3. [GIT] - Version control system

4. [IntelliJ] - IDE to do Java coding

# Build
Build the application by using below command:
```ssh
mvn clean install
```
Maven create poc-cucumber-0.0.1-SNAPSHOT.jar in the target folder

# Run
Run the application by using below command:
```ssh
java -jar target/poc-cucumber-0.0.1-SNAPSHOT.jar
```
Open http://localhost:8080/ by browser.

# Friday and related test
## URL
An endpoint is built and call Friday checker: http://localhost:8080/weekdays/isFriday/{string to check}
Exp: http://localhost:8080/weekdays/isFriday/mon

# Health Check
There is a [Actuator] health check path:
```ssh
curl localhost:8080/actuator/health
```

   [Actuator]: https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#production-ready
   [Apache Maven]: https://maven.apache.org/
   [Java 8]: https://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html
   [GIT]: https://git-scm.com/
   [IntelliJ]: https://www.jetbrains.com/idea/
