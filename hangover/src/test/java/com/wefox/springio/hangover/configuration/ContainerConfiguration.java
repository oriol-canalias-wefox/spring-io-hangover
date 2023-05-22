package com.wefox.springio.hangover.configuration;

import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testcontainers.containers.PostgreSQLContainer;

@Configuration
public class ContainerConfiguration {

  @Bean
  @ServiceConnection
  public PostgreSQLContainer postgreSQLContainer() {
    return new PostgreSQLContainer("postgres");
  }
}
