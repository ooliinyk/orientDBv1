package com.example;

import com.pojo.Tag;

/**
 * Created by user on 06.08.2016.
 */
public class PersonNew {

    private String name;
    private String surname;
    private String city;
    private Tag tag;

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "PersonNew{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", tag=" + tag +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonNew personNew = (PersonNew) o;

        if (name != null ? !name.equals(personNew.name) : personNew.name != null) return false;
        if (surname != null ? !surname.equals(personNew.surname) : personNew.surname != null) return false;
        if (city != null ? !city.equals(personNew.city) : personNew.city != null) return false;
        return !(tag != null ? !tag.equals(personNew.tag) : personNew.tag != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (tag != null ? tag.hashCode() : 0);
        return result;
    }
}
