package com;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.orientechnologies.orient.core.db.document.ODatabaseDocument;
import com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx;
import com.orientechnologies.orient.core.metadata.schema.OClass;
import com.orientechnologies.orient.core.metadata.schema.OType;
import com.orientechnologies.orient.core.record.impl.ODocument;
import com.orientechnologies.orient.core.sql.OCommandSQL;
import com.orientechnologies.orient.core.sql.query.OSQLSynchQuery;
import com.orientechnologies.orient.core.tx.OTransaction;
import com.example.Account;
import com.example.Person;
//import com.orientechnologies.orient.jdbc.OrientJdbcConnection;

//import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import java.sql.DriverManager;


/**
 * Created by user on 04.08.2016.
 */
public class Test {




    public static void main(String ar[]) throws SQLException {



        final String DEFAULT_CONFIG = "local:demoo";


        ODatabaseDocument db;
//        OObjectDatabaseTx db1 = new OObjectDatabaseTx("remote:localhost/mybd").open("admin", "admin");
        db = new ODatabaseDocumentTx(DEFAULT_CONFIG);
//        ODatabaseDocumentTx db = new ODatabaseDocumentTx("remote:localhost/mydb");
//        ODatabaseDocumentTx db = new ODatabaseDocumentTx("plocal:/temp/");
//        db.open("root", "root");
            if(db.exists()){
                System.out.println("op");
                db.open("admin","admin");
            } else {
                System.out.println("cr");
                db.create();
            }

        List<ODocument> objects = db.query(new OSQLSynchQuery<ODocument>("SELECT * FROM Account"));
        System.out.println(objects.toString());

//        db.getMetadata().getSchema().dropClass("Account");
        OClass account = db.getMetadata().getSchema().createClass("Account");
        account.createProperty("id", OType.INTEGER);
        account.createProperty("birthDate", OType.INTEGER);
        OClass account1 = db.getMetadata().getSchema().getClass("Account");

        Account ac= new Account();
        ac.setId(1);
        ac.setBirthDate(2);
//        account1.
//        account1.set("id", ac);


        String qq= "insert into Account (id, birthDate) values (2 , 3)";

        List<ODocument> result = db.query(new OSQLSynchQuery<ODocument>(
                "select * from Person"));

        System.out.println(result.toString());

        db.command(new OCommandSQL("UPDATE Person SET name = 'Luke1' WHERE  name = 'Luke'")).execute();

//
//        db.query(new OSQLSynchQuery<ODocument>(
//               "UPDATE Person SET name = 'Luke1' WHERE  name = 'Luke'"));
        List<ODocument> result2 = db.query(new OSQLSynchQuery<ODocument>(
                "select * from Person"));
        System.out.println(result2.toString());


//        db.query(new OSQLSynchQuery<ODocument>(qq));
        OTransaction transaction = db.getTransaction();

        transaction.commit();
        transaction.close();







        ODocument doc = new ODocument("Person");
        doc.field( "name", "Luke" );
        doc.field( "surname", "Skywalker" );
        doc.field("city", new ODocument("City").field("name", "Rome").field("country", "Italy"));

        System.out.println(doc.getRecord());
//        System.out.println(      doc.getCollectionTimeLine("Peron"));
        System.out.println(        db.getClusters());


//
//        try {
//            db.begin();
//            // YOUR CODE
//            db.commit();
//        } finally {
////            db.close();
//
//        }
// SAVE THE DOCUMENT
        doc.save();

//        ODocument tag = new ODocument();

//        db.command(new OCommandSQL("CREATE CLASS Account")).execute();

//        OObjectDatabaseTx db1 = new OObjectDatabaseTx (DEFAULT_CONFIG).open("admin", "admin");
//        AbstractDao abstractDao = new AbstractDao(db);
//        System.out.println(abstractDao.getData("Person").toString());


//        String q = "SELECT *, out('ExtraToObject').@rid as objectId FROM Person";
//        List<Person> extras= db.command(new OSQLSynchQuery<Person>(q)).execute();
//        System.out.println(extras.toString());

        List<ODocument> result4 = db.query(new OSQLSynchQuery<ODocument>(            "select * from " + "Person"));

        Gson gson = new GsonBuilder().create();

        List<Person> persons= new ArrayList<Person>();
        for (ODocument person: result4){
            System.out.println("loop");
            String s=person.toString();
            Person person1 =   new Person();
            person1.setName(person.field("name").toString());
            person1.setSurname(person.field("surname").toString());
            person1.setCity(person.field("city").toString());

            persons.add(person1);

//            Person p = gson.fromJson(, Person.class);
//            System.out.println(p);
            System.out.println(s);

            System.out.println( person.getRecord().getIdentity().getClusterPosition());
//            System.out.println( person.get);
        }

        System.out.println(persons.toString());
        System.out.println(result4);




        OClass account111 = db.getMetadata().getSchema().getClass("Person");

//        account111.
        System.out.println(account111);

//        db.get
//
//        db.getEntityManager()
//                .registerEntityClasses("de.discoveration.rechnung.dao.orbit.model");


        System.out.println("save");

//        db.getUserObjectByRecord(ac);


        db.close();


//                OObjectDatabaseTx db1 = new OObjectDatabaseTx ("local:demoo");
//        OObjectDatabaseTx db2 = new OObjectDatabaseTx("remote:localhost/demo");


//    db1.close();

//        OObjectDatabaseTx db1 = new OObjectDatabaseTx("local:demoo").open("admin", "admin");
//        db1.getEntityManager().registerEntityClass(Person.class);
        }


    }

