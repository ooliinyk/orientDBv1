package com;

import com.dao.TagDAO;
import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import com.pojo.Tag;

import java.util.List;

/**
 * Created by user on 10.08.2016.
 */
public class TestTag  {

    public static void main(String[] args) {
        OObjectDatabaseTx db = new OObjectDatabaseTx("local:demo1o5322122");
        if (db.exists()) {
            System.out.println("op");
            db.open("admin", "admin");
        } else {
            System.out.println("cr");
            db.create();
        }
        db.getEntityManager().registerEntityClasses("com.pojo");

        Tag tag= new Tag();
        tag.setName("tag1");
        tag.setId(1);

        Tag tag1= new Tag();
        tag1.setId(2);
        tag1.setName("tag2");

        TagDAO  tagDAO = new TagDAO(db);



//        tagDAO.save(tag);
//        tagDAO.save(tag);

//        tagDAO.update(tag1,tag);
//        List<Tag> tags = tagDAO.getAll();


//        Taggg taggg = new Taggg();
//        taggg.save(tag1);
//        taggg.printItems();
//        tagDAO.printItems();

//        for (Tag tagItem : tags){
//            System.out.println(tagItem.toString());
//        }

    }
}
