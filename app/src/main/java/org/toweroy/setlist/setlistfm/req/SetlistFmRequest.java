package org.toweroy.setlist.setlistfm.req;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Response;

/**
 * Created by richardtolman on 7/31/16.
 */
public class SetlistFmRequest {

    public static String run(OkHttpClient client, String url) throws IOException {
        okhttp3.Request request = new okhttp3.Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
