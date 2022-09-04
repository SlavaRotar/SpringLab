package com.example.tvchannel.Model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
// List of employee
@Schema(description = " Employee list ")
@Entity(name = "Employee")
@Builder
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

    public Employee(Long id, String name, String position, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.dob = dob;
        this.age = age;
    }

    public Employee() {
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

    @Override
    public String toString() {
        return "Employee {" + "id=" + id + ", name='" + name + ", position=" + position + ", dob=" + dob + ", age=" + age + '}';
    }
}
