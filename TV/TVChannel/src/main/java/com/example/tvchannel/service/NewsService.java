package com.example.tvchannel.service;

import com.example.tvchannel.Model.News;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface NewsService {
    @Autowired
    News create(News name, News dow, News airtime); // Create
    @Autowired
    News update(Long id, News name, News dow, News airtime); // Update
    @Autowired
    void deleteById(Long id); // Delete
    @Autowired
    News getById(Long id); // getById
    @Autowired
    List<News> getAll(); // getAll
}
