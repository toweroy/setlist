package org.toweroy.setlist.setlistfm;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.junit.Test;
import org.toweroy.setlist.setlistfm.obj.ArtistSet;
import org.toweroy.setlist.setlistfm.obj.ArtistSets;

import java.lang.reflect.Type;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by richardtolman on 7/31/16.
 */
public class ArtistSetsTest {
    private static final String ARTIST_SET_JSON = "{\n" +
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
            "}";
    private static final String ARTIST_SETS_JSON = "{\n"+
            "     \"set\":[\n"+
            "      {\n"+
            "       \"song\":[\n"+
            "        {\n"+
            "         \"@name\":\"Impaled\",\n"+
            "         \"@tape\":\"true\"\n"+
            "        },\n"+
            "        {\n"+
            "         \"@name\":\"You Gotta Believe\"\n"+
            "        },\n"+
            "        {\n"+
            "         \"@name\":\"Caught in a Mosh\"\n"+
            "        },\n"+
            "        {\n"+
            "         \"@name\":\"Got the Time\",\n"+
            "         \"cover\":{\n"+
            "          \"@disambiguation\":\"English musician\",\n"+
            "          \"@mbid\":\"07f6d469-38f3-46da-9cfa-2f532422b84e\",\n"+
            "          \"@name\":\"Joe Jackson\",\n"+
            "          \"@sortName\":\"Jackson, Joe\",\n"+
            "          \"@tmid\":\"852419\",\n"+
            "          \"url\":\"http:\\/\\/www.setlist.fm\\/setlists\\/joe-jackson-4bd6b78a.html\"\n"+
            "         }\n"+
            "        },\n"+
            "        {\n"+
            "         \"@name\":\"Madhouse\"\n"+
            "        },\n"+
            "        {\n"+
            "         \"@name\":\"Fight 'Em 'Til You Can't\"\n"+
            "        },\n"+
            "        {\n"+
            "         \"@name\":\"Evil Twin\"\n"+
            "        },\n"+
            "        {\n"+
            "         \"@name\":\"Antisocial\",\n"+
            "         \"cover\":{\n"+
            "          \"@disambiguation\":\"70s\\/80s French hard rock band\",\n"+
            "          \"@mbid\":\"33d281da-d36f-4d22-9c4f-fa39f9718302\",\n"+
            "          \"@name\":\"Trust\",\n"+
            "          \"@sortName\":\"Trust\",\n"+
            "          \"url\":\"http:\\/\\/www.setlist.fm\\/setlists\\/trust-3d7b14b.html\"\n"+
            "         }\n"+
            "        }\n"+
            "       ]\n"+
            "      },\n"+
            "      {\n"+
            "       \"@encore\":\"1\",\n"+
            "       \"song\":[\n"+
            "        {\n"+
            "         \"@name\":\"Breathing Lightning\"\n"+
            "        },\n"+
            "        {\n"+
            "         \"@name\":\"Indians\"\n"+
            "        }\n"+
            "       ]\n"+
            "      }\n"+
            "     ]\n"+
            "}";

    @Test
    public void getArtistSetFromJson() {
        Type artistSetListType = new TypeToken<List<ArtistSet>>() {}.getType();
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(artistSetListType, new ArtistSet.ArtistSetTypeAdapter())
                .create();
        ArtistSets artistSets = gson.fromJson(ARTIST_SET_JSON, ArtistSets.class);
        assertEquals(1, artistSets.getSets().size());
        assertEquals("Redneck Stomp", artistSets.getSets().get(0).getSongs().get(0).getName());
        assertEquals("Centuries of Lies", artistSets.getSets().get(0).getSongs().get(1).getName());
        assertEquals("Slowly We Rot", artistSets.getSets().get(0).getSongs().get(11).getName());
    }

    @Test
    public void getArtistMultipleSetsFromJson() {
        Type artistSetListType = new TypeToken<List<ArtistSet>>() {}.getType();
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(artistSetListType, new ArtistSet.ArtistSetTypeAdapter())
                .create();
        ArtistSets artistSets = gson.fromJson(ARTIST_SETS_JSON, ArtistSets.class);
        assertEquals(2, artistSets.getSets().size());
        assertEquals("Impaled", artistSets.getSets().get(0).getSongs().get(0).getName());
        assertTrue(artistSets.getSets().get(0).getSongs().get(0).isTape());
        assertEquals("Got the Time", artistSets.getSets().get(0).getSongs().get(3).getName());
        assertEquals(1, artistSets.getSets().get(1).getEncore());
        assertEquals("Breathing Lightning", artistSets.getSets().get(1).getSongs().get(0).getName());
        assertEquals("Indians", artistSets.getSets().get(1).getSongs().get(1).getName());
    }
}