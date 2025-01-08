package com.design.pattern._01_생성패턴._05_prototype._03_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

  public static void main(String[] args) {
    Student jaehoon = new Student("jaehoon");
    Student noah = new Student("noah");
    List<Student> students = new ArrayList<>();
    students.add(jaehoon);
    students.add(noah);

    // 리스트를 복제하려면? - List 인터페이스는 clone()을 지원하지 않음
    // 생성자를 이용해서 복제할 수 있음 - shallowCopy
    List<Student> clone = new ArrayList<>(students);
    System.out.println(clone);

    // 깊은 복사를 하려면?
    // 라이브러리 활용: Apache Commons Lang의 SerializationUtils.clone() 메소드나
    // Google Guava의 Objects.deepCopy() 메소드 등을 사용할 수 있음
  }
}
