# TourGuide

## Description
Web application in java for an OpenClassroom project.

# Technologies

> Java 17  
> Spring Boot 3.X  
> JUnit 5  

# How to have gpsUtil, rewardCentral and tripPricer dependencies available before running the project

You need to go in P8/TourGuide directory and run these commandlines: 
```
- mvn install:install-file -Dfile=/libs/gpsUtil.jar -DgroupId=gpsUtil -DartifactId=gpsUtil -Dversion=1.0.0 -Dpackaging=jar  
- mvn install:install-file -Dfile=/libs/RewardCentral.jar -DgroupId=rewardCentral -DartifactId=rewardCentral -Dversion=1.0.0 -Dpackaging=jar  
- mvn install:install-file -Dfile=/libs/TripPricer.jar -DgroupId=tripPricer -DartifactId=tripPricer -Dversion=1.0.0 -Dpackaging=jar
```
### Executing program

* going directly to the directory of the poject TourGuide and use the commandLine:
```
mvn install
mvn spring-boot:run
```

## How to setup the gitlab-CI pipeline

You should import the project on gitlab from github.
the configuration file .gitlab-ci.yml  is already written at the root of the project
