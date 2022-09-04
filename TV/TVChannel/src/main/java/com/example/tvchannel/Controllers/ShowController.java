package com.example.tvchannel.Controllers;

import com.example.tvchannel.Model.Show;
import com.example.tvchannel.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/Show")
public class ShowController {
    @Autowired
    ShowRepository repository;
    @GetMapping("/get/all")
    private List<Show> getAll(){
        return repository.findAll();
    }

    @GetMapping("/get/{id}")
    private Show getById(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }

    @GetMapping("/delete/{id}")
    private List<Show> deleteById(@PathVariable Long id){
        return null;
    }

    @PostMapping("/create")
    public Show create(@RequestBody Show name){

        return repository.save(name);
    }

    @PostMapping("/update")
    public Show update(@RequestBody Show id, @RequestBody Show name){
        repository.save(name);
        return name;
    }
}
