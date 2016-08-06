package org.toweroy.setlist.setlistfm.obj;

import com.google.gson.annotations.SerializedName;

/**
 * Venue POJO
 *
 * Resource: http://api.setlist.fm/docs/data_ns0.html#venue
 *
 * name     type    description
 * id       string  unique identifier
 * name     string  the name of the venue, usually without city and country. E.g. "Madison Square Garden" or "Royal Albert Hall"
 *
 * Created by richardtolman on 7/31/16.
 */
public class Venue {

    @SerializedName("@id")
    private final String id;
    @SerializedName("@name")
    private final String name;
    private final City city;
    private final String url;

    public Venue(String id, String name, City city, String url) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public City getCity() {
        return city;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Venue {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", city=" + city +
                ", url='" + url + '\'' +
                '}';
    }
}
