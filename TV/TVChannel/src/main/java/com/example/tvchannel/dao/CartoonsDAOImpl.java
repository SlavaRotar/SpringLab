package com.example.tvchannel.dao;

import com.example.tvchannel.Model.Cartoons;
import com.example.tvchannel.repository.CartoonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("CartoonsDAOImpl")
public class CartoonsDAOImpl implements CartoonsDAO {

   @Autowired
   CartoonsRepository repository;

    @Override
    public Cartoons create(Cartoons name) {
        repository.save(name);
        return new Cartoons();
    }

    @Override
    public Cartoons update(Cartoons id, Cartoons name) {
        repository.save(name);
        return new Cartoons();
    }
}
