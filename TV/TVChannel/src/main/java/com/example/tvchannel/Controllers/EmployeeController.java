package com.example.tvchannel.Controllers;

import com.example.tvchannel.Model.Employee;
import com.example.tvchannel.repository.EmployeeRepository;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/Employee")
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "success"),
        @ApiResponse(code = 500, message = "error")
})
public class EmployeeController {
    @Autowired
    EmployeeRepository repository;

    @GetMapping("/get/all")
    private List<Employee> getAll(){
    return repository.findAll();
    }

    @GetMapping("/get/{id}")
    private Employee getById(@PathVariable Long id){
    return repository.findById(id).orElse(null);
    }

    @GetMapping("/delete/{id}")
    private List<Employee> deleteById(@PathVariable Long id){
    return null;
    }

    @PostMapping("/create")
    public Employee create(@RequestBody Employee name, @RequestBody Employee position, @RequestBody Employee dob){
        return null;
    }

    @PostMapping("/update")
    public Employee update(@RequestBody Employee id, @RequestBody Employee name, @RequestBody Employee position, @RequestBody Employee dob){
    return null;
    }
}
