package com;

import com.dao.FollowerDAO;
import com.dao.PushMessageDAO;
import com.dao.SiteDAO;
import com.dao.TagDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by user on 16.08.2016.
 */
public class PrintTest extends AbstractTest {

    @Autowired
    PushMessageDAO pushMessageDAO;
    @Autowired
    FollowerDAO followerDAO;

    @Autowired
    SiteDAO siteDAO;

    @Autowired
    TagDAO tagDAO;

    @org.junit.Test
    public void pringTags() {
        tagDAO.print();

    }
    @org.junit.Test
    public void print() {
        siteDAO.print();
    }
}
