package com.design.pattern._02_구조패턴._06_adapter._02_after;

import com.design.pattern._02_구조패턴._06_adapter._02_after.security.LoginHandler;
import com.design.pattern._02_구조패턴._06_adapter._02_after.security.UserDetailsService;

public class App {

  public static void main(String[] args) {
    AccountService accountService = new AccountService();

    // 어댑터를 활용해서 AccountService -> UserDetailsService로 변환
    UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);

    // 클라이언트
    LoginHandler loginHandler = new LoginHandler(userDetailsService);
    String login = loginHandler.login("jeahoon", "jeahoon");
    System.out.println(login);
  }
}
