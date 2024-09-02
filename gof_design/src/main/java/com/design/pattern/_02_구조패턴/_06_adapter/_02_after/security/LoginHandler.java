package com.design.pattern._02_구조패턴._06_adapter._02_after.security;

// 클라이언트
public class LoginHandler {

  // 타깃 인터페이스 (클라이언트가 기대하는)
  UserDetailsService userDetailsService;

  public LoginHandler(UserDetailsService userDetailsService) {
    this.userDetailsService = userDetailsService;
  }

  public String login(String username, String password) {
    UserDetails userDetails = userDetailsService.loadUser(username);
    if (userDetails.getPassword().equals(password)) {
      return userDetails.getUsername();
    } else {
      throw new IllegalArgumentException();
    }
  }
}
