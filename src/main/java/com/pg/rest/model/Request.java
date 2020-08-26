package com.pg.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "requests")
public class Request {

    @Id
    private String id;

    private String name;

    @JsonIgnore
    private String pathId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pathId", referencedColumnName = "id", insertable = false, updatable = false)
    private Category path;

    private String description;
    private Boolean isFavourite;

    @JsonIgnore
    private String status;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPathId() {
        return pathId;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getIsFavourite() {
        return isFavourite;
    }

    public String getStatus() {
        return status;
    }

    public ArrayList<Category> getPath() {
        ArrayList<Category> list = new ArrayList<Category>();
        Category category = new Category("3", "Каталог");
        list.add(category);
        list.add(path);
        return list;
    }

    public void setIsFavourite(Boolean favourite) {
        isFavourite = favourite;
    }
}
