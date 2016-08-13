package com.pojo;

import java.util.List;

/**
 * Created by user on 04.08.2016.
 */
public class Follower {
    private long id;
    private String name;
    private String surname;
    private List<Tag> tags;
    private Site site;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
                
        this.site = site;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", site=" + getSite() +
                ", tags=" + getTags() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Follower)) return false;

        Follower follower = (Follower) o;

        if (getId() != follower.getId()) return false;
        if (getName() != null ? !getName().equals(follower.getName()) : follower.getName() != null) return false;
        if (getSurname() != null ? !getSurname().equals(follower.getSurname()) : follower.getSurname() != null)
            return false;
        getTags().toString();
        if (getTags() != null ? !getTags().equals(follower.getTags()) : follower.getTags() != null) return false;
        return !(getSite() != null ? !getSite().equals(follower.getSite()) : follower.getSite() != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getTags() != null ? getTags().hashCode() : 0);
        result = 31 * result + (getSite() != null ? getSite().hashCode() : 0);
        return result;
    }
}
