package com.design.pattern.proxy.javaproxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTestDrive {

  HashMap<String, Person> datingDB = new HashMap<>();

  public static void main(String[] args) {
    MatchMakingTestDrive test = new MatchMakingTestDrive();
    test.drive();
  }

  public MatchMakingTestDrive() {
    initializeDatabase();
  }

  public void drive() {
    Person joe = getPersonFromDatabase("Joe Javabean");

    System.out.println("\n 본인용 프록시객체 생성");
    Person ownerProxy = getOwnerProxy(joe);
    System.out.println("이름 : " + ownerProxy.getName());
    ownerProxy.setInterests("볼링, 바둑");
    System.out.println("본인의 정보를 변경합니다.");
    try {
      // proxy, method, args 매개변수로 InvocationHandler의 invoke 메서드 호출
      ownerProxy.setGeekRating(10);
    } catch (Exception e) {
      System.out.println("본인의 괴짜 지수를 매길수 없습니다.");
    }
    System.out.println("괴짜지수 : " + ownerProxy.getGeekRating());

    System.out.println("\n 다른사람용 프록시객체 생성");
    Person nonOwnerProxy = getNonOwnerProxy(joe);
    System.out.println("이름 : " + nonOwnerProxy.getName());
    try {
      nonOwnerProxy.setInterests("볼링, 바둑");
    } catch (Exception e) {
      System.out.println("타인의 정보를 변경할 수 없습니다.");
    }
    nonOwnerProxy.setGeekRating(3);
    System.out.println("타인의 괴짜지수를 매깁니다.");
    System.out.println("괴짜지수 : " + nonOwnerProxy.getGeekRating());
  }

  Person getOwnerProxy(Person person) {

    return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                                           person.getClass().getInterfaces(),
                                           new OwnerInvocationHandler(person));
  }

  Person getNonOwnerProxy(Person person) {

    return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                                           person.getClass().getInterfaces(),
                                           new NonOwnerInvocationHandler(person));
  }

  Person getPersonFromDatabase(String name) {
    return (Person) datingDB.get(name);
  }

  void initializeDatabase() {
    Person joe = new PersonImpl();
    joe.setName("Joe Javabean");
    joe.setInterests("드라이브, 컴퓨터, 음악");
    joe.setGeekRating(7);
    datingDB.put(joe.getName(), joe);

    Person kelly = new PersonImpl();
    kelly.setName("Kelly Klosure");
    kelly.setInterests("쇼핑, 영화보기, 음악");
    kelly.setGeekRating(6);
    datingDB.put(kelly.getName(), kelly);
  }
}
