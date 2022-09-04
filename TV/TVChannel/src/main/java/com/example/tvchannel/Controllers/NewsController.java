package com.example.tvchannel.Controllers;

import com.example.tvchannel.Model.News;
import com.example.tvchannel.repository.LicenseRepository;
import com.example.tvchannel.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "api/News")
public class NewsController {
        @Autowired
        NewsRepository repository;

        @GetMapping("/get/all")
        private List<News> getAll() {
            return repository.findAll();
        }

        @GetMapping("/get/{id}")
        private News getById(@PathVariable Long id) {
            return repository.findById(id).orElse(null);
        }

        @GetMapping("/delete/{id}")
        private List<News> deleteById(@PathVariable Long id) {
            return null;
        }

        @PostMapping("/create")
        public News create(@RequestBody News name, @RequestBody News day, @RequestBody News airtime) {
            return null;
        }

        @PostMapping("/update")
        public News update(@RequestBody News id, @RequestBody News name, @RequestBody News day, @RequestBody News airtime) {
            return null;
        }
}
