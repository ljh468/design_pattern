package com.design.pattern._01_생성패턴._04_builder._02_after;

import com.design.pattern._01_생성패턴._04_builder._01_before.TourPlan;

public class App {

  public static void main(String[] args) {
    TourDirector director = new TourDirector(new DefaultTourBuilder());
    TourPlan tourPlan = director.cancunTrip();
    TourPlan tourPlan1 = director.longBeachTrip();
  }
}
