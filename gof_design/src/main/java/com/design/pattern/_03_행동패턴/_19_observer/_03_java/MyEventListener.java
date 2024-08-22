package com.design.pattern._03_행동패턴._19_observer._03_java;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener {

  @EventListener(MyEvent.class)
  public void onApplicationEvent(MyEvent event) {
    System.out.println(event.getMessage());
  }
}
