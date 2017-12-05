package com.dtdb.KnowNow.model;


import lombok.Builder;
import lombok.ToString;

import javax.persistence.*;

@Builder
@ToString
@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue

    @Column(updatable = false,unique = true, name = "id", nullable = false, length=6)
    private int id;

    @Column(name = "user_type", nullable = false, length=2)
    private int userType;

    @Column(name = "name", nullable = false, length=35)
    private String name;

    @Column(name = "surname", nullable = false, length=35)
    private String surname;

    @Column(name = "password", nullable = false, length=35)
    private String password;

    @Column(name = "status", nullable = false, length=2)
    private int status;

    @Column(name = "email", nullable = false, length=40)
    private String email;

    @Column(name = "phone_number", nullable = false, length=20)
    private String phoneNumber;

    @Column(name = "adress", nullable = false, length=35)
    private String adress;

    @Column(name = "country_symbol", nullable = false, length=2)
    private String countrySymbol;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus_id() {
        return status;
    }

    public void setStatus_id(int status_id) {
        this.status = status_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCountrySymbol() {
        return countrySymbol;
    }

    public void setCountrySymbol(String countrySymbol) {
        this.countrySymbol = countrySymbol;
    }


}
