package com.design.pattern._02_구조패턴._12_proxy._03_java;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(App.class);
    app.setWebApplicationType(WebApplicationType.NONE);
    app.run(args);
  }

  @Bean
  // 스프링이 실행될때 바로 실행되도록 함 (@Aspect에 의해 동적프록시를 이용하여 만들어진 gameService 프록시 빈(cglib)을 주입해줌)
  public ApplicationRunner applicationRunner(GameService gameService) {
    return args -> gameService.startGame();
  }
}
