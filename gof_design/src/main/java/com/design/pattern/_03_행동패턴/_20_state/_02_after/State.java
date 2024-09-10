package com.design.pattern._03_행동패턴._20_state._02_after;

public interface State {

  void addReview(String review, Student student);

  void addStudent(Student student);
}
