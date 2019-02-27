# Prove of concept for Cucumber in Java project

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