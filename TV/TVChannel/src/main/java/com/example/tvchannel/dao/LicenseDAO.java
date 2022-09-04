package com.example.tvchannel.dao;

import com.example.tvchannel.Model.License;
import org.springframework.stereotype.Service;

@Service
public interface LicenseDAO {
    License create(License name, License date, License licenseDate);
    License update(License id, License name, License date, License licenseDate);
}
