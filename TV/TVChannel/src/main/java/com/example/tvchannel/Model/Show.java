package com.example.tvchannel.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

import javax.persistence.*;
import java.util.Set;
// List of all shows
@Schema(description = " Show list ")
@Entity(name = "Show")
@Builder
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Show_id")
    @SequenceGenerator(name = "Show_id", sequenceName = "id", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Schema(description = " Show ", example = "Friends")
    private String name;

/*    @JsonManagedReference
    @ManyToOne*//*(mappedBy = "show", fetch = FetchType.EAGER)*//*
    private Show show;*/

    public Show(Long id, String name/*, Show show*/) {
        this.id = id;
        this.name = name;
       /* this.show = show;*/
    }

    public Show() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    /*    public Show(String name) {
        this.name = name;
    }

    public Show(Long id, String name) {
        this.id = id;
        this.name = name;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }*/

    @Override
    public String toString() {
        return "Show {" + "id=" + id + ", name='" + name +/* ", show =" + show +*/ '}';
    }
}
