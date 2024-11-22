package com.design.pattern._03_행동패턴._13_chain_of_responsibilities._03_java;

import jakarta.servlet.*;

import java.io.IOException;

public class CoRInJava {

  public static void main(String[] args) {
    Filter filter = new Filter() {
      @Override
      public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // TODO 전처리
        chain.doFilter(request, response);
        // TODO 후처리
      }
    };
  }
}
