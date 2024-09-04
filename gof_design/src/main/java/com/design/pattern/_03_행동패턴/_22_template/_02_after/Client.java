package com.design.pattern._03_행동패턴._22_template._02_after;

public class Client {

  public static void main(String[] args) {
    System.out.println(System.getProperty("user.dir"));
    FileProcessor fileProcessor = new Multiply("gof_design/src/main/java/com/design/pattern/_03_행동패턴/_22_template/number.txt");
    // int result = fileProcessor.process();

    // 템플릿 메서드 콜백 패턴 적용 (람다식 적용)
    int result = fileProcessor.process((sum, number) -> sum += number);
    System.out.println(result);
  }
}
