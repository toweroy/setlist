package org.toweroy.setlist;

import org.junit.Test;
import org.toweroy.setlist.setlistfm.obj.Attended;
import org.toweroy.setlist.setlistfm.req.SetlistFmRequest;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

import static org.junit.Assert.assertEquals;

/**
 * Created by richardtolman on 7/31/16.
 */
public class SetlistFmRequestTest {
    private static final String BASE_URL = "http://api.setlist.fm/rest/0.1/";
    private static final String USER_PATH = "user/";
    private static final String ATTENDED_JSON = "/attended.json";
    private static final String USERNAME = "toweroy";

    @Test
    public void getAttendedPage() throws IOException {
        String attendedUrl = BASE_URL + USER_PATH + USERNAME + ATTENDED_JSON;
        HttpUrl.Builder urlBuilder = HttpUrl.parse(attendedUrl).newBuilder();
        OkHttpClient client = new OkHttpClient();
        String url = urlBuilder.build().toString();
        String response = SetlistFmRequest.run(client, url);
        Attended setlists = Attended.toAttended(response);
        System.out.println("Output: " + setlists.toString());
    }

    @Test
    public void getAttendedSpecifiedPage() throws IOException {
        String attendedUrl = BASE_URL + USER_PATH + USERNAME + ATTENDED_JSON;
        HttpUrl.Builder urlBuilder = HttpUrl.parse(attendedUrl).newBuilder();
        urlBuilder.addQueryParameter("p", "1");
        OkHttpClient client = new OkHttpClient();
        String urlPage1 = urlBuilder.build().toString();
        String responsePage1 = SetlistFmRequest.run(client, urlPage1);
        Attended setlistsPage1 = Attended.toAttended(responsePage1);
        System.out.println("Page 1: " + setlistsPage1.toString());

        HttpUrl.Builder url2Builder = HttpUrl.parse(attendedUrl).newBuilder();
        url2Builder.addQueryParameter("p", "2");
        String urlPage2 = url2Builder.build().toString();
        String responsePage2 = SetlistFmRequest.run(client, urlPage2);
        Attended setlistsPage2 = Attended.toAttended(responsePage2);
        System.out.println("Page 2: " + setlistsPage2.toString());

        assertEquals(1, setlistsPage1.getSetlists().get(0).getPage());
        assertEquals(2, setlistsPage2.getSetlists().get(0).getPage());
    }
}
