package com.example.tvchannel.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;
// Day of week
@Schema(description = " Day of week ")
@Entity(name = "DayOfWeek")
@Builder
public class DOW {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_of_day")
    @SequenceGenerator(name = "id_of_day", sequenceName = "id", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    private String day;
/*    @JsonSerialize(using = LocalTimeSerializer.class)
    @JsonDeserialize(using = LocalTimeDeserializer.class)
    private LocalTime airingTime;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "program_id") // Database
    private Show show;*/

    public DOW(Long id, String day) {
        this.id = id;
        this.day = day;
    }

    public DOW() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDay() { return day; }

    public void setDay() { this.day = day; }

/*    public LocalTime getAiringTime() {
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
    }*/

    @Override
    public String toString() {
        return "Day of week {" + "id=" + id + ", Day= " + day + '}';
    }
}

