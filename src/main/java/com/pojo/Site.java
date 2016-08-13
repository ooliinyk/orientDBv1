package com.pojo;

import java.net.URL;

/**
 * Created by user on 04.08.2016.
 */
public class Site {

    private long id;
    private String name;
    private URL url;
    private String icon;

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

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Site{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", url=" + getUrl() +
                ", icon='" + getIcon() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Site)) return false;

        Site site = (Site) o;

        if (getId() != site.getId()) return false;
        if (getName() != null ? !getName().equals(site.getName()) : site.getName() != null) return false;
        if (getUrl() != null ? !getUrl().equals(site.getUrl()) : site.getUrl() != null) return false;
        return !(getIcon() != null ? !getIcon().equals(site.getIcon()) : site.getIcon() != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getUrl() != null ? getUrl().hashCode() : 0);
        result = 31 * result + (getIcon() != null ? getIcon().hashCode() : 0);
        return result;
    }
}
