package com.pg.rest.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "users")
public class User {
    @Id
    private String id;

    private String firstName;
    private String middleName;
    private String lastName;
    private String position;
    private String department;
    private String departmentId;
    private String photo;

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public String getPhoto() {
        return photo;
    }
}