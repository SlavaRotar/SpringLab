package com.example.tvchannel.service;

import com.example.tvchannel.Model.Broadcast;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalTime;
import java.util.List;

public interface BroadcastService {
    @Autowired
    Broadcast create(Broadcast day_of_week, Broadcast content_name, Broadcast broadcast_time); // Create
    @Autowired
    Broadcast update(Long id, String day_of_week, String content_name, LocalTime broadcast_time); // Update
    @Autowired
    void deleteById(Long id); // Delete
    @Autowired
    Broadcast getById(Long id); // getById
    @Autowired
    List<Broadcast> getAll(); // getAll
}
