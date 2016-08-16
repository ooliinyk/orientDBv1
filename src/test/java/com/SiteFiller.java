package com;

import com.config.AppConfig;
import com.dao.SiteDAO;
import com.pojo.Site;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by user on 15.08.2016.
 */


public class SiteFiller extends AbstractTest{
    @Autowired
    SiteDAO siteDAO;

//    @org.junit.Test
    public void print() {
        siteDAO.print();
    }

    //    @org.junit.Test
    public void deleteAll() {

//        logger.info("11");
        siteDAO.deleteAll();
    }



    @org.junit.Test
    public void fillSite() {
        Site site = new Site();
        site.setId(0);
        site.setName("bbc");
        site.setIcon("1");
//        URL url =new URL("http://example.com/");
//        site.setUrl(url);


//
        Site site1 = new Site();
        site1.setId(1);
        site1.setName("tsn");
        site1.setIcon("1");
//        site1.setUrl(new URL("http://example.com/"));

        Site site2 = new Site();
        site2.setId(2);
        site2.setName("ccn");
        site2.setIcon("1");
//        site2.setUrl(new URL("http://example1.com/"));

        Site site3 = new Site();
        site3.setId(3);
        site3.setName("Google News");
        site3.setIcon("1");
//        site3.setUrl(new URL("http://example2.com/"));

        Site site4 = new Site();
        site4.setId(4);
        site4.setName("Yahoo News");
        site4.setIcon("1");
//        site4.setUrl(new URL("http://example4.com/"));

        Site site5 = new Site();
        site5.setId(5);
        site5.setName("New York Times");
        site5.setIcon("1");
//        site5.setUrl(new URL("http://exampl5e.com/"));

        Site site6 = new Site();
        site6.setId(6);
        site6.setName("Fox News");
        site6.setIcon("1");
//        site6.setUrl(new URL("http://example6111.com/"));

        Site site7 = new Site();
        site7.setId(7);
        site7.setName("ABCNews");
        site7.setIcon("1");
//        site7.setUrl(new URL("http://example7.com/"));

        Site site8 = new Site();
        site8.setId(8);
        site8.setName("Washington Post");
        site8.setIcon("1");
//        site8.setUrl(new URL("http://example8.com/"));

        Site site9 = new Site();
        site9.setId(9);
        site9.setName("Forbes");
        site9.setIcon("1");
//        site9.setUrl(new URL("http://example9.com/"));
        logger.info(site.toString());
        siteDAO.save(site);
        logger.info(site1.toString());
        siteDAO.save(site1);
        logger.info(site2.toString());
        siteDAO.save(site2);
        logger.info(site3.toString());
        siteDAO.save(site3);
        logger.info(site4.toString());
        siteDAO.save(site4);
        logger.info(site5.toString());
        siteDAO.save(site5);
        logger.info(site6.toString());
        siteDAO.save(site6);
        logger.info(site7.toString());
        siteDAO.save(site7);
        logger.info(site8.toString());
        siteDAO.save(site8);
        logger.info(site9.toString());
        siteDAO.save(site9);



    }
}
