package com.example;

import com.dao.AbstractDao;
import com.orientechnologies.orient.object.db.OObjectDatabaseTx;

import java.util.List;

/**
 * Created by user on 07.08.2016.
 */
public class PersonDAO extends AbstractDao<Person> {

    public PersonDAO(OObjectDatabaseTx db) {
        super(db);
    }



    public List<Person> getAll() {
        return super.getAll("Person");
    }

    @Override
   public void update(Person obj, Person objNew) {
        {      Person person11 = new Person();

            int i=0;
            System.out.println(obj.getClass().getSimpleName() + ".class");
            for (Person person1 : db.browseClass(Person.class)) {
                person11.setName(person1.getName());
                person11.setSurname(person1.getSurname());
                person11.setCity(person1.getCity());

                if (person11.equals(obj)) {
                    person1.setName(objNew.getName());
                    person1.setSurname(objNew.getSurname());
                    person1.setCity(objNew.getCity());
                db.save(person1);
//
                }
            }
            System.out.println(i);
        }
    }

    @Override
    public void delete(Person obj) {

    }

    @Override
    public void print() {

    }

    @Override
    public void deleteAll() {

    }
}
