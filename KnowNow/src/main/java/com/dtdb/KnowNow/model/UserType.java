package com.dtdb.KnowNow.model;


import lombok.Builder;
import lombok.ToString;

import javax.persistence.*;

@Builder
@ToString
@Entity
@Table(name = "user_types")
public class UserType {

    @Id
    @GeneratedValue

    @Column(name = "id", updatable = false, unique = true, nullable = false, length=2)
    private int id;

    @Column(name = "name", nullable = false, length=35)
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
