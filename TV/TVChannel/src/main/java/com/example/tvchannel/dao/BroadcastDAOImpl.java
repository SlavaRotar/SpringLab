package com.example.tvchannel.dao;

import com.example.tvchannel.Model.Broadcast;
import com.example.tvchannel.repository.BroadcastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("Broadcast")
public class BroadcastDAOImpl implements BroadcastDAO {
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
    public Broadcast update(Broadcast id, Broadcast day_of_week, Broadcast content_name, Broadcast broadcast_time) {
        repository.save(id);
        repository.save(day_of_week);
        repository.save(content_name);
        repository.save(broadcast_time);
        return new Broadcast();
    }
}
