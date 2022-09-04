package com.example.tvchannel.Model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import javax.persistence.*;
import java.time.LocalTime;

@Schema(description = "Broadcast")
@Entity(name = "broadcast")
@Builder
public class Broadcast {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Broadcast")
    @SequenceGenerator(name = "Broadcast", sequenceName = "id", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
    private String day_of_week;
    private String content_name;
    private LocalTime broadcast_time;


    public Broadcast() {
    }

    public Broadcast(Long id, String day_of_week, String content_name, LocalTime broadcast_time) {
        this.id = id;
        this.day_of_week = day_of_week;
        this.content_name = content_name;
        this.broadcast_time = broadcast_time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(String day_of_week) {
        this.day_of_week = day_of_week;
    }

    public String getContent_name() {
        this.content_name = content_name;
        return content_name;
    }

    public void setContent_name(String content_name) {
        this.content_name = content_name;
    }

    public LocalTime getBroadcast_time() {
        return broadcast_time;
    }

    public void setBroadcast_time(LocalTime broadcast_time) {
        this.broadcast_time = broadcast_time;
    }

    @Override
    public String toString() {
        return "Broadcast{" + "DayOfWeek=" + day_of_week + ", ContentName=" + content_name + ", BroadcastTime=" + broadcast_time + '}';

    }
}
