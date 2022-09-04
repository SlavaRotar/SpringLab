package com.example.tvchannel.service;

import com.example.tvchannel.Model.News;
import com.example.tvchannel.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NewsServiceImpl implements NewsService {
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
    public News update(Long id, News name, News dow, News airtime) {
        repository.save(name);
        repository.save(dow);
        repository.save(airtime);
        return new News();
    }

    @Override
    public void deleteById(Long id) {
    repository.deleteById(id);
    }

    @Override
    public News getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<News> getAll() {
        return repository.findAll();
    }
}
