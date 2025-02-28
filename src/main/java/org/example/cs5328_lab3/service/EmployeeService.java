package org.example.cs5328_lab3.service;

import org.springframework.stereotype.Service;
import java.util.List;
import org.example.cs5328_lab3.model.Employee;
import org.example.cs5328_lab3.repository.EmployeeRepository;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }
}
