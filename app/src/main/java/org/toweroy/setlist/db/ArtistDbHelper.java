package org.toweroy.setlist.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import org.toweroy.setlist.setlistfm.obj.Artist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by richardtolman on 07/08/16.
 */
public class ArtistDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Artist.db";
    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + ArtistDbo.ArtistEntry.TABLE_NAME + " (" +
                    ArtistDbo.ArtistEntry._ID + " INTEGER PRIMARY KEY," +
                    ArtistDbo.ArtistEntry.COLUMN_NAME_DISAMBIGUATION + TEXT_TYPE + COMMA_SEP +
                    ArtistDbo.ArtistEntry.COLUMN_NAME_MBID + TEXT_TYPE + COMMA_SEP +
                    ArtistDbo.ArtistEntry.COLUMN_NAME_TMID + TEXT_TYPE + COMMA_SEP +
                    ArtistDbo.ArtistEntry.COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP +
                    ArtistDbo.ArtistEntry.COLUMN_NAME_SORTNAME + TEXT_TYPE + COMMA_SEP +
                    ArtistDbo.ArtistEntry.COLUMN_NAME_INFO + TEXT_TYPE + COMMA_SEP +
                    ArtistDbo.ArtistEntry.COLUMN_NAME_URL + TEXT_TYPE +
                    " )";
    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + ArtistDbo.ArtistEntry.TABLE_NAME;

    public ArtistDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(SQL_DELETE_ENTRIES);
        onCreate(sqLiteDatabase);
    }

    public static long insert(ArtistDbHelper dbHelper, Artist artist) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(ArtistDbo.ArtistEntry.COLUMN_NAME_DISAMBIGUATION, artist.getDisambiguation());
        values.put(ArtistDbo.ArtistEntry.COLUMN_NAME_MBID, artist.getMbid());
        values.put(ArtistDbo.ArtistEntry.COLUMN_NAME_TMID, artist.getTmid());
        values.put(ArtistDbo.ArtistEntry.COLUMN_NAME_NAME, artist.getName());
        values.put(ArtistDbo.ArtistEntry.COLUMN_NAME_SORTNAME, artist.getSortName());
        values.put(ArtistDbo.ArtistEntry.COLUMN_NAME_INFO, artist.getInfo());
        values.put(ArtistDbo.ArtistEntry.COLUMN_NAME_URL, artist.getUrl());

        long newRowId = db.insert(
                ArtistDbo.ArtistEntry.TABLE_NAME,
                null,
                values);
        artist.setId(newRowId);

        return newRowId;
    }

    public static int insert(ArtistDbHelper dbHelper, List<Artist> artists) {
        int inserted = 0;

        for (Artist artist : artists) {
            insert(dbHelper, artist);
            inserted++;
        }

        return inserted;
    }

    public static List<Artist> read(ArtistDbHelper dbHelper, String selection, String[] selectionArgs) {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String[] projection = {
                ArtistDbo.ArtistEntry._ID,
                ArtistDbo.ArtistEntry.COLUMN_NAME_DISAMBIGUATION,
                ArtistDbo.ArtistEntry.COLUMN_NAME_MBID,
                ArtistDbo.ArtistEntry.COLUMN_NAME_TMID,
                ArtistDbo.ArtistEntry.COLUMN_NAME_NAME,
                ArtistDbo.ArtistEntry.COLUMN_NAME_SORTNAME,
                ArtistDbo.ArtistEntry.COLUMN_NAME_INFO,
                ArtistDbo.ArtistEntry.COLUMN_NAME_URL
        };

        String sortOrder =
                ArtistDbo.ArtistEntry.COLUMN_NAME_NAME + " DESC";

        Cursor c = db.query(
                ArtistDbo.ArtistEntry.TABLE_NAME,
                projection,
                selection,
                selectionArgs,
                null,
                null,
                sortOrder
        );

        c.moveToFirst();
        List<Artist> artists = new ArrayList<>();

        if (c.getCount() != 0) {
            while (!c.isLast()) {
                artists.add(createArtist(c));
            }
        }

        return artists;
    }

    private static Artist createArtist(Cursor c) {
        long artistId = c.getLong(c.getColumnIndexOrThrow(ArtistDbo.ArtistEntry._ID));
        String dismabiguation = c.getString(c.getColumnIndexOrThrow(ArtistDbo.ArtistEntry.COLUMN_NAME_DISAMBIGUATION));
        String mbid = c.getString(c.getColumnIndexOrThrow(ArtistDbo.ArtistEntry.COLUMN_NAME_MBID));
        String tmid = c.getString(c.getColumnIndexOrThrow(ArtistDbo.ArtistEntry.COLUMN_NAME_TMID));
        String name = c.getString(c.getColumnIndexOrThrow(ArtistDbo.ArtistEntry.COLUMN_NAME_NAME));
        String sortName = c.getString(c.getColumnIndexOrThrow(ArtistDbo.ArtistEntry.COLUMN_NAME_SORTNAME));
        String info = c.getString(c.getColumnIndexOrThrow(ArtistDbo.ArtistEntry.COLUMN_NAME_INFO));
        String url = c.getString(c.getColumnIndexOrThrow(ArtistDbo.ArtistEntry.COLUMN_NAME_URL));
        return new Artist(artistId, dismabiguation, mbid, tmid, name, sortName, info, url);
    }

    public static List<Artist> getArtistByName(ArtistDbHelper dbHelper, String name) {
        String selection = ArtistDbo.ArtistEntry.COLUMN_NAME_NAME + " LIKE ?";
        String[] selectionArgs = {String.valueOf(name)};
        return read(dbHelper, selection, selectionArgs);
    }
}
