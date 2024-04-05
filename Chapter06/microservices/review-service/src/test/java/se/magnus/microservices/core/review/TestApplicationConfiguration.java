package se.magnus.microservices.core.review;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.containers.MySQLContainer;

@TestConfiguration(proxyBeanMethods = false)
public class TestApplicationConfiguration {

  @Bean
  @ServiceConnection
  JdbcDatabaseContainer mongoDBContainerContainer() {
    return (JdbcDatabaseContainer)new MySQLContainer("mysql:8.0.32").withStartupTimeoutSeconds(300).withReuse(false);
  }

}
