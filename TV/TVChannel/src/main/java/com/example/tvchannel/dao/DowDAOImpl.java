package com.example.tvchannel.dao;

import com.example.tvchannel.Model.DOW;
import com.example.tvchannel.repository.DOWRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("DowDAOImpl")
public class DowDAOImpl implements DowDAO {
    @Autowired
    DOWRepository repository;
    @Override
    public DOW create(DOW name) {
        repository.save(name);
        return new DOW();
    }

    @Override
    public DOW update(DOW id, DOW name) {
        repository.save(id);
        repository.save(name);
    return new DOW();
    }
}
