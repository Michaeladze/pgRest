package com.pg.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    private String id;

    private String name;

    @JsonIgnore
    private String parent;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getParent() {
        return parent;
    }

    public Category() {
    }

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
