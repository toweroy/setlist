package org.toweroy.setlist.setlistfm.obj;

import com.google.gson.annotations.SerializedName;

/**
 * Setlist POJO
 *
 * Resource: http://api.setlist.fm/docs/data_ns0.html#setlist
 *
 * <p>
 * Attributes
 * <p>
 * name             type    description
 * id               string  unique identifier
 * eventDate        string  date of the concert in the format "dd-MM-yyyy"
 * lastUpdated      string  date, time and time zone of the last update to this setlist in the format "yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ"
 * versionId        string  unique identifier of the version
 * tour             string  the setlist's tour
 * lastFmEventId    int     the id this event has on last.fm
 */
public class Setlist {
    private final String name;
    @SerializedName("@id")
    private final String id;
    @SerializedName("@eventDate")
    private final String eventDate;
    @SerializedName("@lastUpdated")
    private final String lastUpdated;
    @SerializedName("@versionId")
    private final String versionId;
    private final String tour;
    private final String lastFmEventId;
    private final Artist artist;
    private final Venue venue;
    private final ArtistSets sets;
    private final String info;
    private final String url;

    public Setlist(String name, String id, String eventDate, String lastUpdated, String versionId,
                   String tour, String lastFmEventId, Artist artist, Venue venue, ArtistSets sets, String info, String url) {
        this.name = name;
        this.id = id;
        this.eventDate = eventDate;
        this.lastUpdated = lastUpdated;
        this.versionId = versionId;
        this.tour = tour;
        this.lastFmEventId = lastFmEventId;
        this.artist = artist;
        this.venue = venue;
        this.sets = sets;
        this.info = info;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public String getVersionId() {
        return versionId;
    }

    public String getTour() {
        return tour;
    }

    public String getLastFmEventId() {
        return lastFmEventId;
    }

    public Artist getArtist() {
        return artist;
    }

    public Venue getVenue() {
        return venue;
    }

    public ArtistSets getSets() {
        return sets;
    }

    public String getInfo() {
        return info;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Setlist {" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", versionId='" + versionId + '\'' +
                ", tour='" + tour + '\'' +
                ", lastFmEventId='" + lastFmEventId + '\'' +
                ", artist='" + artist.toString() + '\'' +
                ", venue='" + venue.toString() + '\'' +
                ", sets='" + sets.toString() + '\'' +
                ", info='" + info + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
