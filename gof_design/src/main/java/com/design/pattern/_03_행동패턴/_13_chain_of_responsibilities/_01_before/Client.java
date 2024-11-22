package com.design.pattern._03_행동패턴._13_chain_of_responsibilities._01_before;

public class Client {

  public static void main(String[] args) {
    Request request = new Request("무궁화 꽃이 피었습니다.");
    RequestHandler requestHandler = new AuthRequestHandler();
    // 클라이언트가 RequestHandler를 선택해야하는 문제가 생김
    requestHandler.handler(request);

    // 또 다른 처리가 필요하다면 handler를 또 만들고 호출해야함
    RequestHandler requestHandler2 = new LoggingRequestHandler();
    requestHandler2.handler(request);

    // 클라이언트가 사용해야하는 Handler를 알아야한다는게 문제!!
  }
}
