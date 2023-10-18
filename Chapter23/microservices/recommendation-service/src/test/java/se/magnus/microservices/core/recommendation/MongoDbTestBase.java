package se.magnus.microservices.core.recommendation;

import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.aot.hint.TypeReference;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.ImportRuntimeHints;
import org.testcontainers.containers.MongoDBContainer;

@ImportRuntimeHints(MongoDbTestBase.MyHints.class)
public abstract class MongoDbTestBase {

  @ServiceConnection
  private static MongoDBContainer database = new MongoDBContainer("mongo:6.0.4");

  static {
    database.start();
  }

  // Workaround for the bug in Spring Boot 3.1.4 described here https://github.com/spring-projects/spring-boot/issues/36606
  static class MyHints implements RuntimeHintsRegistrar {
    @Override
    public void registerHints(RuntimeHints hints, ClassLoader classLoader) {
      hints.reflection().registerType(TypeReference.of("com.mongodb.ConnectionString"));
    }
  }

}
