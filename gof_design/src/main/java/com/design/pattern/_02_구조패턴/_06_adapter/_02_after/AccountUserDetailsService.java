package com.design.pattern._02_구조패턴._06_adapter._02_after;


import com.design.pattern._02_구조패턴._06_adapter._02_after.security.UserDetails;
import com.design.pattern._02_구조패턴._06_adapter._02_after.security.UserDetailsService;

// Adapter (클라이언트가 기대하는 인터페이스를 구현한 클래스)
public class AccountUserDetailsService implements UserDetailsService {

  // Adaptee
  private AccountService accountService;

  public AccountUserDetailsService(AccountService accountService) {
    this.accountService = accountService;
  }

  @Override
  public UserDetails loadUser(String username) {
    return new AccountUserDetails(accountService.findAccountByUsername(username));
  }
}
