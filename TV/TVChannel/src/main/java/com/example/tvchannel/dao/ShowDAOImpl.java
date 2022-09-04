package com.example.tvchannel.dao;

import com.example.tvchannel.Model.Show;
import com.example.tvchannel.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("ShowDAOImpl")
public class ShowDAOImpl implements ShowDAO {
    @Autowired
    ShowRepository repository;
    @Override
    public Show create(Show name) {
        repository.save(name);
        return new Show();
    }

    @Override
    public Show update(Show id, Show name) {
        repository.save(name);
        return new Show();
    }
}
