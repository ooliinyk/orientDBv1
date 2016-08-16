package com.dao;

import com.orientechnologies.orient.object.db.OObjectDatabaseTx;
import com.pojo.PushMessage;
import com.pojo.Site;
import com.pojo.Tag;


import java.util.List;

/**
 * Created by user on 13.08.2016.
 */

public class PushMessageDAO extends AbstractDao<PushMessage> {


    public PushMessageDAO() {
    }


    public PushMessageDAO(OObjectDatabaseTx db) {
        super(db);
    }

    public List<PushMessage> getAll() {
        return super.getAll("PushMessage");
    }

    public long getNumbersForPushMessageByTag(Tag tag) {
        long tmp = 0;

        for (PushMessage pushMessage : db.browseClass(PushMessage.class)) {

            if (pushMessage.getTag() != null && pushMessage.getTag().equals(tag)) {
                tmp++;

            }
        }
        logger.info("tmp =" + tmp);
        return tmp;
    }

    public long getNumbersForPushMessageBySite(Site site) {
        long tmp = 0;

        for (PushMessage pushMessage : db.browseClass(PushMessage.class)) {
            if (pushMessage.getSite() != null && pushMessage.getSite().equals(site)) {
                tmp++;
            }

        }
        logger.info("tmp =" + tmp);
        return tmp;
    }

    public long getNumbersForPushMessageByTagAndSite(Site site, Tag tag) {
        long tmp = 0;

        for (PushMessage pushMessage : db.browseClass(PushMessage.class)) {

                if (pushMessage.getSite() != null && pushMessage.getSite().equals(site)) {

                    if (pushMessage.getTag() != null && pushMessage.getTag().equals(tag)) {
                        tmp++;
                    }

            }
        }
        logger.info("tmp =" + tmp);
        return tmp;
    }


    @Override
    public void update(PushMessage obj, PushMessage objNew) {

        for (PushMessage pushMessage : db.browseClass(PushMessage.class)) {

            if (pushMessage.equals(obj)) {

                pushMessage.setId(objNew.getId());
                pushMessage.setIcon(objNew.getIcon());
                pushMessage.setClicked(objNew.isClicked());
                pushMessage.setDeliverd(objNew.isDeliverd());
                pushMessage.setDuration(objNew.getDuration());
                pushMessage.setFollower(objNew.getFollower());
                pushMessage.setTag(objNew.getTag());
                pushMessage.setSite(objNew.getSite());

                db.save(pushMessage);

            }
        }
    }

    @Override
    public void delete(PushMessage obj) {
        for (PushMessage pushMessage : db.browseClass(PushMessage.class)) {

            if (pushMessage.equals(obj)) {
                db.delete(obj);

            }
        }
    }

    @Override
    public void print() {
        for (PushMessage pushMessage : db.browseClass(PushMessage.class)) {

            System.out.println(pushMessage.toString());
        }

    }

    @Override
    public void deleteAll() {
        for (PushMessage pushMessage : db.browseClass(PushMessage.class)) {

            db.delete(pushMessage);
        }
    }
}