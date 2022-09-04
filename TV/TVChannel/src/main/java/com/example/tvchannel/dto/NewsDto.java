package com.example.tvchannel.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalTime;

@Data
public class NewsDto implements Serializable {
    private final Long id;
    private final String name;
    private final String day;
    private final LocalTime airtime;
}
