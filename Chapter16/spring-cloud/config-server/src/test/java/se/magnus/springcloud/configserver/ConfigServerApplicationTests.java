package se.magnus.springcloud.configserver;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = RANDOM_PORT, properties = {"spring.profiles.active=native"})
class ConfigServerApplicationTests {

  @Test
  void contextLoads() {
  }

}
