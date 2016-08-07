package org.toweroy.setlist.setlistfm.obj;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Artist POJO
 *
 * <p>
 * Resource: http://api.setlist.fm/docs/data_ns0.html#artist
 * <p>Attributes</p>
 * <p>
 * name             type    description
 * disambiguation   string  disambiguation to distinguish between artists with same names
 * mbid             string  unique Musicbrainz Identifier (MBID), e.g. "b10bbbfc-cf9e-42e0-be17-e2c3e1d2600d"
 * tmid             int     unique Ticket Master Identifier (TMID), e.g. 1953
 * name             string  the artist's name, e.g. "The Beatles"
 * sortName         string  the artist's sort name, e.g. "Beatles, The" or "Springsteen, Bruce"
 *
 * Created by richardtolman on 7/31/16.
 */
public class Artist {
    private long artistId = -1;
    @SerializedName("@disambiguation")
    private final String disambiguation;
    @SerializedName("@mbid")
    private final String mbid;
    @SerializedName("@tmid")
    private final String tmid;
    @SerializedName("@name")
    private final String name;
    @SerializedName("@sortName")
    private final String sortName;
    @SerializedName("@info")
    private final String info;
//    @SerializedName("@url")
    private final String url;

    public Artist(long artistId, String disambiguation, String mbid, String tmid, String name, String sortName,
                  String info, String url) {
        this(disambiguation, mbid, tmid, name, sortName, info, url);
        this.artistId = artistId;

    }

    public Artist(String disambiguation, String mbid, String tmid, String name, String sortName,
                  String info, String url) {
        this.disambiguation = disambiguation;
        this.mbid = mbid;
        this.tmid = tmid;
        this.name = name;
        this.sortName = sortName;
        this.info = info;
        this.url = url;
    }

    public long getId() {
        return artistId;
    }

    public void setId(long artistId) {
        this.artistId = artistId;
    }

    public String getDisambiguation() {
        return disambiguation;
    }

    public String getMbid() {
        return mbid;
    }

    public String getTmid() {
        return tmid;
    }

    public String getName() {
        return name;
    }

    public String getSortName() {
        return sortName;
    }

    public String getInfo() {
        return info;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Artist {" +
                "artistId='" + artistId + '\'' +
                ", disambiguation='" + disambiguation + '\'' +
                ", mbid='" + mbid + '\'' +
                ", tmid='" + tmid + '\'' +
                ", name='" + name + '\'' +
                ", sortName='" + sortName + '\'' +
                ", info='" + info + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
