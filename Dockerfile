FROM eclipse-temurin:17
COPY target/devopsnew.jar devopsnew.jar
CMD ["java", "-jar","devopsnew.jar"]