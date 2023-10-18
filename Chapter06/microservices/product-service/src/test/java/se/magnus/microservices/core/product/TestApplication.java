package se.magnus.microservices.core.product;

import org.springframework.boot.SpringApplication;

public class TestApplication {
  public static void main(String[] args) {
    SpringApplication.from(ProductServiceApplication::main)
      .with(TestApplicationConfiguration.class)
      .run(args);
  }
}
