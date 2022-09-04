package com.example.tvchannel.service;

import com.example.tvchannel.Model.DOW;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface DOWService {
        @Autowired
        DOW create(DOW name); // Create
        @Autowired
        DOW update(Long id, String name); // Update
        @Autowired
        void deleteById(Long id); // Delete
        @Autowired
        DOW getById(Long id); // getById
        @Autowired
        List<DOW> getAll(); // getAll
}
