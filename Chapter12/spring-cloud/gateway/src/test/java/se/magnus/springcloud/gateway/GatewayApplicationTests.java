package se.magnus.springcloud.gateway;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = RANDOM_PORT,
  properties = {
    "eureka.client.enabled=false",
    "spring.cloud.config.enabled=false"})
class GatewayApplicationTests {

  @Test
  void contextLoads() {
  }

}
