package com.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by user on 04.08.2016.
 */

public class PushMessage {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Follower follower;
    private Site site;
    private Tag tag;
    private boolean clicked;
    private boolean deliverd;
    private  String icon;
    private  int duration;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Follower getFollower() {
        return follower;
    }

    public void setFollower(Follower follower) {
        this.follower = follower;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public boolean isDeliverd() {
        return deliverd;
    }

    public void setDeliverd(boolean deliverd) {
        this.deliverd = deliverd;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "PushMessage{" +
                "id=" + getId()+
                ", follower=" + getFollower() +
                ", site=" + getSite() +
                ", tag=" + getTag() +
                ", clicked=" + isClicked() +
                ", deliverd=" + isDeliverd() +
                ", icon='" + getIcon() + '\'' +
                ", duration=" + getDuration() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PushMessage)) return false;

        PushMessage that = (PushMessage) o;

        if (getId() != that.getId()) return false;
        if (isClicked() != that.isClicked()) return false;
        if (isDeliverd() != that.isDeliverd()) return false;
        if (getDuration() != that.getDuration()) return false;
        if (getFollower() != null ? !getFollower().equals(that.getFollower()) : that.getFollower() != null)
            return false;
        if (getSite() != null ? !getSite().equals(that.getSite()) : that.getSite() != null) return false;
        if (getTag() != null ? !getTag().equals(that.getTag()) : that.getTag() != null) return false;
        return !(getIcon() != null ? !getIcon().equals(that.getIcon()) : that.getIcon() != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getFollower() != null ? getFollower().hashCode() : 0);
        result = 31 * result + (getSite() != null ? getSite().hashCode() : 0);
        result = 31 * result + (getTag() != null ? getTag().hashCode() : 0);
        result = 31 * result + (isClicked() ? 1 : 0);
        result = 31 * result + (isDeliverd() ? 1 : 0);
        result = 31 * result + (getIcon() != null ? getIcon().hashCode() : 0);
        result = 31 * result + getDuration();
        return result;
    }
}
