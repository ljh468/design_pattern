package com.design.pattern._01_생성패턴._02_factory_method._03_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

  @Bean
  public String hello() {
    return "Hello, Annotation Spring!";
  }

}
