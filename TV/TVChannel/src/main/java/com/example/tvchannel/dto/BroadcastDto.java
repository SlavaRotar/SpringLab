package com.example.tvchannel.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalTime;

@Data
public class BroadcastDto implements Serializable {
    private final Long id;
    private final String day_of_week;
    private final String content_name;
    private final LocalTime broadcast_time;
}
