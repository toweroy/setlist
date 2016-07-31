package org.toweroy.setlist;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by richardtolman on 7/31/16.
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class PropertiesTest {

    private static final String API_KEY = "key!!!";
    private static final String API_KEY_JSON = "{\"api_key\": \"" + API_KEY + "\"}";

    @Test
    public void loadApiKey() throws JSONException {
        String loadedJson = loadJson(API_KEY_JSON);
        assertFalse(loadedJson.isEmpty());
        String apiKey = Properties.getApiKey(loadedJson);
        assertEquals("key!!!", apiKey);
    }

    private String loadJson(String filename) {
        InputStream is = new ByteArrayInputStream(filename.getBytes(Charset.forName("UTF-8")));
        return Properties.readJson(is);
    }
}
