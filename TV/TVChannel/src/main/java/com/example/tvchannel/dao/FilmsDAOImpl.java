package com.example.tvchannel.dao;

import com.example.tvchannel.Model.Films;
import com.example.tvchannel.repository.FilmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("FilmsDAOImpl")
public class FilmsDAOImpl implements FilmsDAO {
    @Autowired
    FilmsRepository repository;

    @Override
    public Films create(Films name) {
        repository.save(name);
        return name;
    }
    @Override
    public Films update(Films id, Films name) {
        repository.save(name);
        return name;
    }
}
