package org.toweroy.setlist.setlistfm;

import com.google.gson.Gson;

import org.junit.Test;
import org.toweroy.setlist.setlistfm.obj.Coords;

import static org.junit.Assert.*;

/**
 * Created by richardtolman on 7/31/16.
 */
public class CoordsTest {
    private static final String COORDS_JSON = "{\n" +
            "   \"@lat\":\"41.4515243040983\",\n" +
            "   \"@long\":\"2.20810174942017\"\n" +
            "}";

    @Test
    public void getCoordsFromJson() {
        Gson gson = new Gson();
        Coords coords = gson.fromJson(COORDS_JSON, Coords.class);
        assertEquals(41.4515243040983, coords.getLat(), 0.0);
        assertEquals(2.20810174942017, coords.getLongi(), 0.0);
    }
}
