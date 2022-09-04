package com.arch.tvchannel.controller.rest;

import com.arch.tvchannel.dto.program.ProgramDTOCreate;
import com.arch.tvchannel.dto.program.ProgramDTOUpdate;
import com.arch.tvchannel.model.Show;
import com.arch.tvchannel.model.Type;
import com.arch.tvchannel.repository.ProgramRepository;
import com.arch.tvchannel.repository.TypeRepository;
import com.arch.tvchannel.service.program.ProgramServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/program")
public class ProgramController {

    @Autowired
    TypeRepository typeRepository;

    @Autowired
    ProgramRepository programRepository;

    @Autowired
    ProgramServiceImpl service;

    @GetMapping("/get/all")
    private List<Show> getAll(){

        Show show = new Show(1L, "qweewq", typeRepository.getById(1L));
        programRepository.save(show);

        return programRepository.findAll();
    }

    @GetMapping("/get/{id}")
    private Show getById(@PathVariable Long id){

        return programRepository.findById(id).orElse(null);
    }

    @GetMapping("/delete/{id}")
    private List<Show> deleteById(@PathVariable Long id){

        programRepository.deleteById(id);

        return programRepository.findAll();
    }

    @PostMapping("/create")
    public Show create(@RequestBody Show show){

        return service.create(show);
    }

    @PostMapping("/update")
    public Show update(@RequestBody Show show){

        return service.update(show);
    }

    @Operation(summary = " DTO Show creation",
            description = " Adds new show to the Show list. Id to be created is UUID type ")
    @PostMapping("/createDTO")
    public Show createDTO(@RequestBody ProgramDTOCreate program){

        return service.createDTO(program);
    }

    @Operation(summary = " DTO Show updating",
            description = " Updates Show with specified id")
    @PostMapping("/updateDTO")
    public Show updateDTO(@RequestBody ProgramDTOUpdate program){

        return service.updateDTO(program);
    }
}
