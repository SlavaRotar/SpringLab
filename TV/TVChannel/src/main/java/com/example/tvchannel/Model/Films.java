package com.example.tvchannel.Model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import javax.persistence.*;

@Schema(description = " Film list ")
@Entity(name = "Films")
@Builder
public class Films {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FilmId")
    @SequenceGenerator(name = "FilmId", sequenceName = "id", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    public Films(Long id, String name){
        this.id = id;
        this.name = name;
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

    public Films() {

    }
}
