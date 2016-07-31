package org.toweroy.setlist.setlistfm.obj;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Set POJO
 * <p>
 * Resource: http://api.setlist.fm/docs/data_ns0.html#set
 * <p>
 * name     type    description
 * encore   int     if the set is an encore, this is the number of the encore, starting with 1 for the first encore, 2 for the second and so on.
 * name     string  the description/name of the set. E.g. "Acoustic set" or "Paul McCartney solo"
 * <p>
 *
 * Created by richardtolman on 7/31/16.
 */
public class ArtistSet {

    @SerializedName("@encore")
    private final int encore;
    private final String name;
    @SerializedName("song")
    private final List<Song> songs;

    public ArtistSet(int encore, String name, List<Song> songs) {
        this.encore = encore;
        this.name = name;
        this.songs = songs;
    }

    public int getEncore() {
        return encore;
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return "ArtistSet {" +
                "encore=" + encore +
                ", name='" + name + '\'' +
                ", songs=" + songs +
                '}';
    }
}
