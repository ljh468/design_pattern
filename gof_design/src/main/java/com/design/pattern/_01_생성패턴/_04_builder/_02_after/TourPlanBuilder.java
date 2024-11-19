package com.design.pattern._01_생성패턴._04_builder._02_after;

import com.design.pattern._01_생성패턴._04_builder._01_before.TourPlan;

import java.time.LocalDate;

// 빌더 인터페이스
public interface TourPlanBuilder {

  // 메서드체이닝을 사용하기 위해 TourPlanBuilder 인터페이스를 반환함
  TourPlanBuilder title(String title);

  TourPlanBuilder nightsAndDays(int nights, int days); // 같이 입력해야하는 속성

  TourPlanBuilder startDate(LocalDate localDate);

  TourPlanBuilder whereToStay(String whereToStay);

  TourPlanBuilder addPlan(int day, String plan);

  // 빌더를 마무리해서 객체를 만드는 메서드 (.build)
  TourPlan getPlan();

}
