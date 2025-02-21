package com.design.pattern._01_생성패턴._01_singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

  public static void main(String[] args) throws IOException,
                                                ClassNotFoundException,
                                                NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

    // ##########################################################################
    System.out.println("1. 리플랙션으로 싱글톤을 깨뜨릴 수 있음");
    Singleton4 singleton1 = Singleton4.getInstance();

    // 리플랙션을 통해 생성자 접근
    Constructor<Singleton4> constructor = Singleton4.class.getDeclaredConstructor();
    constructor.setAccessible(true);
    Singleton4 singleton2 = constructor.newInstance();
    System.out.println(singleton1 == singleton2
                           ? "singleton1과 singleton2는 같음"
                           : "singleton1과 singleton2는 다름");
    System.out.println();
    // ##########################################################################

    System.out.println("2. enum은 싱글톤을 깨뜨릴 수 없음");
    Singleton5 singleton3 = Singleton5.INSTANCE;
    /**
     * enum은 리플랙션에서 생성자에 접근할 수 없게 막아둠 - Cannot reflective creat enum objects 에러 발생
     * enum은 하나의 객체만을 보장하므로 enum 싱글톤 객체를 가져와서 사용할 수 있음
     *
     * Constructor<Singleton5> constructor2 = Singleton5.class.getDeclaredConstructor();
     * constructor2.setAccessible(true);
     * Singleton5 singleton4 = constructor2.newInstance();
     * System.out.println(singleton3 == singleton4);
     * singleton3.doSomething();
     */

    // 직렬화, 역직렬화해도 싱글톤이 유지됨
    Singleton5 singleton4 = null;
    // singleton3 인스턴스를 직렬화해서 파일 생성
    try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
      out.writeObject(singleton3);
    }
    // 역렬화해서 파일 읽기 (생성자를 통해서 인스턴스를 만들어줌)
    try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
      singleton4 = (Singleton5) in.readObject();
    }

    System.out.println(singleton3 == singleton4
                           ? "singleton3과 singleton4는 같음"
                           : "singleton3과 singleton4는 다름");
  }

}
