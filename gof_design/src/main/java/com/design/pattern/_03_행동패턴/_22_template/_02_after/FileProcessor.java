package com.design.pattern._03_행동패턴._22_template._02_after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 템플릿을 정의하는 추상클래스
public abstract class FileProcessor {

  private String path;

  public FileProcessor(String path) {
    this.path = path;
  }

  public final int process(Operator operator) {
    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      int result = 0;
      String line = null;
      while ((line = reader.readLine()) != null) {

        // 바꿀수 있는 부분 (하위 클래스에서 결정)
        // result = getResult(result, Integer.parseInt(line));
        result = operator.getResult(result, Integer.parseInt(line));
      }
      return result;
    } catch (IOException e) {
      throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
    }
  }

  // 하위 클래스에서 변경이 가능
  protected abstract int getResult(int result, int number);

}
