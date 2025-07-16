From maven:3.8.8-eclipse-temurin-17 AS build

WORKDIR /app


COPY . .

RUN mvn clean package -DskipTests


#run stage

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]

