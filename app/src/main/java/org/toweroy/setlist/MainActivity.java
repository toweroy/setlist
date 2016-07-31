package org.toweroy.setlist;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.common.base.Preconditions;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
