package com.dtdb.KnowNow.model;

import lombok.Builder;
import lombok.ToString;

import javax.persistence.*;

@Builder
@ToString
@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "id",unique = true, updatable = false, nullable = false, length=2)
    private int id;

    @Column(name = "name", nullable = false, length=35)
    private String name;

    @Column(name = "owning_user", nullable = false, length=6)
    private int owningUser;

    @Column(name = "number_of_sections", nullable = false, length=2)
    private int numberOfSections;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserID() {
        return owningUser;
    }

    public void setUserID(int userID) {
        this.owningUser = userID;
    }

    public int getNumberOfSections() {
        return numberOfSections;
    }

    public void setNumberOfSections(int numberOfSections) {
        this.numberOfSections = numberOfSections;
    }


}
