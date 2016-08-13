package com.example;

/**
 * Created by user on 06.08.2016.
 */
public class Person {

    private String name;
    private String surname;
    private String city;

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
        return "Person{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", city='" + getCity() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person1 = (Person) o;

        if (name != null ? !name.equals(person1.name) : person1.name != null) return false;
        if (surname != null ? !surname.equals(person1.surname) : person1.surname != null) return false;
        return !(city != null ? !city.equals(person1.city) : person1.city != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
