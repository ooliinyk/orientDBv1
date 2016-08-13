package com;

import com.dao.SiteDAO;
import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import com.pojo.Site;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 10.08.2016.
 */
public class TestSite {

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


        Site site=new Site();
        site.setId(1);
        site.setName("sd1");
        site.setIcon("sd");
//        site.setUrl("sd")


        Site site1=new Site();
        site1.setId(1);
        site1.setName("sd2");
        site1.setIcon("sd");
//        site.setUrl("sd")


        SiteDAO siteDAO = new SiteDAO(db);
//        siteDAO.save(site1);
//        siteDAO.save(site1);
        siteDAO.update(site,site1);
        List<Site> sites= siteDAO.getAll();
//        int
        for (Site site2: sites){


            System.out.println(site2.toString());
        }




    }




}
