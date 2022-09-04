package com.arch.tvchannel.service.program;

import com.arch.tvchannel.dao.program.ProgramDAOImpl;
import com.arch.tvchannel.dto.program.ProgramDTOCreate;
import com.arch.tvchannel.dto.program.ProgramDTOUpdate;
import com.arch.tvchannel.model.Show;
import com.arch.tvchannel.model.Type;
import com.arch.tvchannel.repository.ProgramRepository;
import com.arch.tvchannel.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class ProgramServiceImpl implements IProgramService {

    @Autowired
    ProgramDAOImpl dao;

    @Autowired
    ProgramRepository repository;

    @Autowired
    TypeRepository typeRepository;

    @Override
    public Show create(Show show) {

        return dao.create(show);
    }

    @Override
    public Show update(Show show) {

        return dao.update(show);
    }

    public Show createDTO(ProgramDTOCreate request){

        Long id = (long) (repository.findAll().stream()
                .mapToInt(el -> Integer.parseInt(String.valueOf(el.getId())))
                .max()
                .orElse(0) + 1);

        var program = Show.builder()
                .id(id)
                .name(request.getName())
                .type(typeRepository.findById(request.getType()).get())
                .monday(new HashSet<>())
                .tuesday(new HashSet<>())
                .wednesday(new HashSet<>())
                .thursday(new HashSet<>())
                .friday(new HashSet<>())
                .saturday(new HashSet<>())
                .sunday(new HashSet<>())
                .build();

        return repository.save(program);
    }

    public Show updateDTO(ProgramDTOUpdate request){

        var program = Show.builder()
                .id(repository.findById(request.getId()).get().getId())
                .name(request.getName())
                .type(typeRepository.findById(request.getType()).get())
                .monday(new HashSet<>())
                .tuesday(new HashSet<>())
                .wednesday(new HashSet<>())
                .thursday(new HashSet<>())
                .friday(new HashSet<>())
                .saturday(new HashSet<>())
                .sunday(new HashSet<>())
                .build();

        return repository.save(program);
    }
}
