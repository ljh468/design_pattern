package com.design.pattern._01_생성패턴._04_builder._03_java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {

  public static void main(String[] args) {
    UriComponents howToStudyJava = UriComponentsBuilder.newInstance()
                                                       .scheme("http")
                                                       .host("www.noah.com")
                                                       .path("java-playlist") // uri 패스형식으로 만들어줌
                                                       .build()
                                                       .encode();
    System.out.println(howToStudyJava);
  }
}
