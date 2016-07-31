package org.toweroy.setlist.setlistfm.obj;

import com.google.gson.annotations.SerializedName;

/**
 * Coords POJO
 *
 * <p>
 * name     type    description
 * long     double  The longitude part of the coordinates.
 * lat      double  The latitude part of the coordinates.
 * <p>
 *
 * Created by richardtolman on 7/31/16.
 */
public class Coords {
    @SerializedName("@long")
    private final double longi;
    @SerializedName("@lat")
    private final double lat;
    private final Country country;

    public Coords(double longi, double lat, Country country) {
        this.longi = longi;
        this.lat = lat;
        this.country = country;
    }

    public double getLongi() {
        return longi;
    }

    public double getLat() {
        return lat;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Coords {" +
                "longi=" + longi +
                ", lat=" + lat +
                ", country=" + country +
                '}';
    }
}
