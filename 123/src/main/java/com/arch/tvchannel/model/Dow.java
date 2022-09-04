package com.arch.tvchannel.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import lombok.Builder;

import javax.persistence.*;
import java.time.LocalTime;

@Entity(name = "Days")
@Builder
public class Dow {

    @Id
    private Long id;
    private String day;
    @JsonSerialize(using = LocalTimeSerializer.class)
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    private LocalTime airingTime;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "program_id")
    private Show show;

    public Dow() {
    }

    public Dow(Long id, LocalTime airingTime,String day, Show show) {
        this.id = id;
        this.day = day;
        this.airingTime = airingTime;
        this.show = show;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDay() { return day; }

    public void setDay() { this.day = day; }

    public LocalTime getAiringTime() {
        return airingTime;
    }

    public void setAiringTime(LocalTime airingTime) {
        this.airingTime = airingTime;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "Day of week {" +
                "id=" + id + ", Day= " + day + ", airingTime=" + airingTime + ", show=" + show + '}';
    }
}