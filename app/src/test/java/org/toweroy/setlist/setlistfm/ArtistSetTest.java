package org.toweroy.setlist.setlistfm;

import com.google.gson.Gson;

import org.junit.Test;
import org.toweroy.setlist.setlistfm.obj.ArtistSet;

import static org.junit.Assert.*;

/**
 * Created by richardtolman on 7/31/16.
 */
public class ArtistSetTest {
    private static final String ARTIST_SET_JSON = "{\n" +
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
            "}";

    @Test
    public void getArtistSetFromJson() {
        Gson gson = new Gson();
        ArtistSet artistSet = gson.fromJson(ARTIST_SET_JSON, ArtistSet.class);
        assertEquals(12, artistSet.getSongs().size());
        assertEquals("Jailbreak", artistSet.getSongs().get(0).getName());
        assertEquals("Are You Ready", artistSet.getSongs().get(1).getName());
        assertEquals("Killer on the Loose", artistSet.getSongs().get(2).getName());
        assertEquals("Dancing in the Moonlight (It's Caught Me in Its Spotlight)", artistSet.getSongs().get(3).getName());
        assertEquals("Massacre", artistSet.getSongs().get(4).getName());
        assertEquals("Emerald", artistSet.getSongs().get(5).getName());
        assertEquals("Rosalie", artistSet.getSongs().get(6).getName());
        assertEquals("4382b934-64c3-47ac-98db-65f26d845c48", artistSet.getSongs().get(6).getCover().getMbid());
        assertEquals("Bob Seger", artistSet.getSongs().get(6).getCover().getName());
        assertEquals("Seger, Bob", artistSet.getSongs().get(6).getCover().getSortName());
        assertEquals("771811", artistSet.getSongs().get(6).getCover().getTmid());
        assertEquals("http://www.setlist.fm/setlists/bob-seger-7bd6be3c.html", artistSet.getSongs().get(6).getCover().getUrl());
        assertEquals("Don't Believe a Word", artistSet.getSongs().get(7).getName());
        assertEquals("Cowboy Song", artistSet.getSongs().get(8).getName());
        assertEquals("The Boys Are Back in Town", artistSet.getSongs().get(9).getName());
        assertEquals("Róisín Dubh (Black Rose): A Rock Legend", artistSet.getSongs().get(10).getName());
        assertEquals("Whiskey in the Jar", artistSet.getSongs().get(11).getName());
        assertEquals("Special Purpose Artist", artistSet.getSongs().get(11).getCover().getDisambiguation());
        assertEquals("9be7f096-97ec-4615-8957-8d40b5dcbc41", artistSet.getSongs().get(11).getCover().getMbid());
        assertEquals("[traditional]", artistSet.getSongs().get(11).getCover().getName());
        assertEquals("[traditional]", artistSet.getSongs().get(11).getCover().getSortName());
        assertEquals("http://www.setlist.fm/setlists/traditional-5bd2f7e4.html", artistSet.getSongs().get(11).getCover().getUrl());
    }
}