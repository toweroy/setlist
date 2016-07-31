package org.toweroy.setlist.setlistfm;

import org.junit.Test;
import org.toweroy.setlist.setlistfm.obj.Attended;

import static org.junit.Assert.assertEquals;

/**
 * Created by richardtolman on 06/08/16.
 */
public class AttendedTest {
    private static final String ATTENDED_JSON = "{\n" +
            " \"setlists\":{\n" +
            "  \"@itemsPerPage\":\"10\",\n" +
            "  \"@page\":\"1\",\n" +
            "  \"@total\":\"61\",\n" +
            "  \"setlist\":[\n" +
            "   {\n" +
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
            "   },\n" +
            "   {\n" +
            "    \"@eventDate\":\"17-07-2016\",\n" +
            "    \"@id\":\"63ff2ecb\",\n" +
            "    \"@lastUpdated\":\"2016-07-17T22:33:27.000+0000\",\n" +
            "    \"@tour\":\"2016\\/2017 Anniversary Shows\",\n" +
            "    \"@versionId\":\"23acec5f\",\n" +
            "    \"artist\":{\n" +
            "     \"@disambiguation\":\"\",\n" +
            "     \"@mbid\":\"6a726ac6-019e-455c-8bbb-571a77bed52e\",\n" +
            "     \"@name\":\"Thin Lizzy\",\n" +
            "     \"@sortName\":\"Thin Lizzy\",\n" +
            "     \"@tmid\":\"840376\",\n" +
            "     \"url\":\"http:\\/\\/www.setlist.fm\\/setlists\\/thin-lizzy-33d6802d.html\"\n" +
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
            "        \"@name\":\"Jailbreak\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Are You Ready\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Killer on the Loose\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Dancing in the Moonlight (It's Caught Me in Its Spotlight)\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Massacre\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Emerald\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Rosalie\",\n" +
            "        \"cover\":{\n" +
            "         \"@disambiguation\":\"\",\n" +
            "         \"@mbid\":\"4382b934-64c3-47ac-98db-65f26d845c48\",\n" +
            "         \"@name\":\"Bob Seger\",\n" +
            "         \"@sortName\":\"Seger, Bob\",\n" +
            "         \"@tmid\":\"771811\",\n" +
            "         \"url\":\"http:\\/\\/www.setlist.fm\\/setlists\\/bob-seger-7bd6be3c.html\"\n" +
            "        }\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Don't Believe a Word\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Cowboy Song\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"The Boys Are Back in Town\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Róisín Dubh (Black Rose): A Rock Legend\"\n" +
            "       },\n" +
            "       {\n" +
            "        \"@name\":\"Whiskey in the Jar\",\n" +
            "        \"cover\":{\n" +
            "         \"@disambiguation\":\"Special Purpose Artist\",\n" +
            "         \"@mbid\":\"9be7f096-97ec-4615-8957-8d40b5dcbc41\",\n" +
            "         \"@name\":\"[traditional]\",\n" +
            "         \"@sortName\":\"[traditional]\",\n" +
            "         \"url\":\"http:\\/\\/www.setlist.fm\\/setlists\\/traditional-5bd2f7e4.html\"\n" +
            "        }\n" +
            "       }\n" +
            "      ]\n" +
            "     }\n" +
            "    },\n" +
            "    \"url\":\"http:\\/\\/www.setlist.fm\\/setlist\\/thin-lizzy\\/2016\\/parc-de-can-zam-santa-coloma-de-gramenet-spain-63ff2ecb.html\"\n" +
            "    }\n" +
            "  ]\n" +
            "}\n" +
            "}";

    @Test
    public void getAttendedFromJson() {
        Attended attended = Attended.toAttended(ATTENDED_JSON);
        assertEquals(1, attended.getSetlists().size());
        assertEquals(10, attended.getSetlists().get(0).getItemsPerPage());
    }
}
