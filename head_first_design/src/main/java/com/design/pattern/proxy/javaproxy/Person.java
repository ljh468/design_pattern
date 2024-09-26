package com.design.pattern.proxy.javaproxy;

public interface Person {

  String getName();

  String getGender();

  String getInterests();

  int getGeekRating();

  void setName(String name);

  void setGender(String gender);

  void setInterests(String interests);

  // 괴짜지수를 계산
  void setGeekRating(int rating);

}
