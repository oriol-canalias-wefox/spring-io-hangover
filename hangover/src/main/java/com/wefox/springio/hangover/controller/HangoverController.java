package com.wefox.springio.hangover.controller;

import com.wefox.springio.hangover.repository.EmployeeRepository;
import com.wefox.springio.hangover.domain.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("hangover")
public class HangoverController {
  private final EmployeeRepository employeeRepository;

  @GetMapping
  public Iterable<Employee> getAll() {
    return employeeRepository.findAll();
  }

}
