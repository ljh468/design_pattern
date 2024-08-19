package com.design.pattern.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

  public static void main(String[] args) throws IOException {
    // 현재 작업디렉토리 확인
    System.out.println("Current working directory: " + System.getProperty("user.dir"));

    int c;
    try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("head_first_design/src/main/java/com/design/pattern/decorator/io/test.txt")))) {

      while ((c = in.read()) >= 0) {
        System.out.print((char) c);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println();
    try (InputStream in2 = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("head_first_design/src/main/java/com/design/pattern/decorator/io/test.txt")))) {
      while ((c = in2.read()) >= 0) {
        System.out.print((char) c);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
