package com.design.pattern._03_행동패턴._13_chain_of_responsibilities._02_after;

import com.design.pattern._03_행동패턴._13_chain_of_responsibilities._01_before.Request;

public abstract class RequestHandler {

  // 추가적인 Handler를 연결하기 위해 Composition함
  private RequestHandler nextHandler;

  public RequestHandler(RequestHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public void handle(Request request) {
    if (nextHandler != null) {
      nextHandler.handle(request);
    }
  }
}
