package com.example.tvchannel.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class DOWDto implements Serializable {
    private final Long id;
    private final String day;
}
