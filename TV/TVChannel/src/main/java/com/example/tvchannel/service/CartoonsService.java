package com.example.tvchannel.service;


import com.example.tvchannel.Model.Cartoons;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public interface CartoonsService {
    @Autowired
     Cartoons create(Cartoons name); // Create
    @Autowired
    Cartoons update(Long id, String name); // Update
    @Autowired
    void deleteById(Long id); // Delete
    @Autowired
    Cartoons getById(Long id); // getById
    @Autowired
    List<Cartoons> getAll(); // getAll

}
