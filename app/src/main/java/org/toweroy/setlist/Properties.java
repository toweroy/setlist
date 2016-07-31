package org.toweroy.setlist;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by richardtolman on 7/31/16.
 */

public class Properties {
    private static final String API_KEY_ATTR = "api_key";
    private static String sApiKey = "";

    protected static String readJson(InputStream fis) {
        String json = "";

        try {
            int size = fis.available();
            byte[] buffer = new byte[size];
            fis.read(buffer);
            fis.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return json;
    }

    public static String getApiKey(String input) {
        String apiKey = "";

        try {
            JSONObject json = new JSONObject(input);
            apiKey = json.getString(API_KEY_ATTR);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return apiKey;
    }

    protected static void setSetlistFmApiKey(String apiKey) {
        sApiKey = apiKey;
    }

    protected static String getSetlistFmApiKey() {
        return sApiKey;
    }
}
