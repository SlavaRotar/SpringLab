package com.example.tvchannel.service;

import com.example.tvchannel.Model.Broadcast;
import com.example.tvchannel.repository.BroadcastRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalTime;
import java.util.List;

public class BroadcastServiceImpl implements BroadcastService {
    @Autowired
    BroadcastRepository repository;
    @Override
    public Broadcast create(Broadcast day_of_week, Broadcast content_name, Broadcast broadcast_time) {
        repository.save(day_of_week);
        repository.save(content_name);
        repository.save(broadcast_time);
        return new Broadcast();
    }

    @Override
    public Broadcast update(Long id, String day_of_week, String content_name, LocalTime broadcast_time) {
        return repository.save(new Broadcast(id, day_of_week, content_name, broadcast_time));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Broadcast getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Broadcast> getAll() {
        return repository.findAll();
    }
}
