package com.example.tvchannel.dao;

import com.example.tvchannel.Model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeDAO {
    Employee create (Employee name, Employee position, Employee dob);
    Employee update(Employee id, Employee name, Employee position, Employee dob);
}
