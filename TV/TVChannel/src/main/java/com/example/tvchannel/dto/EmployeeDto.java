package com.example.tvchannel.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class EmployeeDto implements Serializable {
    private final Long id;
    private final String name;
    private final String position;
    private final LocalDate dob;
}
