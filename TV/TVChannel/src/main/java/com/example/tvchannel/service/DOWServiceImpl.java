package com.example.tvchannel.service;

import com.example.tvchannel.Model.Cartoons;
import com.example.tvchannel.Model.DOW;
import com.example.tvchannel.repository.DOWRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DOWServiceImpl implements DOWService {
    @Autowired
    DOWRepository repository;
    @Override
    public DOW create(DOW name) {
        repository.save(name);
        return name;
    }

    @Override
    public DOW update(Long id, String name) {
        return repository.save(new DOW(id, name));
    }
    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
    @Override
    public DOW getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<DOW> getAll() {
        return repository.findAll();
    }
}
