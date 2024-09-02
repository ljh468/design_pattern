package com.design.pattern._02_구조패턴._06_adapter._02_after;

import com.design.pattern._02_구조패턴._06_adapter._02_after.security.UserDetails;

// Adapter (클라이언트가 기대하는 인터페이스를 구현)
public class AccountUserDetails implements UserDetails {

  // Adaptee
  private Account account;

  public AccountUserDetails(Account account) {
    this.account = account;
  }

  @Override
  public String getUsername() {
    return account.getName();
  }

  @Override
  public String getPassword() {
    return account.getPassword();
  }
}
