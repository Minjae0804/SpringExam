package com.minjae.demo;

import jakarta.persistence.*;

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
