package com.example.tvchannel.Model;
// Data about licensed content

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
@Schema(description = " License list ")
@Entity(name = "License")
@Builder
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LicenseId")
    @SequenceGenerator(name = "LicenseId", sequenceName = "id", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private LocalDate date;
    private Integer licenseDate;

    public License(Long id, String name, LocalDate date, Integer licenseDate){
        this.id = id;
        this.name = name;
        this.date = date;
        this.licenseDate = licenseDate;
    }

    public License() {
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public Integer getLicenseDate() {

        return Period.between(this.date, LocalDate.now()).getYears();
    }

    public void setLicenseDate(Integer date) {
        this.date = LocalDate.ofEpochDay(licenseDate);
    }

    @Override
    public String toString() {
        return "License {" + "id=" + id + ", name='" + name + ", date =" + date + ", license date =" + licenseDate + '}';
    }
}
