package se.magnus.microservices.core.review;

import org.springframework.boot.SpringApplication;

public class TestApplication {
  public static void main(String[] args) {
    SpringApplication.from(ReviewServiceApplication::main)
      .with(TestApplicationConfiguration.class)
      .run(args);
  }
}
