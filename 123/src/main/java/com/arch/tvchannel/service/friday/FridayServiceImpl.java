package com.arch.tvchannel.service.friday;

import com.arch.tvchannel.dao.friday.FridayDAOImpl;
import com.arch.tvchannel.dto.day.DayDTOCreate;
import com.arch.tvchannel.dto.day.DayDTOUpdate;
import com.arch.tvchannel.model.Dow;
import com.arch.tvchannel.repository.FridayRepository;
import com.arch.tvchannel.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class FridayServiceImpl implements IFridayService {

    @Autowired
    FridayDAOImpl dao;

    @Override
    public Dow create(Dow day) {

        return dao.create(day);
    }

    @Override
    public Dow update(Dow day) {

        return dao.update(day);
    }

    @Autowired
    FridayRepository repository;

    @Autowired
    ProgramRepository programRepository;

    public Dow createDTO(DayDTOCreate request){

        Long id = (long) (repository.findAll().stream()
                .mapToInt(el -> Integer.parseInt(String.valueOf(el.getId())))
                .max()
                .orElse(0) + 1);

        var day = Dow.builder()
                .id(id)
                .airingTime(LocalTime.parse(request.getAiringTime()))
                .program(programRepository.findById(request.getProgram()).get())
                .build();

        return repository.save(day);
    }

    public Dow updateDTO(DayDTOUpdate request){

        var day = Dow.builder()
                .id(repository.findById(request.getId()).get().getId())
                .airingTime(LocalTime.parse(request.getAiringTime()))
                .program(programRepository.findById(request.getProgram()).get())
                .build();

        return repository.save(day);
    }
}
