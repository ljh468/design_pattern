package com.design.pattern._02_구조패턴._08_composite._04_sample;

// Leaf 클래스: 개별 객체
class Employee implements Component {

  private String name;

  private String position;

  public Employee(String name, String position) {
    this.name = name;
    this.position = position;
  }

  @Override
  public void showDetails() {
    System.out.println(name + " (" + position + ")");
  }
}
