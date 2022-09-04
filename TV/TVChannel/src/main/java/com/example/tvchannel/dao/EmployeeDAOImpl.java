package com.example.tvchannel.dao;

import com.example.tvchannel.Model.Employee;
import com.example.tvchannel.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("EmployeeDAOImpl")
public class EmployeeDAOImpl implements EmployeeDAO {
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
    public Employee update(Employee id, Employee name, Employee position, Employee dob) {
        repository.save(name);
        repository.save(position);
        repository.save(dob);
        return new Employee();
    }
}