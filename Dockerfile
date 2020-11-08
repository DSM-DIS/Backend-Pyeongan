FROM openjdk:11-jre-slim
COPY ./build/libs/*.jar pyeongan.jar
ENTRYPOINT ["java", "-Xmx200m", "-jar", "/pyeongan.jar"]