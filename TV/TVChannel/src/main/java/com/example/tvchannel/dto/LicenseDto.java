package com.example.tvchannel.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class LicenseDto implements Serializable {
    private final Long id;
    private final String name;
    private final LocalDate date;
    private final Integer licenseDate;
}
