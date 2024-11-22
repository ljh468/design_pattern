package com.design.pattern._03_행동패턴._13_chain_of_responsibilities._03_java;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

// SpringApplication에 @ServletComponentScan을 선언하면 서블릿 필터에 등록되고
// URL 패턴을 기반으로 특정 경로에 대해 전역적으로 필터링 동작을 수행 (servlet)
@WebFilter(urlPatterns = "/hello")
public class MyFilter implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    System.out.println("환영합니다.");
    chain.doFilter(request, response);
    System.out.println("잘가요.");
  }
}
