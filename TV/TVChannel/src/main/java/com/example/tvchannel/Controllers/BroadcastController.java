package com.example.tvchannel.Controllers;

import com.example.tvchannel.Model.Broadcast;
import com.example.tvchannel.repository.BroadcastRepository;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/broadcast")
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "success"),
        @ApiResponse(code = 500, message = "error")
})
public class BroadcastController {
    @Autowired
    BroadcastRepository repository;
    @GetMapping("/get/all")
    private List<Broadcast> getAll(){
        return repository.findAll();
    }

    @GetMapping("/get/{id}")
    private Broadcast getById(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }

    @GetMapping("/delete/{id}")
    private List<Broadcast> deleteById(@PathVariable Long id){
        return null;
    }

    @PostMapping("/create")
    public Broadcast create(@RequestBody Broadcast name){

        return repository.save(name);
    }

    @PostMapping("/update")
    public Broadcast update(@RequestBody Broadcast id, @RequestBody Broadcast day_of_week,
                            @RequestBody Broadcast content_name, Broadcast broadcast_time){
        repository.save(day_of_week);
        repository.save(content_name);
        repository.save(broadcast_time);
        return new Broadcast();
    }
}
