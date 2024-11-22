package com.design.pattern._03_행동패턴._13_chain_of_responsibilities._03_java;

import jakarta.servlet.*;

import java.io.IOException;

public class LogFilter implements Filter {

  @Override
  public void doFilter(ServletRequest request,
                       ServletResponse response,
                       FilterChain chain) throws IOException,
                                                 ServletException {
    System.out.println("로그를 찍음");
    chain.doFilter(request, response);
  }
}
