package com.design.pattern._03_행동패턴._13_chain_of_responsibilities._03_java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }

  @GetMapping("/test")
  public String test() {
    return "test";
  }
}
