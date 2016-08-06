package org.toweroy.setlist.setlistfm.obj;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    private final List<ArtistSets> sets;
    private final String info;
    private final String url;

    public Setlist(String name, String id, String eventDate, String lastUpdated, String versionId,
                   String tour, String lastFmEventId, Artist artist, Venue venue, List<ArtistSets> sets, String info, String url) {
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

    public List<ArtistSets> getSets() {
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

    public static class SetlistTypeAdapter implements JsonDeserializer<List<Setlist>> {
        public List<Setlist> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext ctx) {
            List<Setlist> vals = new ArrayList<>();
            if (json.isJsonArray()) {
                for (JsonElement e : json.getAsJsonArray()) {
                    vals.add((Setlist) ctx.deserialize(e, Setlist.class));
                }
            } else if (json.isJsonObject()) {
                vals.add((Setlist) ctx.deserialize(json, Setlist.class));
            } else if (json.isJsonPrimitive()) {
                vals = Collections.emptyList();
            } else {
                throw new RuntimeException("Unexpected JSON type: " + json.getClass());
            }
            return vals;
        }
    }

    public static Setlist toSetlist(String data) {
        Type artistSetListType = new TypeToken<List<ArtistSet>>() {}.getType();
        Type artistSetListsType = new TypeToken<List<ArtistSets>>() {}.getType();
        Type setlistType = new TypeToken<List<Setlist>>() {}.getType();
        Type songType = new TypeToken<List<Song>>() {}.getType();
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(artistSetListType, new ArtistSet.ArtistSetTypeAdapter())
                .registerTypeAdapter(artistSetListsType, new ArtistSets.ArtistSetsTypeAdapter())
                .registerTypeAdapter(setlistType, new Setlist.SetlistTypeAdapter())
                .registerTypeAdapter(songType, new Song.SongTypeAdapter())
                .create();
        return gson.fromJson(data, Setlist.class);
    }
}
