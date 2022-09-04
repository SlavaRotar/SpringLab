package com.example.tvchannel.service;

import com.example.tvchannel.Model.Cartoons;
import com.example.tvchannel.repository.CartoonsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class CartoonsServiceImpl implements CartoonsService{
    @Autowired
    CartoonsRepository repository;
    @Override
    public Cartoons create(Cartoons name) {
        repository.save(name);
        return name;
    }

    @Override
    public Cartoons update(Long id, String name) {
        return repository.save(new Cartoons(id, name));

    }
    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
    @Override
    public Cartoons getById(Long id) {
        return repository.findById(id).orElse(null);
    }
    @Override
    public List<Cartoons> getAll() {
        return repository.findAll();
    }
}
