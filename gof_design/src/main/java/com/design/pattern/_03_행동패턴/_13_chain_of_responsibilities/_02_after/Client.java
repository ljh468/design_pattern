package com.design.pattern._03_행동패턴._13_chain_of_responsibilities._02_after;

import com.design.pattern._03_행동패턴._13_chain_of_responsibilities._01_before.Request;

public class Client {

  private RequestHandler requestHandler;

  public Client(RequestHandler requestHandler) {
    this.requestHandler = requestHandler;
  }

  public void doWork() {
    Request request = new Request("이번 놀이는 뽑기입니다.");
    requestHandler.handle(request);
  }

  public static void main(String[] args) {
    // 체인으로 연결된 형태로 만듬
    RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));
    Client client = new Client(chain);
    client.doWork();
  }
}
