package com.design.pattern._03_행동패턴._17_mediator._03_java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }
}
