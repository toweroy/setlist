package org.toweroy.setlist.setlistfm;

import com.google.gson.Gson;

import org.junit.Test;
import org.toweroy.setlist.setlistfm.obj.City;

import static org.junit.Assert.*;

/**
 * Created by richardtolman on 7/31/16.
 */
public class CityTest {

    private static final String CITY_JSON = "{\n" +
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
            "}";

    @Test
    public void getCityFromJson() {
        Gson gson = new Gson();
        City city = gson.fromJson(CITY_JSON, City.class);
        assertEquals("3109981", city.getId());
        assertEquals("Santa Coloma de Gramenet", city.getName());
        assertEquals("Catalonia", city.getState());
        assertEquals("56", city.getStateCode());
        assertEquals(41.4515243040983, city.getCoords().getLat(), 0.0);
        assertEquals(2.20810174942017, city.getCoords().getLongi(), 0.0);
        assertEquals("ES", city.getCountry().getCode());
        assertEquals("Spain", city.getCountry().getName());

    }
}
