package com.example.tvchannel.Model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Schema(description = " News program ")
@Entity(name = "News")
@Builder
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NewsId")
    @SequenceGenerator(name = "NewsId", sequenceName = "id", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String day;
    private LocalTime airtime;

    public News(Long id, String name, String day, LocalTime airtime){
        this.id = id;
        this.name = name;
        this.day = day;
        this.airtime = airtime;
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


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }


    public LocalTime getAirTime() {
        return airtime;
    }

    public void setAirTime(LocalTime airTime) {
        this.airtime = airTime;
    }

    public News() {
    }
}
