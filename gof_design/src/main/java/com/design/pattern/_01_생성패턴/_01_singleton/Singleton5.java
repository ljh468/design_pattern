package com.design.pattern._01_생성패턴._01_singleton;

import java.io.Serializable;

/**
 * Enum을 사용한 싱글톤
 * - 가장 완벽함 (멀티스레드 환경에 안전, 리플랙션 방지)
 * - 자바 5 이상부터 사용가능
 */
public enum Singleton5 implements Serializable {

  INSTANCE;

  public void doSomething() {
    // 싱글톤이 할 작업
  }

}
