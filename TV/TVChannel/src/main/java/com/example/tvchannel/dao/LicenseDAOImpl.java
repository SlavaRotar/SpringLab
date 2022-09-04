package com.example.tvchannel.dao;

import com.example.tvchannel.Model.License;
import com.example.tvchannel.repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("LicenseDAOImpl")
public class LicenseDAOImpl implements LicenseDAO {
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
    public License update(License id, License name, License date, License licenseDate) {
        repository.save(id);
        repository.save(name);
        repository.save(date);
        repository.save(licenseDate);
        return new License();
    }
}
