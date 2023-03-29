package se.magnus.springcloud.gateway;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.http.HttpStatus.SERVICE_UNAVAILABLE;
import static org.springframework.http.MediaType.APPLICATION_JSON;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(
  webEnvironment = RANDOM_PORT,
  properties = {"spring.security.oauth2.resourceserver.jwt.jwk-set-uri=some-url"})
class GatewayApplicationTests {

  @Autowired
  private WebTestClient client;

  @Test
  void contextLoads() {
  }

  @Test
  void healthy() throws Exception {

    // TODO: Gives 401 when using M5, expected it to return 200 UP, ignoring "management.health.rabbit.enabled=false"?
    client.get()
      .uri("/actuator/health")
      .accept(APPLICATION_JSON)
      .exchange()
      .expectStatus().isEqualTo(SERVICE_UNAVAILABLE)
      .expectHeader().contentType(APPLICATION_JSON)
      .expectBody()
      .jsonPath("$.status").isEqualTo("DOWN");
  }

}
