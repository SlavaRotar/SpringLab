package com.example.tvchannel.Controllers;

import com.example.tvchannel.Model.News;
import com.example.tvchannel.repository.LicenseRepository;
import com.example.tvchannel.repository.NewsRepository;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "api/News")
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "success"),
        @ApiResponse(code = 500, message = "error")
})
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
            repository.save(name);
            repository.save(day);
            repository.save(airtime);
            return new News();
        }
}
