package com.example.tvchannel.service;

import com.example.tvchannel.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface EmployeeService {
    @Autowired
    Employee create(Employee name, Employee position, Employee dob); // Create
    @Autowired
    Employee update(Long id, Employee name, Employee position, Employee dob); // Update
    @Autowired
    void deleteById(Long id); // Delete
    @Autowired
    Employee getById(Long id); // getById
    @Autowired
    List<Employee> getAll(); // getAll
}
