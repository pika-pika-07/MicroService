package com.example.Microservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dog {

    @Id
    private Long id;

    private String name;
    private String breed;
    private String origin;

    // Constructor
    public Dog(Long id, String name, String breed, String origin) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.origin = origin;
    }

    public Dog(){

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

    public String getBreed() {
        return breed;
    }

    public String getOrigin() {
        return origin;
    }
}
