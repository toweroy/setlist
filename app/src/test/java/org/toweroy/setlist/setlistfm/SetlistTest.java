package org.toweroy.setlist.setlistfm;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.junit.Test;
import org.toweroy.setlist.setlistfm.obj.ArtistSet;
import org.toweroy.setlist.setlistfm.obj.ArtistSets;
import org.toweroy.setlist.setlistfm.obj.Setlist;

import java.lang.reflect.Type;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by richardtolman on 7/31/16.
 */
public class SetlistTest {
    private static final String SETLIST_JSON = "{\n" +
            "    \"@eventDate\":\"17-07-2016\",\n" +
            "    \"@id\":\"53ff2bcd\",\n" +
            "    \"@lastUpdated\":\"2016-07-22T13:08:27.000+0000\",\n" +
            "    \"@versionId\":\"53ac23e9\",\n" +
            "    \"artist\":{\n" +
            "     \"@disambiguation\":\"US death metal band\",\n" +
            "     \"@mbid\":\"2e8ac3ed-2a89-4377-ba80-790106aba554\",\n" +
            "     \"@name\":\"Obituary\",\n" +
            "     \"@sortName\":\"Obituary\",\n" +
            "     \"@tmid\":\"741644\",\n" +
            "     \"url\":\"http:\\/\\/www.setlist.fm\\/setlists\\/obituary-bd6fd46.html\"\n" +
            "    },\n" +
            "    \"venue\":{\n" +
            "     \"@id\":\"3bd4246c\",\n" +
            "     \"@name\":\"Parc de Can Zam\",\n" +
            "     \"city\":{\n" +
            "      \"@id\":\"3109981\",\n" +
            "      \"@name\":\"Santa Coloma de Gramenet\",\n" +
            "      \"@state\":\"Catalonia\",\n" +
            "      \"@stateCode\":\"56\",\n" +
            "      \"coords\":{\n" +
            "       \"@lat\":\"41.4515243040983\",\n" +
            "       \"@long\":\"2.20810174942017\"\n" +
            "      },\n" +
            "      \"country\":{\n" +
            "       \"@code\":\"ES\",\n" +
            "       \"@name\":\"Spain\"\n" +
            "      }\n" +
            "     },\n" +
            "     \"url\":\"http:\\/\\/www.setlist.fm\\/venue\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-3bd4246c.html\"\n" +
            "    },\n" +
            "    \"sets\":{\n" +
            "     \"set\":{\n" +
            "      \"song\":[\n" +
            "       {\n" +
            "        \"@name\":\"Redneck Stomp\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Centuries of Lies\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Visions in My Head\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Intoxicated\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Bloodsoaked\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Dying\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Find the Arise\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"'Til Death\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Don't Care\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Chopped in Half\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Turned Inside Out\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Slowly We Rot\"\n" +
            "       }\n" +
            "      ]\n" +
            "     }\n" +
            "    },\n" +
            "    \"url\":\"http:\\/\\/www.setlist.fm\\/setlist\\/obituary\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-53ff2bcd.html\"\n" +
            "}";

    @Test
    public void getSetlistFromJson() {
        Setlist setlist = Setlist.toSetlist(SETLIST_JSON);
        assertEquals("53ff2bcd", setlist.getId());
        assertEquals("2016-07-22T13:08:27.000+0000", setlist.getLastUpdated());
        assertEquals(1, setlist.getSets().get(0).getSets().size());
        assertEquals("Redneck Stomp", setlist.getSets().get(0).getSets().get(0).getSongs().get(0).getName());
        assertEquals("Centuries of Lies", setlist.getSets().get(0).getSets().get(0).getSongs().get(1).getName());
        assertEquals("Slowly We Rot", setlist.getSets().get(0).getSets().get(0).getSongs().get(11).getName());
    }
}