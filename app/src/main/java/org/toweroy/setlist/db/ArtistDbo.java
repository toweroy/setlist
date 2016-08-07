package org.toweroy.setlist.db;

import android.provider.BaseColumns;

/**
 * Created by richardtolman on 07/08/16.
 */
public class ArtistDbo {

    public ArtistDbo() {
    }

    public static abstract class ArtistEntry implements BaseColumns {
        public static final String TABLE_NAME = "artist";
        public static final String COLUMN_NAME_DISAMBIGUATION = "disambiguation";
        public static final String COLUMN_NAME_MBID = "mbid";
        public static final String COLUMN_NAME_TMID = "tmid";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_SORTNAME = "sortname";
        public static final String COLUMN_NAME_INFO = "info";
        public static final String COLUMN_NAME_URL = "url";
    }
}
