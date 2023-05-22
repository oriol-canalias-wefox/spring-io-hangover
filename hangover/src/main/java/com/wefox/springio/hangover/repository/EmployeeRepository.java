package com.wefox.springio.hangover.repository;

import com.wefox.springio.hangover.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
