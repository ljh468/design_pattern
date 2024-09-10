package com.design.pattern._03_행동패턴._20_state._02_after;

public class Client {

  public static void main(String[] args) {
    OnlineCourse onlineCourse = new OnlineCourse();
    Student student = new Student("noah");
    Student jaehoon = new Student("jaehoon");
    jaehoon.addPrivate(onlineCourse);

    onlineCourse.addStudent(student);

    onlineCourse.changeState(new Private(onlineCourse));

    onlineCourse.addReview("hello", student);

    onlineCourse.addStudent(jaehoon);

    System.out.println(onlineCourse.getState());
    System.out.println(onlineCourse.getReviews());
    System.out.println(onlineCourse.getStudents());
  }
}
