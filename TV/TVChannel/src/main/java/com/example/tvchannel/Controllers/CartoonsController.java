package com.example.tvchannel.Controllers;

import com.example.tvchannel.Model.Cartoons;
import com.example.tvchannel.repository.CartoonsRepository;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/cartoons")
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "success"),
        @ApiResponse(code = 500, message = "error")
})
public class CartoonsController {
    @Autowired
    CartoonsRepository repository;

    @GetMapping("/get/all")
    private List<Cartoons> getAll(){
    return repository.findAll();
    }

    @GetMapping("/get/{id}")
    private Cartoons getById(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }

    @GetMapping("/delete/{id}")
    private List<Cartoons> deleteById(@PathVariable Long id){
        return null;
    }

    @PostMapping("/create")
    public Cartoons create(@RequestBody Cartoons name){

        return repository.save(name);
    }

    @PostMapping("/update")
    public Cartoons update(@RequestBody Cartoons id, @RequestBody Cartoons name){
        repository.save(name);
        return new Cartoons();
    }

}
