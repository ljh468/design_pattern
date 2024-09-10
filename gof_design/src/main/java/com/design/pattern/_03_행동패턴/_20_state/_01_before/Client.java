package com.design.pattern._03_행동패턴._20_state._01_before;

public class Client {

  public static void main(String[] args) {
    Student student = new Student("noah");
    OnlineCourse onlineCourse = new OnlineCourse();

    Student jaehoon = new Student("jaehoon");
    jaehoon.addPrivateCourse(onlineCourse);

    onlineCourse.addStudent(student);
    onlineCourse.changeState(OnlineCourse.State.PRIVATE);

    onlineCourse.addStudent(jaehoon);

    onlineCourse.addReview("hello", student);

    System.out.println(onlineCourse.getState());
    System.out.println(onlineCourse.getStudents());
    System.out.println(onlineCourse.getReviews());
  }
}
