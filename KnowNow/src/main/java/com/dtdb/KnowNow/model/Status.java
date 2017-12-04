package com.dtdb.KnowNow.model;

import lombok.Builder;
import lombok.ToString;

import javax.persistence.*;

@Builder
@ToString
@Entity
@Table(name="status")
public class Status {

    @Id
    @GeneratedValue

    @Column(name = "id",unique = true, updatable = false, nullable = false, length=2)
    private int id;
    @Column(name = "name", nullable = false, length=2)
    private String name;


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


}
