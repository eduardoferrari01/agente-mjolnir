package br.com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AgenteMjolnirApplication {


  public static void main(String[] args) {
    SpringApplication.run(AgenteMjolnirApplication.class, args);
  }
}
