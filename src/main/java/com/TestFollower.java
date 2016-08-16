package com;

import com.dao.FollowerDAO;
import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import com.pojo.Follower;
import com.pojo.Site;
import com.pojo.Tag;

import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 07.08.2016.
 */
public class TestFollower {

    public static void main(String[] args) {
        OObjectDatabaseTx db = new OObjectDatabaseTx("local:demo111111");
        if (db.exists()) {
            System.out.println("op");
            db.open("admin", "admin");
        } else {
            System.out.println("cr");
            db.create();
        }
        db.getEntityManager().registerEntityClasses("com.pojo");

        Tag tag = new Tag();
        tag.setName("ss");
        tag.setId(1);
        List<Tag> tags = new ArrayList<Tag>();
        tags.add(tag);
        tags.add(tag);
        tags.add(tag);

        Site site = new Site();
        site.setId(1);
        site.setName("sd1");
        site.setIcon("sd");
//        site.setUrl("sd")

        Follower follower = new Follower();
        follower.setName("alex1");
//        follower.setId(2);
        follower.setSurname("oo11");
        follower.setTags(tags);
        follower.setSite(site);

         Tag tag1= new Tag();
        tag1.setName("ss");
        tag1.setId(3);
        List<Tag> tags1= new LinkedList<Tag>();
        tags1.add(tag1);
        tags1.add(tag1);
        tags1.add(tag1);

        Site site1=new Site();
        site1.setId(3);
        site1.setName("sd2");
        site1.setIcon("sd");
//        site.setUrl("sd")
//
        Follower followernew = new Follower();
        followernew.setName("alex1");
//        followernew.setId(3);
        followernew.setSurname("oo11");
        followernew.setTags(tags1);
        followernew.setSite(site1);


        FollowerDAO followerDAO = new FollowerDAO(db);
//        followerDAO.deleteAll();

        followerDAO.save(followernew);   followerDAO.save(follower);


//        followerDAO.update(follower, followernew);
        Follower follower11 = new Follower();
//        followerDAO.save(follower);

        List<Follower> followers= followerDAO.getAll();
        System.out.println(followers.toString());
        for (Follower follower1 : db.browseClass(Follower.class)) {

            System.out.println(follower1.toString());
        }
////
//
//            follower11.setName(follower1.getName());
//            follower11.setSurname(follower1.getSurname());
//            follower11.setId(follower1.getId());
//            follower11.setSite(follower1.getSite());
////            System.out.println(follower1.getTags().toString());
//            follower11.setTags(follower1.getTags());
//
//
////            System.out.println(follower.getTags().equals(follower1.getTags()));
//
//
//
//            System.out.println(follower1.equals(follower));
//
//            System.out.println(follower.toString());
//            System.out.println(follower11.toString());
//
//        }


    }

}
