package org.toweroy.setlist.setlistfm.obj;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Song POJO
 *
 * Resource: http://api.setlist.fm/docs/data_ns0.html#song
 *
 * Attributes
 * <p>
 * name     type	description
 * name     string	The name of the song. E.g. Yesterday or "Wish You Were Here"
 * tape     boolean	The song came from tape rather than being performed live. See the tape section of the guidelines for valid usage.
 *
 * Child Elements
 * <p>
 * name (type)	min/max occurs	description
 * with (artist)	0/1	A different Artist than the performing one that joined the stage for this song.
 * cover (artist)	0/1	The original Artist of this song, if different to the performing artist.
 * info (string)	0/1	Special incidents or additional information about the way the song was performed at this specific concert. See the setlist.fm guidelines for a complete list of allowed content.
 * <p>
 * Created by richardtolman on 7/31/16.
 */
public class Song {
    @SerializedName("@name")
    private final String name;
    @SerializedName("@tape")
    private final boolean tape;
    private final Artist with;
    private final Artist cover;
    @SerializedName("@info")
    private final String info;

    public Song(String name, boolean tape, Artist with, Artist cover, String info) {
        this.name = name;
        this.tape = tape;
        this.with = with;
        this.cover = cover;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public boolean isTape() {
        return tape;
    }

    public Artist getWith() {
        return with;
    }

    public Artist getCover() {
        return cover;
    }

    public String getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "Song {" +
                "name='" + name + '\'' +
                ", tape=" + tape +
                ", with=" + with +
                ", cover=" + cover +
                ", info='" + info + '\'' +
                '}';
    }

    public static class SongTypeAdapter implements JsonDeserializer<List<Song>> {
        public List<Song> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext ctx) {
            List<Song> vals = new ArrayList<>();
            if (json.isJsonArray()) {
                for (JsonElement e : json.getAsJsonArray()) {
                    vals.add((Song) ctx.deserialize(e, Song.class));
                }
            } else if (json.isJsonObject()) {
                vals.add((Song) ctx.deserialize(json, Song.class));
            } else if (json.isJsonPrimitive()) {
                vals = new ArrayList<>();
            } else {
                throw new RuntimeException("Unexpected JSON type: " + json.getClass());
            }
            return vals;
        }
    }
}
