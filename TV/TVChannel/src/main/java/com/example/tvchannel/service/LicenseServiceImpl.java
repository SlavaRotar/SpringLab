package com.example.tvchannel.service;

import com.example.tvchannel.Model.License;
import com.example.tvchannel.repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LicenseServiceImpl implements LicenseService {
    @Autowired
    LicenseRepository repository;
    @Override
    public License create(License name, License date, License licenseDate) {
        repository.save(name);
        repository.save(date);
        repository.save(licenseDate);
        return new License();

    }

    @Override
    public License update(Long id, License name, License date, License licenseDate) {
        repository.save(name);
        repository.save(date);
        repository.save(licenseDate);
        return new License();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public License getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<License> getAll() {
        return repository.findAll();
    }
}
