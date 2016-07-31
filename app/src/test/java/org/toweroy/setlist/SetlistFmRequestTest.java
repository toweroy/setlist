package org.toweroy.setlist;

import org.junit.Test;
import org.toweroy.setlist.setlistfm.obj.Attended;
import org.toweroy.setlist.setlistfm.req.SetlistFmRequest;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/**
 * Created by richardtolman on 7/31/16.
 */
public class SetlistFmRequestTest {
    private static final String BASE_URL = "http://api.setlist.fm/rest/0.1/";
    private static final String USER_PATH = "user/";
    private static final String ATTENDED_JSON = "/attended.json";

    @Test
    public void getAttendedPage() throws IOException {
        final String username = "toweroy";
        String attendedUrl = BASE_URL + USER_PATH + username + ATTENDED_JSON;
        HttpUrl.Builder urlBuilder = HttpUrl.parse(attendedUrl).newBuilder();
        OkHttpClient client = new OkHttpClient();
        String url = urlBuilder.build().toString();
        String response = SetlistFmRequest.run(client, url);
        Attended setlists = Attended.toAttended(response);
        System.out.println("Output: " + setlists.toString());
    }
}
