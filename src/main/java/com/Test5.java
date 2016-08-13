package com;

import com.example.PersonDAO;
import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import com.example.Person;

import java.util.List;

/**
 * Created by user on 07.08.2016.
 */
public class Test5 {

    public static void main(String[] args) {
        OObjectDatabaseTx db = new OObjectDatabaseTx("local:demo1o5");
        if(db.exists()){
            System.out.println("op");
            db.open("admin","admin");
        } else {
            System.out.println("cr");
            db.create();
        }

        db.getEntityManager().registerEntityClasses("com.pojo");

        Person person= new Person();
        person.setName("asd1");
        person.setSurname("dsd1");
        person.setCity("sdddd");
        PersonDAO personDAO = new PersonDAO(db);
//        personDAO.save(person);
//        personDAO.save(person);


        Person personNew= new Person();
        personNew.setName("personNew");
        personNew.setSurname("personNew");
        personNew.setCity("personNew");


        personDAO.update(person, personNew);
        List<Person> persons= personDAO.getAll();
        for (Person person1 : persons){
            System.out.println(person1.getName() + " " + person1.getSurname());
        }

        db.close();

    }
}
