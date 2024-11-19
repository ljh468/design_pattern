package com.design.pattern._01_생성패턴._04_builder._02_after;

import com.design.pattern._01_생성패턴._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {

  private TourPlanBuilder tourPlanBuilder;

  public TourDirector(TourPlanBuilder tourPlanBuilder) {
    this.tourPlanBuilder = tourPlanBuilder;
  }

  // TourDirector를 활용해서 만들어지는 프로세스들이 자주 반복 되면 미리 만들어서 재사용할 수 있게함
  public TourPlan cancunTrip() {
    return tourPlanBuilder.title("칸쿤 여행")
                          .nightsAndDays(2, 3)
                          .startDate(LocalDate.of(2020, 12, 9))
                          .whereToStay("리조트")
                          .addPlan(0, "체크인하고 짐 풀기")
                          .addPlan(0, "저녁 식사")
                          .getPlan();
  }

  public TourPlan longBeachTrip() {
    return tourPlanBuilder.title("롱비치")
                          .startDate(LocalDate.of(2021, 7, 15))
                          .getPlan();
  }
}
