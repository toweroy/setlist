package org.toweroy.setlist.setlistfm;

import com.google.gson.Gson;

import org.junit.Test;
import org.toweroy.setlist.setlistfm.obj.Song;

import static org.junit.Assert.*;

/**
 * Created by richardtolman on 7/31/16.
 */
public class SongTest {
    private static final String SONG_JSON = "{\n" +
            "        \"@name\":\"Rosalie\",\n" +
            "        \"cover\":{\n" +
            "         \"@disambiguation\":\"\",\n" +
            "         \"@mbid\":\"4382b934-64c3-47ac-98db-65f26d845c48\",\n" +
            "         \"@name\":\"Bob Seger\",\n" +
            "         \"@sortName\":\"Seger, Bob\",\n" +
            "         \"@tmid\":\"771811\",\n" +
            "         \"url\":\"http:\\/\\/www.setlist.fm\\/setlists\\/bob-seger-7bd6be3c.html\"\n" +
            "        }\n" +
            "}";

    @Test
    public void getSongFromJson() {
        Gson gson = new Gson();
        Song song = gson.fromJson(SONG_JSON, Song.class);
        assertEquals("4382b934-64c3-47ac-98db-65f26d845c48", song.getCover().getMbid());
        assertEquals("Bob Seger", song.getCover().getName());
        assertEquals("Seger, Bob", song.getCover().getSortName());
        assertEquals("771811", song.getCover().getTmid());
        assertEquals("http://www.setlist.fm/setlists/bob-seger-7bd6be3c.html", song.getCover().getUrl());
    }
}