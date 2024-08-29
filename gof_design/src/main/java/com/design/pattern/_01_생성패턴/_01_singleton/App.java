package com.design.pattern._01_생성패턴._01_singleton;

import java.io.*;

public class App {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    // enum은 하나의 객체만을 보장하므로 enum 싱글톤 객체를 가져와서 사용할 수 있음
    Singleton5 instance1 = Singleton5.INSTANCE;
    instance1.doSomething();
    /**
     * 파이
     */
    Singleton5 instance2 = null;
    // 직렬화해서 파일 생성
    try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
      out.writeObject(instance1);
    }
    // 역렬화해서 파일 읽기 (생성자를 통해서 인스턴스를 만들어줌)
    try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
      instance2 = (Singleton5) in.readObject();
    }

    System.out.println(instance1 == instance2);
  }

}
