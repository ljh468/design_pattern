package com.design.pattern._03_행동패턴._14_command._03_java;

import com.design.pattern._03_행동패턴._14_command._02_after.Command;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class CommandInSpring {

  private DataSource dataSource;

  public CommandInSpring(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public void add(Command command) {
    SimpleJdbcInsert insert = new SimpleJdbcInsert(dataSource)
        .withTableName("command")
        .usingGeneratedKeyColumns("id");

    Map<String, Object> data = new HashMap<>();
    data.put("name", command.getClass().getSimpleName());
    data.put("when", LocalDateTime.now());
    insert.execute(data);
  }

}
