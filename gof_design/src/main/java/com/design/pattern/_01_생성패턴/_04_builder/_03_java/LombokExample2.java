package com.design.pattern._01_생성패턴._04_builder._03_java;

public class LombokExample2 {

  private String title;
  private int nights;
  private int days;

  private LombokExample2(String title, int nights, int days) {
    this.title = title;
    this.nights = nights;
    this.days = days;
  }

  // static 이너클래스를 사용해서 만들어짐
  public static class LombokExampleBuilder2 {
    private String title;
    private int nights;
    private int days;

    private LombokExampleBuilder2() {
    }

    public LombokExampleBuilder2 title(String title) {
      this.title = title;
      return this;
    }

    public LombokExampleBuilder2 nights(int nights) {
      this.nights = nights;
      return this;
    }

    public LombokExampleBuilder2 days(int days) {
      this.days = days;
      return this;
    }

    public LombokExample2 build() {
      return new LombokExample2(title, nights, days);
    }
  }

  // 빌더 생성
  public static LombokExampleBuilder2 builder() {
    return new LombokExampleBuilder2();
  }

  @Override
  public String toString() {
    return "LombokExample2{" +
        "title='" + title + '\'' +
        ", nights=" + nights +
        ", days=" + days +
        '}';
  }

  // 메인 메서드
  public static void main(String[] args) {
    LombokExample2 trip = LombokExample2.builder()
                                        .title("여행")
                                        .nights(2)
                                        .days(3)
                                        .build();
    System.out.println("trip = " + trip);
  }
}