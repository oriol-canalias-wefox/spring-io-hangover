package com.wefox.springio.hangover;

import com.wefox.springio.hangover.configuration.ContainerConfiguration;
import org.springframework.boot.SpringApplication;

public class TestHangoverApplication {

  public static void main(String[] args) {
    SpringApplication
        .from(HangoverApplication::main)
        .with(ContainerConfiguration.class)
        .run(args);
  }
}
