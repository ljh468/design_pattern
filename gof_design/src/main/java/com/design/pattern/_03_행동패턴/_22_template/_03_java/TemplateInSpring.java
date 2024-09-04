package com.design.pattern._03_행동패턴._22_template._03_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class TemplateInSpring {

  public static void main(String[] args) {
    // TODO 템플릿-콜백 패턴
    // JdbcTemplate
    // JdbcTemplate jdbcTemplate = new JdbcTemplate();
    // jdbcTemplate.execute("insert *"); // 콜백으로 감싸서 넘겨줌

    // RestTemplate
    RestTemplate restTemplate = new RestTemplate();

    HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    headers.set("X-COM-PERSIST", "NO");
    headers.set("X-COM-LOCATION", "USA");

    HttpEntity<String> entity = new HttpEntity<String>(headers);
    ResponseEntity<String> responseEntity = restTemplate
        .exchange("http://localhost:8080/users", HttpMethod.GET, entity, String.class);
  }

  @Configuration
  class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
      http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll()
      );
      return http.build();
    }
  }

}
