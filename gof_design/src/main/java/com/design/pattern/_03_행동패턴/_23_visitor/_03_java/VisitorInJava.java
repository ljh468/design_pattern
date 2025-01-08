package com.design.pattern._03_행동패턴._23_visitor._03_java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VisitorInJava {

  public static void main(String[] args) throws IOException {
    Path startingDirectory = Path.of("/Users/noah/project/design_pattern/gof_design/");
    SearchFileVisitor searchFileVisitor =
        new SearchFileVisitor("Triangle.java", startingDirectory);
    Files.walkFileTree(startingDirectory, searchFileVisitor);
  }
}
