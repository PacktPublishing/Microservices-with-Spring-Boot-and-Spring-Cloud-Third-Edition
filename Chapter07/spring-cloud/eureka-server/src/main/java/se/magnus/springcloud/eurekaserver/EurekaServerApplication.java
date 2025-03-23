package se.magnus.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(EurekaServerApplication.class, args);
  }

  // Workaround for issue gh-4145 in Spring Cloud 2022.0.1
  // See https://github.com/spring-cloud/spring-cloud-netflix/issues/4145
  @RestController
  static class CustomErrorController implements ErrorController {

    private static final String ERROR_MAPPING = "/error";

    @RequestMapping(ERROR_MAPPING)
    public ResponseEntity<Void> error() {
      return ResponseEntity.notFound().build();
    }
  }
}

