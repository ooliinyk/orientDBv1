package com.example;

/**
 * Created by user on 05.08.2016.
 */
public class Account {

    private int id;
    private int birthDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", birthDate=" + birthDate +
                '}';
    }
}
