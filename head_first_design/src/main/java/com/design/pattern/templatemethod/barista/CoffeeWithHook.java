package com.design.pattern.templatemethod.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

  public void brew() {
    System.out.println("Dripping Coffee through filter");
  }

  public void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }

  @Override
  public boolean customerWantsCondiments() {
    String answer = getUserInput(); // 첨가물을 넣을지 안 넣을지 y/n
    if (answer.toLowerCase().startsWith("y")) {
      return true;
    } else {
      return false;
    }
  }

  private String getUserInput() {
    String answer = null;

    System.out.print("Would you like milk and sugar with your coffee (y/n)? ");


    try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
      answer = in.readLine();
    } catch (IOException ioException) {
      System.out.println("ioException = " + ioException);
    }
    if (answer == null) {
      return "no";
    }
    return answer;
  }
}
