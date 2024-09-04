package com.design.pattern._03_행동패턴._22_template._01_before;

public class Client {

  public static void main(String[] args) {
    System.out.println(System.getProperty("user.dir"));
    FileProcessor fileProcessor = new FileProcessor("gof_design/src/main/java/com/design/pattern/_03_행동패턴/_22_template/number.txt");
    int result = fileProcessor.process();
    System.out.println(result);
  }
}
