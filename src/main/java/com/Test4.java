package com;

import com.example.PersonDAO;
import com.orientechnologies.orient.core.record.impl.ODocument;
import com.orientechnologies.orient.core.sql.query.OSQLSynchQuery;
import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import com.example.Account;
import com.example.Person;

import java.util.List;

/**
 * Created by user on 07.08.2016.
 */
public class Test4 {
    public static void main(String[] args) {

//        OObjectDatabaseTx db = OObjectDatabasePool.global().acquire("remote:localhost/mydb", "admin", "admin");

//        OObjectDatabaseTx db = new OObjectDatabaseTx("remote:D:/upwork/Yavorskiy Dmitriy/orientdb-community-2.2.6/orientdb-community-2.2.6/databases/123");
        OObjectDatabaseTx db = new OObjectDatabaseTx("local:demo1o");
        if(db.exists()){
            System.out.println("op");
            db.open("admin","admin");
        } else {
            System.out.println("cr");
            db.create();
        }

//      .open("admin", "admin");
        db.getEntityManager().registerEntityClasses("com.pojo");

        Account account = db.newInstance(Account.class);
        account.setBirthDate(22);
        account.setId(2);
//        db.getEntityManager().
        db.save(account);
        List<Person> objects = db.query(new OSQLSynchQuery<ODocument>("SELECT * FROM Person"));
        System.out.println(objects.toString());


        Person person= new Person();
        person.setName("asd");
        person.setSurname("dsd");
        person.setCity("sdddd");
        PersonDAO personDAO = new PersonDAO(db);
        personDAO.save(person);

        List<Person> persons= db.query(new OSQLSynchQuery<Person>("SELECT * FROM Person"));

        List<Person> l= personDAO.getAll("Person");

        System.out.println(l.toString());

//        for (Person person1 : l){
//            System.out.println(person1.getName() + " " + person1.getSurname());
//        }

//        System.out.println(db.countClass("Car"));
//        System.out.println(db.countClass("Person"));

//        for (Person person1 : l){
//            System.out.println(person1.getName() );
//        }

//        for (Object o : db.browseCluster("Person")) {
//
//            Person person1=  (Person) o;
//            if (person1.getName()=="asd"){
//                person1.setName("asdnew");
//                db.save(person1);
//            }
//
//        }

        person.setName("Alex");
        person.setSurname("OO");
        person.setCity("kiev");

        Person person11  = new Person();
        person11.setName("Alex");
        person11.setSurname("OO");
        person11.setCity("kiev");
//        db.save(person);
//        db.save(person);
//        db.save(person);
//        db.save(person);

        int i=0;

//        personDAO.update(person);
//        for (Person person1 : db.browseClass(Person.class)){
//            System.out.println(person1.getName() + " " + person1.getSurname());
////            Person person1=  (Person) o;
////            if (person1.getName().equals("asd")){
//////                System.out.println(person1.getName() + " " + person1.getSurname());
////                person1.setName("asdnew");
////                db.save(person1);
////
//
//            if (person.equals(person1)){
////                System.out.println(person1.getName() + " " + person1.getSurname());
////                person1.setName("asdnew");
////                db.save(person1);
//                i++;
//
//            }
//        }
//        System.out.println(i);

        System.out.println(person.equals(person11));
//        System.out.println(person.getClass().getName());
//        System.out.println(person.getClass().toString());
//        System.out.println(person.getClass().getTypeName());
//        System.out.println(person.getClass().getCanonicalName());
//        System.out.println(person.getClass().getSimpleName());
//        for (Person person1 : l){
//            System.out.println(person1.getName() );
//        }


    }
}
