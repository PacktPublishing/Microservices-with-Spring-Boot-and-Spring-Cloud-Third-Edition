package se.magnus.springcloud.configserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain configure(HttpSecurity http) throws Exception {
    http
      // Disable CRCF to allow POST to /encrypt and /decrypt endpoins
      .csrf()
        .disable()
      .authorizeRequests()
        .anyRequest().authenticated()
        .and()
        .httpBasic();
    return http.build();
  }
}
