package com;

import com.dao.FollowerDAO;
import com.dao.PushMessageDAO;
import com.dao.SiteDAO;
import com.dao.TagDAO;
import com.pojo.Follower;
import com.pojo.PushMessage;
import com.pojo.Site;
import com.pojo.Tag;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by user on 16.08.2016.
 */
public class PushMessageFiller extends AbstractTest {

    @Autowired
    PushMessageDAO pushMessageDAO;
    @Autowired
    FollowerDAO followerDAO;

    @Autowired
    SiteDAO siteDAO;

    @Autowired
    TagDAO tagDAO;

    public int k = 0;

    //    @Test
    public void print() {

        pushMessageDAO.print();
    }

    //    @Test
    public void deleteAll() {
        pushMessageDAO.deleteAll();
    }

    @Test
    public void fillPushMEssageForFollowers() {

        List<Follower> followers = followerDAO.getAll();

        for (Follower follower : followers) {

            for (int j = 0; j < 10; j++) {
                k++;
                PushMessage pushMessage = new PushMessage();
//                pushMessage.setId(i);
                pushMessage.setIcon("sd");
                pushMessage.setDeliverd(Boolean.TRUE);
                pushMessage.setFollower(follower);
                logger.info(pushMessage.toString());
                pushMessageDAO.save(pushMessage);
            }
        }
    }


    @Test
    public void fillPushMEssageForSite() {

        List<Site> sites = siteDAO.getAll();

        for (Site site : sites) {

            for (int j = 0; j < 5; j++) {
                k++;
                PushMessage pushMessage = new PushMessage();
//                pushMessage.setId(i);
                pushMessage.setIcon("sd");
                pushMessage.setDeliverd(Boolean.TRUE);
                pushMessage.setSite(site);
                logger.info(pushMessage.toString());
                pushMessageDAO.save(pushMessage);
            }
        }
    }

    @Test
    public void fillPushMEssageForTag() {

        List<Tag> tags = tagDAO.getAll();


        for (Tag tag : tags) {

            for (int j = 0; j < 2; j++) {
                k++;
                PushMessage pushMessage = new PushMessage();
//                pushMessage.setId(i);
                pushMessage.setIcon("sd");
                pushMessage.setDeliverd(Boolean.TRUE);
                pushMessage.setTag(tag);
                logger.info(pushMessage.toString());
                pushMessageDAO.save(pushMessage);

            }
        }
    }
}
