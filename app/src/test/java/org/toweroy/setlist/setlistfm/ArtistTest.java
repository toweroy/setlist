package org.toweroy.setlist.setlistfm;

import com.google.gson.Gson;

import org.junit.Test;
import org.toweroy.setlist.setlistfm.obj.Artist;

import static org.junit.Assert.assertEquals;

/**
 * Created by richardtolman on 7/31/16.
 */
public class ArtistTest {

    private static final String ARTIST_JSON = "{\n" +
            "     \"@disambiguation\":\"US death metal band\",\n" +
            "     \"@mbid\":\"2e8ac3ed-2a89-4377-ba80-790106aba554\",\n" +
            "     \"@name\":\"Obituary\",\n" +
            "     \"@sortName\":\"Obituary\",\n" +
            "     \"@tmid\":\"741644\",\n" +
            "     \"url\":\"http:\\/\\/www.setlist.fm\\/setlists\\/obituary-bd6fd46.html\"\n" +
            "    }";

    @Test
    public void getArtistFromJson() {
        Gson gson = new Gson();
        Artist artist = gson.fromJson(ARTIST_JSON, Artist.class);
        assertEquals("Obituary", artist.getName());
    }
}