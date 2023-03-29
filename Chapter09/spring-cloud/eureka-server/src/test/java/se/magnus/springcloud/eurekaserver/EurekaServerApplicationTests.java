package se.magnus.springcloud.eurekaserver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class EurekaServerApplicationTests {

  @Test
  void contextLoads() {
  }

  @Autowired
  private TestRestTemplate testRestTemplate;

  @Test
  void catalogLoads() {

    String expectedReponseBody = "{\"applications\":{\"versions__delta\":\"1\",\"apps__hashcode\":\"\",\"application\":[]}}";
    ResponseEntity<String> entity = testRestTemplate.getForEntity("/eureka/apps", String.class);
    assertEquals(HttpStatus.OK, entity.getStatusCode());
    assertEquals(expectedReponseBody, entity.getBody());
  }

  @Test
  void healthy() {
    String expectedReponseBody = "{\"status\":\"UP\"}";
    ResponseEntity<String> entity = testRestTemplate.getForEntity("/actuator/health", String.class);
    assertEquals(HttpStatus.OK, entity.getStatusCode());
    assertEquals(expectedReponseBody, entity.getBody());
  }
}

