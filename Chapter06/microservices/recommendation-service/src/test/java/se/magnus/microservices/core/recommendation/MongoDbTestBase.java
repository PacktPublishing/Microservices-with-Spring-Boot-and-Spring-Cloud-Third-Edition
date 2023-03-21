package se.magnus.microservices.core.recommendation;

import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MongoDBContainer;

public abstract class MongoDbTestBase {
  private static MongoDBContainer database = new MongoDBContainer("mongo:6.0.4");
  
  static {
    database.start();
  } 
  
  @DynamicPropertySource
  static void setProperties(DynamicPropertyRegistry registry) {
    registry.add("spring.data.mongodb.host", database::getContainerIpAddress);
    registry.add("spring.data.mongodb.port", () -> database.getMappedPort(27017));
    registry.add("spring.data.mongodb.database", () -> "test");
  }
}
