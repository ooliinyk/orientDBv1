package com.config;


import com.dao.*;

import com.orientechnologies.orient.core.db.ODatabase;
import com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx;
import com.orientechnologies.orient.core.metadata.schema.OClass;
import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import com.pojo.PushMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class AppConfig {



    @Bean
    public SiteDAO siteDAO() {
        return new SiteDAO(orientDbDatabase());
    }

    @Bean
    public TagDAO tagDAO() {
        return new TagDAO(orientDbDatabase());
    }

    @Bean
    public FollowerDAO followerDAO() {
        return new FollowerDAO(orientDbDatabase());
    }

    @Bean
    public PushMessageDAO pushMessageDAO() {
        return new PushMessageDAO(orientDbDatabase());
    }

    @Bean
    OObjectDatabaseTx orientDbDatabase() {

        OObjectDatabaseTx database = new OObjectDatabaseTx("local:test");
        if (database.exists()) {
            database.open("admin", "admin");
        } else {
            database.create();
        }
        database.getEntityManager().registerEntityClasses("com.pojo");

        return database;
    }
}
 