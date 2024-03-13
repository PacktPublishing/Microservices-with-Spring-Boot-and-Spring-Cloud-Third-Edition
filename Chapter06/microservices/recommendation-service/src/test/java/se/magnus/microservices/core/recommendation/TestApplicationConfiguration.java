package se.magnus.microservices.core.recommendation;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.MongoDBContainer;

@TestConfiguration(proxyBeanMethods = false)
public class TestApplicationConfiguration {

  @Bean
  @ServiceConnection
  MongoDBContainer mongoDBContainerContainer() {
    return new MongoDBContainer("mongo:6").withReuse(true);
  }

}
