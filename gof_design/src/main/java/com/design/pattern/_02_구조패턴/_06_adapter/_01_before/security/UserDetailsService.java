package com.design.pattern._02_구조패턴._06_adapter._01_before.security;

public interface UserDetailsService {

  UserDetails loadUser(String username);

}
