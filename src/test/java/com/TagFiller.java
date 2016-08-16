package com;

import com.config.AppConfig;
import com.dao.TagDAO;
import com.pojo.Tag;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by user on 15.08.2016.
 */


public class TagFiller extends AbstractTest{

    @Autowired
    TagDAO tagDAO;

//    @org.junit.Test
    public void pringTags() {
        tagDAO.print();

    }
    @org.junit.Test
    public void fillTag() {


        Tag tag = new Tag();
        tag.setId(0);
        tag.setName("Sport");

        Tag tag1 = new Tag();
        tag1.setId(1);
        tag1.setName("Music");

        Tag tag2 = new Tag();
        tag2.setId(2);
        tag2.setName("Books");

        Tag tag3 = new Tag();
        tag3.setId(3);
        tag3.setName("History");

        Tag tag4 = new Tag();
        tag4.setId(4);
        tag4.setName("Nature");
        logger.info(tag.toString());
        tagDAO.save(tag);
        logger.info(tag1.toString());
        tagDAO.save(tag1);
        logger.info(tag2.toString());
        tagDAO.save(tag2);
        logger.info(tag3.toString());
        tagDAO.save(tag3);
        logger.info(tag4.toString());
        tagDAO.save(tag4);
    }




}
