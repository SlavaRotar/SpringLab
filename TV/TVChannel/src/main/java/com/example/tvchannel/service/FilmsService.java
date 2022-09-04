package com.example.tvchannel.service;

import com.example.tvchannel.Model.Films;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface FilmsService {
    @Autowired
    Films create(Films name); // Create
    @Autowired
    Films update(Long id, String name); // Update
    @Autowired
    void deleteById(Long id); // Delete
    @Autowired
    Films getById(Long id); // getById
    @Autowired
    List<Films> getAll(); // getAll
}
