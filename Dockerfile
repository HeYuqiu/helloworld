FROM maven:3.6.0-alpine
ADD . /app
WORKDIR /app/
RUN mvn clean package
EXPOSE 8080
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -jar target/demo-0.0.1-SNAPSHOT.jar

