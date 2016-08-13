package com.dao;

import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import com.pojo.Follower;

import java.util.List;

/**
 * Created by user on 08.08.2016.
 */


public class FollowerDAO extends AbstractDao<Follower> {
    public FollowerDAO() {
    }

    //    public FollowerDAO() {
//    }

    public FollowerDAO(OObjectDatabaseTx db) {
        super(db);
    }

    //    @Override
    public List<Follower> getAll() {
        return super.getAll("Follower");
    }

    @Override
    public void update(Follower obj, Follower objNew) {


//            System.out.println(obj.getClass().getSimpleName() + ".class");
        for (Follower follower1 : db.browseClass(Follower.class)) {

            if (follower1.equals(obj)) {

                follower1.setName(objNew.getName());
                follower1.setSurname(objNew.getSurname());
                follower1.setId(objNew.getId());
                follower1.setSite(objNew.getSite());
                follower1.setTags(objNew.getTags());

                db.save(follower1);

            }
        }

    }

    @Override
    public void delete(Follower obj) {

        for (Follower follower1 : db.browseClass(Follower.class)) {

            if (follower1.equals(obj)) {
                db.delete(follower1);

            }
        }
    }

    @Override
    public void print() {
        for (Follower follower1 : db.browseClass(Follower.class)) {

            System.out.println(follower1.toString());

        }

    }
}
