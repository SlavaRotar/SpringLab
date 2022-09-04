package com.example.tvchannel.service;

import com.example.tvchannel.Model.Cartoons;
import com.example.tvchannel.Model.Films;
import com.example.tvchannel.repository.FilmsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FilmsServiceImpl implements FilmsService {
    @Autowired
    FilmsRepository repository;
    @Override
    public Films create(Films name) {
        repository.save(name);
        return name;
    }

    @Override
    public Films update(Long id, String name) {
        return repository.save(new Films(id, name));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Films getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Films> getAll() {
        return repository.findAll();
    }
}
