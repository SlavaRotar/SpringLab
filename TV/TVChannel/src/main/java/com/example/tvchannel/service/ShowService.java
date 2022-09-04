package com.example.tvchannel.service;

import com.example.tvchannel.Model.Show;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ShowService {
    @Autowired
    Show create(Show name); // Create
    @Autowired
    Show update(Long id, String name); // Update
    @Autowired
    void deleteById(Long id); // Delete
    @Autowired
    Show getById(Long id); // getById
    @Autowired
    List<Show> getAll(); // getAll
}