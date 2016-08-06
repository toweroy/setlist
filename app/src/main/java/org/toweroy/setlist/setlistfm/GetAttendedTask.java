package org.toweroy.setlist.setlistfm;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import org.toweroy.setlist.setlistfm.obj.Attended;
import org.toweroy.setlist.setlistfm.obj.Setlist;
import org.toweroy.setlist.setlistfm.obj.SetlistItemAdapter;
import org.toweroy.setlist.setlistfm.obj.Setlists;
import org.toweroy.setlist.setlistfm.req.SetlistFmRequest;

import java.io.IOException;
import java.util.List;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/**
 * Created by richardtolman on 06/08/16.
 */
public class GetAttendedTask extends AsyncTask<Void, String, Void> {

    private static final String ATTENDED_JSON = "/attended.json";
    private static final String BASE_URL = "http://api.setlist.fm/rest/0.1/";
    private static final String USER_PATH = "user/";
    private static final String PAGE_QUERY = "p";
    private static final String TAG = GetAttendedTask.class.getSimpleName();

    private Context mContext;
    private final String mUsername;
    private List<Setlist> mSetlists;
    private SetlistItemAdapter mSetlistItemAdapter;

    GetAttendedTask(Context context, String username, List<Setlist> setlists, SetlistItemAdapter setlistsAdapter) {
        this.mContext = context;
        this.mUsername = username;
        this.mSetlists = setlists;
        this.mSetlistItemAdapter = setlistsAdapter;
    }

    @Override
    protected Void doInBackground(Void... unused) {
        int totalPages = 1;

        for (int i = 1; i <= totalPages; i++) {
            Attended attendedObject = getAttendedPage(i);
            totalPages = calculateTotalPages(attendedObject.getSetlists().get(0).getItemsPerPage(),
                    attendedObject.getSetlists().get(0).getTotal());

            for (Setlists setlists : attendedObject.getSetlists()) {
                for (Setlist setlist : setlists.getSetlists()) {
                    mSetlists.add(setlist);
                }
            }
        }

        Log.d(TAG, "Finished getting setlists");
        return (null);
    }

    @Override
    protected void onPostExecute(Void unused) {
        mSetlistItemAdapter.notifyDataSetChanged();
        Toast.makeText(mContext, "Setlists loaded!", Toast.LENGTH_SHORT).show();
    }

    private int calculateTotalPages(int itemsPerPage, int totalItems) {
        int pages = totalItems / itemsPerPage;
        if (totalItems % itemsPerPage != 0) {
            pages++;
        }
        return pages;
    }

    private Attended getAttendedPage(int page) {
        Log.d(TAG, "Getting attended page [" + page + "]");
        String attendedUrl = BASE_URL + USER_PATH + mUsername + ATTENDED_JSON;
        HttpUrl.Builder urlBuilder = HttpUrl.parse(attendedUrl).newBuilder();
        urlBuilder.addQueryParameter(PAGE_QUERY, String.valueOf(page));
        OkHttpClient client = new OkHttpClient();
        String url = urlBuilder.build().toString();
        String response = null;

        try {
            response = SetlistFmRequest.run(client, url);
        } catch (IOException e) {
            Log.e(TAG, "Unable to execute GET request for: " + url);
        }

        return Attended.toAttended(response);
    }
}
