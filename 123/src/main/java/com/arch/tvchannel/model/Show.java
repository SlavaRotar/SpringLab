package com.arch.tvchannel.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Builder;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Shows")
@Builder
public class Show {

    @Id
    private Long id;
    private String name;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "type_id")
    private Type type;


    @JsonManagedReference
    @OneToMany(mappedBy = "show", fetch = FetchType.EAGER)
    private Set<Monday> monday;

    @JsonManagedReference
    @OneToMany(mappedBy = "show", fetch = FetchType.EAGER)
    private Set<Tuesday> tuesday;

    @JsonManagedReference
    @OneToMany(mappedBy = "show", fetch = FetchType.EAGER)
    private Set<Wednesday> wednesday;

    @JsonManagedReference
    @OneToMany(mappedBy = "show", fetch = FetchType.EAGER)
    private Set<Thursday> thursday;

    @JsonManagedReference
    @OneToMany(mappedBy = "show", fetch = FetchType.EAGER)
    private Set<Dow> friday;

    @JsonManagedReference
    @OneToMany(mappedBy = "show", fetch = FetchType.EAGER)
    private Set<Saturday> saturday;

    @JsonManagedReference
    @OneToMany(mappedBy = "show", fetch = FetchType.EAGER)
    private Set<Sunday> sunday;

    public Show() {
    }

    public Show(Long id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Show(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Show(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Show(Long id, String name, Type type, Set<Monday> monday, Set<Tuesday> tuesday, Set<Wednesday> wednesday, Set<Thursday> thursday, Set<Dow> friday, Set<Saturday> saturday, Set<Sunday> sunday) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
    }

    public Show(String name) {
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Set<Monday> getMonday() {
        return monday;
    }

    public void setMonday(Set<Monday> monday) {
        this.monday = monday;
    }

    public Set<Tuesday> getTuesday() {
        return tuesday;
    }

    public void setTuesday(Set<Tuesday> tuesday) {
        this.tuesday = tuesday;
    }

    public Set<Wednesday> getWednesday() {
        return wednesday;
    }

    public void setWednesday(Set<Wednesday> wednesday) {
        this.wednesday = wednesday;
    }

    public Set<Thursday> getThursday() {
        return thursday;
    }

    public void setThursday(Set<Thursday> thursday) {
        this.thursday = thursday;
    }

    public Set<Dow> getFriday() {
        return friday;
    }

    public void setFriday(Set<Dow> friday) {
        this.friday = friday;
    }

    public Set<Saturday> getSaturday() {
        return saturday;
    }

    public void setSaturday(Set<Saturday> saturday) {
        this.saturday = saturday;
    }

    public Set<Sunday> getSunday() {
        return sunday;
    }

    public void setSunday(Set<Sunday> sunday) {
        this.sunday = sunday;
    }

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}