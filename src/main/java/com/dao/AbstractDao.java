package com.dao;

import com.orientechnologies.orient.core.record.impl.ODocument;
import com.orientechnologies.orient.core.sql.query.OSQLSynchQuery;
import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public abstract class AbstractDao<T> {

    public static final String DEFAULT_CONFIG = "memory:default";

    private Class<T> persistentClass;
    public OObjectDatabaseTx db;
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

//    public AbstractDao(){
//        this.db = new ODatabaseDocumentTx(DEFAULT_CONFIG);
//        if(this.db.exists()){
//            db.open("admin","admin");
//        } else {
//            db.create();
//        }
//    }

    public AbstractDao() {
        this.db = new OObjectDatabaseTx("local:testtt");
        if (this.db.exists()) {
            db.open("admin", "admin");
        } else {
            db.create();
        }
        db.getEntityManager().registerEntityClasses("com.pojo");
    }

    public AbstractDao(OObjectDatabaseTx db) {
        this.db = db;
    }



    public List<T> getAll(String shemaName) {

        List<T> data = db.query(new OSQLSynchQuery<ODocument>("SELECT * FROM " + shemaName));
        return data;
    }
    public void save(T object) {
        db.save(object);

    }
//    public abstract T findByObject(T obj);


    public abstract void update(T obj, T objNew);

    public abstract void delete(T obj);

    public abstract void print();

    public abstract void deleteAll();
}

//    public List<Account> readAnimals() {
//            List<ODocument> queryResult = ODatabaseDocument.query(new OSQLSynchQuery<ODocument>("select * from Animal"));
//        List<Account> result = new ArrayList<Account>(queryResult.size());
//
//        for (ODocument doc : queryResult) {
//            Account animal = new Animal();
//            animal.setId(doc.field("id"));
//            animal.setName(doc.field("name").toString());
//            ODocument cityDoc = doc.field("city");
//            if (cityDoc != null) {
//                City city = new City();
//                city.setId(cityDoc.field("id"));
//                city.setName(cityDoc.field("name").toString());
//                animal.setCity(city);
//            }
//            result.add(animal);
//        }

//        return result;
//    }


