package org.singleton.singleton_common;

public class SingletonService {

  private SingletonService() {
  }

  public static SingletonService getInstance() {
    return SingletonHolder.INSTANCE;
  }

  private static class SingletonHolder {
    private static final SingletonService INSTANCE = new SingletonService();
  }

  public String getInstanceAddress(String app) {
    // 현재 클래스의 인스턴스 정보를 반환하도록 수정
    String instanceInfo = "Instance class: " + SingletonHolder.INSTANCE.getClass().getName() +
        ", Hashcode: " + Integer.toHexString(SingletonHolder.INSTANCE.hashCode()) +
        ", App: " + app;
    System.out.println(instanceInfo);
    return instanceInfo;
  }
}
