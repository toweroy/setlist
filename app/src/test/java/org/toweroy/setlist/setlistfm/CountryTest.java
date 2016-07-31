package org.toweroy.setlist.setlistfm;

import com.google.gson.Gson;

import org.junit.Test;
import org.toweroy.setlist.setlistfm.obj.Country;

import static org.junit.Assert.*;

/**
 * Created by richardtolman on 7/31/16.
 */
public class CountryTest {
    private static final String COUNTRY_JSON = "{\n" +
            "   \"@code\":\"ES\",\n" +
            "   \"@name\":\"Spain\"\n" +
            "}";

    @Test
    public void getCountryFromJson() {
        Gson gson = new Gson();
        Country country = gson.fromJson(COUNTRY_JSON, Country.class);
        assertEquals("ES", country.getCode());
        assertEquals("Spain", country.getName());
    }
}
