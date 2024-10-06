package com.design.pattern._03_행동패턴._17_mediator._01_before;

public class Gym {

  private CleaningService cleaningService;

  public void clean() {
    cleaningService.clean(this);
  }
}
