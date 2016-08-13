package com;

import com.orientechnologies.orient.client.remote.OServerAdmin;
import com.orientechnologies.orient.core.db.document.ODatabaseDocument;
import com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx;

import java.io.IOException;

/**
 * Created by user on 05.08.2016.
 */
public class Test2 {


    public static void main(String[] args) throws IOException {
        final String DEFAULT_CONFIG = "local:demo";

//        ODatabaseDocument db;
//
//
//        OServerAdmin server = new OServerAdmin("remote:localhost").connect("root", "root");
//        server.createDatabase("graph", "plocal");
        ODatabaseDocumentTx db = new ODatabaseDocumentTx("remote:localhost/123").open("root", "root");

//        ODatabaseDocumentTx db = new ODatabaseDocumentTx("remote:localhost/mydb");
//        ODatabaseDocumentTx db = new ODatabaseDocumentTx("plocal:/temp/");
//        db.open("root", "root");
//        if(db.exists()){
//            System.out.println("op");
//            db.open("admin","admin");
//        } else {
//            System.out.println("cr");
//            db.create();
//        }
//

    }
}
