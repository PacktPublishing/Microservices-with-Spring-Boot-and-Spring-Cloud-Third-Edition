package se.magnus.microservices.core.review;

import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.containers.MySQLContainer;

public abstract class MySqlTestBase {

  // Extend startup timeout since a MySQLContainer with MySQL 8 starts very slow on Win10/WSL2
  @ServiceConnection
  static final JdbcDatabaseContainer database = new MySQLContainer("mysql:8").withStartupTimeoutSeconds(300);

  static {
    database.start();
  }

}
