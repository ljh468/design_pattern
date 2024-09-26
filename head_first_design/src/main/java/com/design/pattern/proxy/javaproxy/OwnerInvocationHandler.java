package com.design.pattern.proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

  Person person;

  public OwnerInvocationHandler(Person person) {
    this.person = person;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

    // 진짜 객체 메서드 호출 : method.invoke([person] 진짜객체, [args] 처음받았던 인자들)
    try {
      if (method.getName().startsWith("get")) {
        return method.invoke(person, args);
      }
      // 자신의 괴짜지수는 변경 불가능
      else if (method.getName().equals("setGeekRating")) {
        throw new IllegalAccessException();
      }
      // 자신의 정보는 변경 가능
      else if (method.getName().startsWith("set")) {
        return method.invoke(person, args);
      }
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    return null;
  }
}
