package com.design.pattern._01_생성패턴._04_builder._03_java;

public class StringBuilderExample {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    String result = stringBuilder.append("jaehoon").append("noah").toString();
    System.out.println(result);
  }
}
