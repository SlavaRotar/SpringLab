package com.example.tvchannel.Controllers;

import com.example.tvchannel.Model.License;
import com.example.tvchannel.repository.EmployeeRepository;
import com.example.tvchannel.repository.LicenseRepository;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/License")
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "success"),
        @ApiResponse(code = 500, message = "error")
})
public class LicenseController {
    @Autowired
    LicenseRepository repository;

    @GetMapping("/get/all")
    private List<License> getAll() {
        return repository.findAll();
    }

    @GetMapping("/get/{id}")
    private License getById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @GetMapping("/delete/{id}")
    private List<License> deleteById(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/create")
    public License create(@RequestBody License name, @RequestBody License date, @RequestBody License licenseDate) {
        return null;
    }

    @PostMapping("/update")
    public License update(@RequestBody License id, @RequestBody License name, @RequestBody License date, @RequestBody License licenseDate) {
        repository.save(name);
        repository.save(date);
        repository.save(licenseDate);
        return new License();
    }
}
