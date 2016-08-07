package org.toweroy.setlist.db;

import android.provider.BaseColumns;

/**
 * Created by richardtolman on 07/08/16.
 */
public class SetlistDbo {

    public SetlistDbo() {
    }

    public static abstract class SetlistEntry implements BaseColumns {
        public static final String TABLE_NAME = "setlist";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_SETLIST_ID = "setlistid";
        public static final String COLUMN_NAME_EVENT_DATA = "eventdate";
        public static final String COLUMN_NAME_LAST_UPDATED = "lastupdated";
        public static final String COLUMN_NAME_VERSION_ID = "versionid";
        public static final String COLUMN_NAME_TOUR = "tour";
        public static final String COLUMN_NAME_LAST_FM_EVENT_ID = "lastfmeventid";
        public static final String COLUMN_NAME_ARTIST = "lastfmeventid";
    }
}
