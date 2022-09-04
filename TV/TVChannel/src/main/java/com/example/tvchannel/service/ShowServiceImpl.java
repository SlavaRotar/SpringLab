package com.example.tvchannel.service;


import com.example.tvchannel.Model.Show;
import com.example.tvchannel.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShowServiceImpl implements ShowService {
    @Autowired
    ShowRepository repository;
    @Override
    public Show create(Show name) {
        repository.save(name);
        return name;
    }

    @Override
    public Show update(Long id, String name) {
        return repository.save(new Show(id, name));
    }
    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Show getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Show> getAll() {
        return repository.findAll();
    }
}
