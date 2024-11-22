package com.design.pattern._03_행동패턴._13_chain_of_responsibilities._03_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.ExceptionTranslationFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    // 시큐리티 필터 체인을 설정하는 부분
    http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());

    // LogFilter를 UsernamePasswordAuthenticationFilter 전에 동작하도록 추가
    // http.addFilterBefore(new LogFilter(), UsernamePasswordAuthenticationFilter.class);

    // LogFilter를 ExceptionTranslationFilter 다음에 동작하도록 추가
    // http.addFilterAfter(new LogFilter(), ExceptionTranslationFilter.class);

    return http.build();
  }

}
