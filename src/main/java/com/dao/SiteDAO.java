package com.dao;

import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import com.pojo.Site;


import java.util.List;

/**
 * Created by user on 10.08.2016.
 */


public class SiteDAO extends AbstractDao<Site> {


    public SiteDAO(OObjectDatabaseTx db) {
        super(db);
    }

    public List<Site> getAll() {
        return super.getAll("Site");
    }

    public SiteDAO() {
    }

    public Site findByID(long id){

        for (Site site : db.browseClass(Site.class)) {

            if(site.getId()==id){
                return site;
            }

        }
        return null;
    }

    @Override
    public void update(Site obj, Site objNew) {

        for (Site site : db.browseClass(Site.class)) {

            if (site.equals(obj)) {
                site.setId(objNew.getId());
                site.setName(objNew.getName());
                site.setIcon(objNew.getIcon());
                site.setUrl(objNew.getUrl());
                db.save(site);
            }
        }
    }

    @Override
    public void delete(Site obj) {
        for (Site site : db.browseClass(Site.class)) {

            if (site.equals(obj)) {

                db.delete(site);
            }
        }
    }

    @Override
    public void print() {

        for (Site site : db.browseClass(Site.class)) {

            System.out.println(site.toString());
        }
    }

    @Override
    public void deleteAll() {
        for (Site site : db.browseClass(Site.class)) {

            db.delete(site);
        }
    }
}
