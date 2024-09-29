package com.design.pattern._02_구조패턴._07_bridge._03_java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jExample {

  private static Logger logger = LoggerFactory.getLogger(Slf4jExample.class);

  public static void main(String[] args) {
    logger.info("hello logger");
  }
}
