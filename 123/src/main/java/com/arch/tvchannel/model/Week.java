package com.arch.tvchannel.model;

import lombok.Builder;

import javax.persistence.*;

@Entity(name = "Week")
@Builder
public class Week {

    @Id
    private Long id;
    private String day;

    public Week() {
    }

    public Week(Long id, String day) {
        this.id = id;
        this.day = getDay();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Day{" + "id=" + id + ", Day=" + day + '}';
    }
}