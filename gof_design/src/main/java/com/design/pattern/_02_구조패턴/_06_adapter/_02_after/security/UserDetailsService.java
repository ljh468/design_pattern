package com.design.pattern._02_구조패턴._06_adapter._02_after.security;

// 클라이언트가 기대하는 타깃 인터페이스
public interface UserDetailsService {

  UserDetails loadUser(String username);

}
