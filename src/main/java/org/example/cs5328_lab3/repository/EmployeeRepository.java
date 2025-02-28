package org.example.cs5328_lab3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.cs5328_lab3.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
