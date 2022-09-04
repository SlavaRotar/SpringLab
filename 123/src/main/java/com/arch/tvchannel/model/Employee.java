package com.arch.tvchannel.model;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

public class Employee {
    @Schema(description = "auto-generated id")
    @Id
    @SequenceGenerator(
            name = "Employee_sequence",
            sequenceName = "Employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Employee_sequence"
    )
    private Long id;
    private String name;
    private String position;
    private LocalDate dob;
    @Transient
    private Integer age;

    public Employee(String name, String position, LocalDate dob, Integer age) {
        this.name = name;
        this.position = position;
        this.dob = dob;
        this.age = age;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {

        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
