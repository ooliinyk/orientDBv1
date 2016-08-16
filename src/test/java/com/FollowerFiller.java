package com;

import com.dao.FollowerDAO;
import com.dao.SiteDAO;
import com.dao.TagDAO;
import com.pojo.Follower;
import com.pojo.Tag;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 15.08.2016.
 */
public class FollowerFiller extends AbstractTest {

    @Autowired
    FollowerDAO followerDAO;

    @Autowired
    SiteDAO siteDAO;

    @Autowired
    TagDAO tagDAO;


//    @org.junit.Test
    public void print() {
        followerDAO.print();
    }

//        @org.junit.Test
    public void deleteAll() {
        followerDAO.deleteAll();
    }


    //    @org.junit.Test
    public void print1() {
        List<Follower> followers = followerDAO.findByID(1);

        for (Follower follower : followers) {
            logger.info(follower.toString());
            System.out.println(follower.toString());
        }
    }


//    @org.junit.Test
    public void fillFollower() {
        final Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            Follower follower = new Follower();
            follower.setId(i);
            follower.setName("follower" + i);
            follower.setSurname("surname" + i);
            int tmpSIteId = random.nextInt(9);
            follower.setSite(siteDAO.findByID(tmpSIteId));

            List<Tag> list = new ArrayList<Tag>();
            int tmp = random.nextInt(5);
            list.add(tagDAO.findByID(tmp));
            if (tmp == 0) {
                tmp += 1;
            } else {
                tmp -= 1;
            }
            list.add(tagDAO.findByID(tmp));
            follower.setTags(list);


            Follower follower1 = new Follower();
            follower1.setId(i);
            follower1.setName("follower" + i);
            follower1.setSurname("surname" + i);

            if (tmpSIteId == 0) {
                tmpSIteId += 1;
            } else {
                tmpSIteId -= 1;
            }
            follower1.setSite(siteDAO.findByID(random.nextInt(9)));
            List<Tag> list1 = new ArrayList<Tag>();
            tmp = random.nextInt(5);
            list1.add(tagDAO.findByID(tmp));
            if (tmp == 0) {
                tmp += 1;
            } else {
                tmp -= 1;
            }
            list1.add(tagDAO.findByID(tmp));
            follower1.setTags(list);


            logger.info(follower.toString());
            logger.info(follower1.toString());
            followerDAO.save(follower);
            followerDAO.save(follower1);
        }

//        for (int i = 0; i < 10000; i++) {
//            Follower follower = new Follower();
//            follower.setId(i);
//            follower.setName("follower" + i);
//            follower.setSurname("surname" + i);
//
//            follower.setSite(siteDAO.findByID(random.nextInt(9)));
//            List<Tag> list = new ArrayList<Tag>();
//            int tmp = random.nextInt(5);
//            list.add(tagDAO.findByID(tmp));
//            if (tmp == 0) {
//                tmp += 1;
//            } else {
//                tmp -= 1;
//            }
//            list.add(tagDAO.findByID(tmp));
//            follower.setTags(list);
//            followerDAO.save(follower);
//        }

    }


}
