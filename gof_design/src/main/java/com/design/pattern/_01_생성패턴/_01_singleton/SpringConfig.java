package com.design.pattern._01_생성패턴._01_singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

  @Bean
  public String hello() {
    return "hello";
  }

}
