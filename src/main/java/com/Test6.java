package com;

import com.dao.TagDAO;
import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import com.pojo.Tag;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by user on 13.08.2016.
 */
public class Test6 {

    public static void main(String[] args) {
//        OObjectDatabaseTx db = new OObjectDatabaseTx("local:testt");
//        if (db.exists()) {
//            System.out.println("op");
//            db.open("admin", "admin");
//        } else {
//            System.out.println("cr");
//            db.create();
//        }

//        db.getEntityManager().registerEntityClasses("com.pojo");

        Main main= new Main();

//        @Autowired
        TagDAO tagDAO = new TagDAO();
        main.fillTag();
        tagDAO.print();



    }
}
