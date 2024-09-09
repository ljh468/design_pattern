package com.design.pattern._02_구조패턴._08_composite._04_sample;

// 공통 인터페이스 Component  (개별 객체나 복합객체를 동일하게 사용하는 오퍼레이션을 정의)
public interface Component {

  // 개별 객체나 복합객체를 동일하게 사용하는 오퍼레이션
  void showDetails();

}
