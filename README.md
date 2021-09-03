Thymeleaf Workshop
----------------------------

[![Build Status](https://app.travis-ci.com/josdem/thymeleaf-workshop.svg?branch=master)](https://app.travis-ci.com/josdem/thymeleaf-workshop)
[![Quality Gate Status](https://sonar.josdem.io/api/project_badges/measure?project=com.jos.dem.springboot.thymeleaf%3Athymeleaf-workshop&metric=alert_status)](https://sonar.josdem.io/dashboard?id=com.jos.dem.springboot.thymeleaf%3Athymeleaf-workshop)

This project shows different ways to handle HTML5 elements using [Thymeleaf](https://www.thymeleaf.org/) having [Spring Webflux](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html) as backend.

#### To run the project

```bash
gradle bootRun
```

#### To run tests

```bash
gradle test
```

#### To run tests with Jacoco and Sonarqube

```bash
gradle -Dsonar.login=${SONAR_TOKEN} jacocoTestReport sonarqube test
```

Where:

- `${SONAR_TOKEN}` is a sonar token to authenticate with the server (Ask me for it :)

#### Read this as reference

* https://josdem.io/techtalk/spring/spring_webflux_thymeleaf/
* https://josdem.io/techtalk/spring/spring_webflux_basics/
