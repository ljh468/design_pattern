package com.design.pattern._02_구조패턴._12_proxy._03_java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// 동적프록시를 이용해서 내부적으로 동적으로 프록시 빈을 만들어줌
// 사용하려는 서비스 객체를 주입할때 프록시 빈을 주입해줌 (cglib 프록시객체)
@Aspect
@Component
public class PerfAspect {

  // gameService에 적용하겠다라는 의미
  @Around("bean(gameService)")
  public void timestamp(ProceedingJoinPoint point) throws Throwable {
    long before = System.currentTimeMillis();
    // ProceedingJoinPoint는 적용한 곳의 메서드를 가리킴
    point.proceed();
    System.out.println(System.currentTimeMillis() - before);
  }
}
