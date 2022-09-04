package com.arch.tvchannel.dao.program;

import com.arch.tvchannel.model.Show;
import com.arch.tvchannel.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramDAOImpl implements IProgramDAO {

    @Autowired
    ProgramRepository repository;

    @Override
    public Show create(Show show) {

        Long id = (long) (repository.findAll().stream()
                .mapToInt(el -> Integer.parseInt(String.valueOf(el.getId())))
                .max()
                .orElse(0) + 1);

        show.setId(id);

        repository.save(show);
        return show;
    }

    @Override
    public Show update(Show show) {

        show.setId(show.getId());

        repository.save(show);
        return show;
    }
}
