package com.gof.design.pattern.observer;

public interface Observer {

  // 기상 정보가 변경되었을 때 옵저버에게 전달되는 상태값들
  // -> pull 방식으로 수정
  public void update();

}
