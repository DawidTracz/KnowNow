package com.dtdb.KnowNow.model;


import com.dtdb.KnowNow.interfaces.Buildable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue

    private int id;
    private int userTypeId;
    private String name;
    private String surname;
    private String password;
    private int status_id;
    private String email;
    private String phoneNumber;
    private String adress;
    private String countrySymbol;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
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
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
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


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userTypeId=" + userTypeId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", status_id=" + status_id +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adress='" + adress + '\'' +
                ", countrySymbol='" + countrySymbol + '\'' +
                '}';
    }

    public static UserBuilder create() {
        return new UserBuilder();
    }



    public static class UserBuilder implements Buildable<User> {

        User user;

        public UserBuilder id(int id) {
            user.id = id;
            // this = instancja siebie samego
            return this;
        }

        public UserBuilder userTypeId(int userTypeId) {
            user.userTypeId = userTypeId;
            return this;
        }

        public UserBuilder name(String  name) {
            user.name = name;
            return this;
        }
        public UserBuilder surname(String surname) {
            user.surname = surname;
            return this;
        }
        public UserBuilder password(String password) {
            user.password = password;
            return this;
        }
        public UserBuilder status_id(int status_id) {
            user.status_id = status_id;
            return this;
        }
        public UserBuilder email(String  email) {
            user.email = email;
            return this;
        }
        public UserBuilder phoneNumber(String phoneNumber) {
            user.phoneNumber = phoneNumber;
            return this;
        }
        public UserBuilder adress(String adress) {
            user.adress = adress;
            return this;
        }
        public UserBuilder countrySymbol(String countrySymbol) {
            user.countrySymbol = countrySymbol;
            return this;
        }

        @Override
        public User build() {
            return null;
        }

    }
}
