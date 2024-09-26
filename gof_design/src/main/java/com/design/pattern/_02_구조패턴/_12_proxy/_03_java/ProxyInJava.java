package com.design.pattern._02_구조패턴._12_proxy._03_java;

import com.design.pattern._02_구조패턴._12_proxy._02_after.DefaultGameService;
import com.design.pattern._02_구조패턴._12_proxy._02_after.GameService;

import java.lang.reflect.Proxy;

public class ProxyInJava {

  public static void main(String[] args) {
    ProxyInJava proxyInJava = new ProxyInJava();
    proxyInJava.dynamicProxy();
  }

  private void dynamicProxy() {
    GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
    gameServiceProxy.startGame();
  }

  private GameService getGameServiceProxy(GameService target) {
    return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                                                new Class[]{GameService.class}, (proxy, method, args) -> {
          System.out.println("앞에 하고 싶은 것 추가");
          method.invoke(target, args);
          System.out.println("뒤에 하고 싶은 것 추가");
          return null;
        });
  }
}
