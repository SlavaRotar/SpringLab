package com.example.tvchannel.service;

import com.example.tvchannel.Model.Employee;
import com.example.tvchannel.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository repository;

    @Override
    public Employee create(Employee name, Employee position, Employee dob) {
        repository.save(name);
        repository.save(position);
        repository.save(dob);
        return new Employee();
    }

    @Override
    public Employee update(Long id, Employee name, Employee position, Employee dob) {
        repository.save(name);
        repository.save(position);
        repository.save(dob);
        return new Employee();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Employee getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> getAll() {
        return repository.findAll();
    }
}
