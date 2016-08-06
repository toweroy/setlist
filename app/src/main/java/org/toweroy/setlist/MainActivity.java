package org.toweroy.setlist;

import android.content.res.AssetManager;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.common.base.Preconditions;

import org.toweroy.setlist.setlistfm.AttendedFragment;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements AttendedFragment.OnFragmentInteractionListener {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        AttendedFragment attendedFragment = new AttendedFragment();
        fragmentTransaction.add(R.id.fragment_container, attendedFragment);
        fragmentTransaction.commit();
        readApiKey();
    }

    private void readApiKey() {
        AssetManager assetManager = getAssets();
        String apiKey = "";

        try {
            String apiKeyJson = Properties.readJson(assetManager.open("setlist-api-key.json"));
            Preconditions.checkNotNull(apiKeyJson);
            apiKey = Properties.getApiKey(apiKeyJson);
        } catch (IOException e) {
            Log.e(TAG, "Unable to load api key json file", e);
        }

        Preconditions.checkNotNull(apiKey);
        Properties.setSetlistFmApiKey(apiKey);
        Log.d(TAG, "SetlistFm api key = " + Properties.getSetlistFmApiKey());
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
