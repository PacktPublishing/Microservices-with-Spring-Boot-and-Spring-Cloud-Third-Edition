FROM eclipse-temurin:21.0.1_12-jre-jammy as builder
WORKDIR extracted
ADD ./build/libs/*.jar app.jar
RUN java -Djarmode=layertools -jar app.jar extract

FROM eclipse-temurin:21.0.1_12-jre-jammy
WORKDIR application
COPY --from=builder extracted/dependencies/ ./
COPY --from=builder extracted/spring-boot-loader/ ./
COPY --from=builder extracted/snapshot-dependencies/ ./
COPY --from=builder extracted/application/ ./

EXPOSE 9999

ENTRYPOINT ["java", "org.springframework.boot.loader.launch.JarLauncher"]