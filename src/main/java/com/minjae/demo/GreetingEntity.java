package com.minjae.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GreetingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public GreetingEntity() {}

    public GreetingEntity(String name) { this.name = name; }

    public Long getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
