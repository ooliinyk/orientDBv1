package com.dao;

import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import com.pojo.Follower;
import com.pojo.Site;
import com.pojo.Tag;

import java.util.ArrayList;
import java.util.List;


public class FollowerDAO extends AbstractDao<Follower> {
    public FollowerDAO() {
    }

    //    public FollowerDAO() {
//    }

    public FollowerDAO(OObjectDatabaseTx db) {
        super(db);
    }


    public List<Follower> getAll() {
        return super.getAll("Follower");
    }


    public List<Follower> findByID(int id) {

        List<Follower> list = new ArrayList<Follower>();
        for (Follower follower : db.browseClass(Follower.class)) {

            if (follower.getId() == id) {
                list.add(follower);
            }

        }
        return list;
    }

    public List<Follower> getFollowerBySite(Site site) {
        List<Follower> siteList = new ArrayList<Follower>();
        for (Follower follower : db.browseClass(Follower.class)) {

            if (follower.getSite().equals(site)) {
                siteList.add(follower);
            }
        }
        logger.info(siteList.toString());
        return siteList;
    }

    public List<Follower> getFollowerByTag(Tag tag) {
        List<Follower> list = new ArrayList<Follower>();
        for (Follower follower : db.browseClass(Follower.class)) {

            for (Tag tagtmp : follower.getTags()) {
                if (tagtmp.equals(tag)) {
                    list.add(follower);
                }
            }
        }
        logger.info(list.toString());
        return list;
    }

    public List<Follower> getFollowerByTagAndSite(Site site, Tag tag) {

        List<Follower> list = new ArrayList<Follower>();
        for (Follower follower : db.browseClass(Follower.class)) {
            if (follower.getSite().equals(site)) {
                for (Tag tagtmp : follower.getTags()) {
                    if (tagtmp.equals(tag)) {
                        list.add(follower);
                    }
                }
            }
        }
        logger.info(list.toString());
        return list;
    }

    @Override
    public void update(Follower obj, Follower objNew) {

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

        for (Follower follower : db.browseClass(Follower.class)) {

            if (follower.equals(obj)) {
                db.delete(follower);
            }
        }
    }

    @Override
    public void print() {
        for (Follower follower : db.browseClass(Follower.class)) {

            System.out.println(follower.toString());
        }
    }

    @Override
    public void deleteAll() {
        for (Follower follower : db.browseClass(Follower.class)) {

            db.delete(follower);
        }
    }
}
