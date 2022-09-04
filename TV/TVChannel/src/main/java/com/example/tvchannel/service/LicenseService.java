package com.example.tvchannel.service;

import com.example.tvchannel.Model.License;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface LicenseService {
    @Autowired
    License create(License name, License date, License licenseDate); // Create
    @Autowired
    License update(Long id, License name, License date, License licenseDate); // Update
    @Autowired
    void deleteById(Long id); // Delete
    @Autowired
    License getById(Long id); // getById
    @Autowired
    List<License> getAll(); // getAll
}
