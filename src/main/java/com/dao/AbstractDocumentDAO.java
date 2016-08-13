package com.dao;

import com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx;
import com.orientechnologies.orient.core.record.impl.ODocument;
import com.orientechnologies.orient.core.sql.query.OSQLSynchQuery;


import java.util.List;

/**
 * Created by user on 09.08.2016.
 */
public class AbstractDocumentDAO<T> {


    ODatabaseDocumentTx db ;
    private Class<T> persistentClass;
//    OObjectDatabaseTx db;

    public AbstractDocumentDAO() {
        this.db = new ODatabaseDocumentTx("local:demoo");
        if (this.db.exists()) {
            db.open("admin", "admin");
        } else {
            db.create();
        }


    }

    public AbstractDocumentDAO(ODatabaseDocumentTx db) {
        this.db = db;
    }


    public List<ODocument> getAll(String shemaName) {

        List<ODocument> data = db.query(new OSQLSynchQuery<ODocument>("SELECT * FROM " + shemaName));
        return data;
    }

//    public    void update(T obj, T objNew){
//        for (ODocument animal : db.browseClass("Animal")) {
//            animal.field( "price", animal.field( "price" ) * 105 / 100 );
//            animal.save();
//        }
//    }




}
