package se.magnus.microservices.composite.product;

import static org.springframework.http.HttpMethod.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

  @Bean
  SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
    http
      .authorizeExchange()
        .pathMatchers("/openapi/**").permitAll()
        .pathMatchers("/webjars/**").permitAll()
        .pathMatchers("/actuator/**").permitAll()
        .pathMatchers(POST, "/product-composite/**").hasAuthority("SCOPE_product:write")
        .pathMatchers(DELETE, "/product-composite/**").hasAuthority("SCOPE_product:write")
        .pathMatchers(GET, "/product-composite/**").hasAuthority("SCOPE_product:read")
        .anyExchange().authenticated()
        .and()
      .oauth2ResourceServer()
        .jwt();
    return http.build();
  }
}