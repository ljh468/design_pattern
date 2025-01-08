package com.design.pattern._01_생성패턴._05_prototype._03_java;

public class Student {

  String name;

  public Student(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        '}';
  }
}
