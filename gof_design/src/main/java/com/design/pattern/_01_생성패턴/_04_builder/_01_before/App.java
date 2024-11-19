package com.design.pattern._01_생성패턴._04_builder._01_before;

import java.time.LocalDate;

public class App {

  public static void main(String[] args) {

    // setter방식으로 객체를 생성하면 일관된 프로세스가 없어 불안전하게 만들어질 수 있는 단점이 있음
    // 생성자를 이용하더라도 장황하게 작성하게 될 수 있음
    TourPlan shortTrip = new TourPlan();
    shortTrip.setTitle("오레곤 롱비치 여행");
    shortTrip.setStartDate(LocalDate.of(2021, 7, 15));

    TourPlan tourPlan = new TourPlan();
    tourPlan.setTitle("칸쿤 여행");
    tourPlan.setNights(2);
    tourPlan.setDays(3);
    tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
    tourPlan.setWhereToStay("리조트");
    tourPlan.addPlan(0, "체크인 이후 짐풀기");
    tourPlan.addPlan(0, "저녁 식사");
    tourPlan.addPlan(1, "조식 부페에서 식사");
    tourPlan.addPlan(1, "해변가 산책");
    tourPlan.addPlan(1, "점심은 수영장 근처 음식점에서 먹기");
    tourPlan.addPlan(1, "리조트 수영장에서 놀기");
    tourPlan.addPlan(1, "저녁은 BBQ 식당에서 스테이크");
    tourPlan.addPlan(2, "조식 부페에서 식사");
    tourPlan.addPlan(2, "체크아웃");
  }
}
