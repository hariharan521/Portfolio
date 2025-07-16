From maven:3.8.6-openjdk-17-slim AS build

WORKDIR /app


COPY . .

RUN mvn clean package -DskipTests


#run stage

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]

