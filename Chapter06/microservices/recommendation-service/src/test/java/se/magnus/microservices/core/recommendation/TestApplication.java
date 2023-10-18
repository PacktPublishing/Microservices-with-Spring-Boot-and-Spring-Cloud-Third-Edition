package se.magnus.microservices.core.recommendation;

import org.springframework.boot.SpringApplication;

public class TestApplication {
  public static void main(String[] args) {
    SpringApplication.from(RecommendationServiceApplication::main)
      .with(TestApplicationConfiguration.class)
      .run(args);
  }
}
