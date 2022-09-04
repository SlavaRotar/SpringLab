package com.example.tvchannel.dao;

import com.example.tvchannel.Model.News;
import com.example.tvchannel.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("NewsDAOImpl")
public class NewsDAOImpl implements NewsDAO {
    @Autowired
    NewsRepository repository;
    @Override
    public News create(News name, News dow, News airtime) {
        repository.save(name);
        repository.save(dow);
        repository.save(airtime);
        return new News();
    }

    @Override
    public News update(News id, News name, News dow, News airtime) {
        repository.save(id);
        repository.save(name);
        repository.save(dow);
        repository.save(airtime);
        return new News();
    }
}
