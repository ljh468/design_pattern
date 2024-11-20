package com.design.pattern._01_생성패턴._04_builder._02_after;

import com.design.pattern._01_생성패턴._04_builder._01_before.TourPlan;

public class App {

  public static void main(String[] args) {
    TourDirector director = new TourDirector(new DefaultTourBuilder());
    TourPlan tourPlan1 = director.cancunTrip();
    System.out.println("tourPlan1 = " + tourPlan1);
    System.out.println();

    director.setTourPlanBuilder(new DefaultTourBuilder());
    TourPlan tourPlan2 = director.longBeachTrip();
    System.out.println("tourPlan2 = " + tourPlan2);
  }
}
