package com.example.tvchannel.Controllers;

import com.example.tvchannel.Model.Films;
import com.example.tvchannel.repository.FilmsRepository;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/Films")
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "success"),
        @ApiResponse(code = 500, message = "error")
})
public class FilmsController {
    @Autowired
    FilmsRepository repository;
    @GetMapping("/get/all")
    private List<Films> getAll(){
        return repository.findAll();
    }

    @GetMapping("/get/{id}")
    private Films getById(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }

    @GetMapping("/delete/{id}")
    private List<Films> deleteById(@PathVariable Long id){
        return null;
    }

    @PostMapping("/create")
    public Films create(@RequestBody Films name){

        return repository.save(name);
    }

    @PostMapping("/update")
    public Films update(@RequestBody Films id, @RequestBody Films name){
        repository.save(name);
        return name;
    }
}
