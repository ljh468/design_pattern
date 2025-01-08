package com.design.pattern._03_행동패턴._23_visitor._03_java;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class SearchFileVisitor implements FileVisitor<Path> {

  private String fileToSearch;

  private Path startingDirectory;

  public SearchFileVisitor(String fileToSearch, Path startingDirectory) {
    this.fileToSearch = fileToSearch;
    this.startingDirectory = startingDirectory;
  }

  // 디렉토리를 들어가기 전에
  @Override
  public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
    return FileVisitResult.CONTINUE;
  }

  // 파일에 접근했을 때
  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
    if (fileToSearch.equals(file.getFileName().toString())) {
      System.out.println("found " + file.getFileName());
      return FileVisitResult.TERMINATE;
    }
    return FileVisitResult.CONTINUE;
  }

  // 파일의 경로가 잘못되었을 때 (찾을 수 없을 때)
  @Override
  public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
    System.out.println("파일의 경로가 잘못됨");
    exc.printStackTrace(System.out);
    return FileVisitResult.CONTINUE;
  }

  // 디렉토리 순회를 마쳤을 때
  @Override
  public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
    if (Files.isSameFile(startingDirectory, dir)) {
      System.out.println("search end");
      return FileVisitResult.TERMINATE;
    }
    return FileVisitResult.CONTINUE;
  }
}
