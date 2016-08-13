package com.dao;

import com.orientechnologies.orient.core.db.ODatabase;
import com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx;
import org.springframework.context.annotation.Bean;

/**
 * Created by user on 05.08.2016.
 */
public class CreateDB {
    @Bean
    ODatabase orientDbDatabase() {
        ODatabase database = new ODatabaseDocumentTx("local:databases/demo");
        if (!database.exists()) {
            database.create();
        }
        return database;
    }
}
