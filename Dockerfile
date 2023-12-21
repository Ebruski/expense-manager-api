FROM openjdk:20

COPY target/expenseTrackerApi-0.0.1-SNAPSHOT.jar expenseTrackerApi-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/expenseTrackerApi-0.0.1-SNAPSHOT.jar"]