package com.design.pattern._03_행동패턴._13_chain_of_responsibilities._02_after;

import com.design.pattern._03_행동패턴._13_chain_of_responsibilities._01_before.Request;

public class AuthRequestHandler extends RequestHandler {

  public AuthRequestHandler(RequestHandler nextHandler) {
    super(nextHandler);
  }

  @Override
  public void handle(Request request) {
    // 조건에 따라 처리하지 않고 다음 체인으로 넘길수도 있음
    System.out.println("인증이 되었는가?");

    super.handle(request);
    // 다른 체인을 갔다 온 다음에 또 처리를 할 수 도 있음
  }
}
