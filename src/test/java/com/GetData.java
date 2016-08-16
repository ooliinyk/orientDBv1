package com;

/**
 * Created by user on 16.08.2016.
 */

import com.dao.FollowerDAO;
import com.dao.PushMessageDAO;
import com.dao.SiteDAO;
import com.dao.TagDAO;
import com.pojo.Site;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class GetData extends AbstractTest {
    @Autowired
    PushMessageDAO pushMessageDAO;
    @Autowired
    FollowerDAO followerDAO;

    @Autowired
    SiteDAO siteDAO;

    @Autowired
    TagDAO tagDAO;


    @Test
    public void getFollowerForSiteTest() {

        System.out.println("getFollowerForSiteTest: " +followerDAO.getFollowerBySite(siteDAO.findByID(1)));

    }

    @Test
    public void getFollowerForTagTest() {

        System.out.println(" getFollowerForTagTest : "+followerDAO.getFollowerByTag(tagDAO.findByID(1)));

    }

    @Test
    public void getFollowerForSiteAndTagTest() {

        System.out.println(" getFollowerForSiteAndTagTest : " + followerDAO.getFollowerByTagAndSite(siteDAO.findByID(1), tagDAO.findByID(1)));

    }


    @Test
    public void getPushMessageForSiteAndTagTest() {

        System.out.println("getPushMessageForSiteAndTagTest" + pushMessageDAO.getNumbersForPushMessageByTagAndSite(siteDAO.findByID(1), tagDAO.findByID(1)));

    }

    @Test
    public void getPushMessageForTag() {

        System.out.println("getPushMessageForSite" + pushMessageDAO.getNumbersForPushMessageByTag(tagDAO.findByID(1)));

    }

    @Test
    public void getPushMessageForSite() {

        System.out.println("getPushMessageForSite" + pushMessageDAO.getNumbersForPushMessageBySite(siteDAO.findByID(1)));

    }


}
