package com.example.tvchannel.Model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import javax.persistence.*;
import java.util.List;

@Schema(description = " Cartoon show ")
@Entity(name = "Cartoons")
@Builder
public class Cartoons {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CartoonId")
    @SequenceGenerator(name = "CartoonId", sequenceName = "id", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    public Cartoons(Long id, String name){
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

    public Cartoons() {

    }
}
