package com.arch.tvchannel.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;

@Entity(name = "wednesday")
@Builder
public class Wednesday {

    @Id
    private Long id;

    @JsonSerialize(using = LocalTimeSerializer.class)
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    private LocalTime airingTime;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "program_id")
    private Show show;

    public Wednesday() {
    }

    public Wednesday(Long id, LocalTime airingTime, Show show) {
        this.id = id;
        this.airingTime = airingTime;
        this.show = show;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getAiringTime() {
        return airingTime;
    }

    public void setAiringTime(LocalTime airingTime) {
        this.airingTime = airingTime;
    }

    public Show getProgram() {
        return show;
    }

    public void setProgram(Show show) {
        this.show = show;
    }

    @Override
    public String toString() {
        return "Wednesday{" +
                "id=" + id +
                ", airingTime=" + airingTime +
                ", show=" + show +
                '}';
    }
}
