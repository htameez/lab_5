package org.example.cs5328_lab3.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.example.cs5328_lab3.service.EmployeeService;
import org.example.cs5328_lab3.model.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employee> getEmployees() {
        return service.getAllEmployees();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return service.saveEmployee(employee);
    }
}