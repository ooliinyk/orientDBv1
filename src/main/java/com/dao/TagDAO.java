package com.dao;

import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import com.pojo.Tag;

import java.util.List;

/**
 * Created by user on 10.08.2016.
 */

public class TagDAO extends AbstractDao<Tag> {

    public TagDAO() {
    }

    public TagDAO(OObjectDatabaseTx db) {
        super(db);
    }

    public void printItems() {
        List<Tag> tags = getAll();
        for (Tag tagItem : tags) {
            System.out.println(tagItem.toString());
        }
    }


    public List<Tag> getAll() {
        return super.getAll("Tag");
    }

    @Override
    public void update(Tag obj, Tag objNew) {


        for (Tag tag : db.browseClass(Tag.class)) {

            if (tag.equals(obj)) {
                tag.setId(objNew.getId());
                tag.setName(objNew.getName());
                db.save(tag);
            }

        }
    }

    @Override
    public void delete(Tag obj) {
        for (Tag tag : db.browseClass(Tag.class)) {

            if (tag.equals(obj)) {
                db.delete(tag);
            }

        }
    }

    @Override
    public void print() {

        for (Tag tag : db.browseClass(Tag.class)) {

            System.out.println(tag.toString());

        }
    }
}
