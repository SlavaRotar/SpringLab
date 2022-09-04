package com.example.tvchannel.Controllers;

import com.example.tvchannel.Model.DOW;
import com.example.tvchannel.repository.DOWRepository;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/DOW")
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "success"),
        @ApiResponse(code = 500, message = "error")
})
public class DOWController {
    @Autowired
    DOWRepository repository;

    @GetMapping("/get/all")
    private List<DOW> getAll() {
        return repository.findAll();
    }

    @GetMapping("/get/{id}")
    private DOW getById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @GetMapping("/delete/{id}")
    private List<DOW> deleteById(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/create")
    public DOW create(@RequestBody DOW name) {
        return repository.save(name);
    }

    @PostMapping("/update")
    public DOW update(@RequestBody DOW id, @RequestBody DOW name) {
        return repository.save(name);
    }
}
