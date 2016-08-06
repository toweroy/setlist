package org.toweroy.setlist.setlistfm;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.toweroy.setlist.R;
import org.toweroy.setlist.setlistfm.obj.Setlist;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * Created by richardtolman on 06/08/16.
 */

public class SetlistItemAdapter extends RecyclerView.Adapter<SetlistItemAdapter.ViewHolder> {

    private static final String TAG = SetlistItemAdapter.class.getSimpleName();
    private static final SimpleDateFormat setlistDateFormat = new SimpleDateFormat("dd-MM-yyyy");

    private List<Setlist> setlists = new ArrayList<>();

    public SetlistItemAdapter(List<Setlist> setlists) {
        this.setlists = setlists;
    }

    @Override
    public SetlistItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.attended_item_layout, null);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.imgViewIcon.setImageResource(R.mipmap.ic_artist);
        viewHolder.txtViewArtistName.setText(setlists.get(position).getArtist().getName());
        viewHolder.txtViewLocation.setText(setlists.get(position).getVenue().getName());
    }

    @Override
    public int getItemCount() {
        return setlists.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgViewIcon;
        public TextView txtViewArtistName;
        public TextView txtViewLocation;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.attended_item_icon);
            txtViewArtistName = (TextView) itemLayoutView.findViewById(R.id.attended_item_artist_name);
            txtViewLocation = (TextView) itemLayoutView.findViewById(R.id.attended_item_artist_location);
        }
    }

    static final Comparator<Setlist> ARTIST_NAME = new Comparator<Setlist>() {
        public int compare(Setlist s1, Setlist s2) {
            return s1.getArtist().getName().compareTo(s2.getArtist().getName());
        }
    };

    static final Comparator<Setlist> DATE = new Comparator<Setlist>() {
        public int compare(Setlist s1, Setlist s2) {
            Date d1 = new Date();
            try {
                d1 = setlistDateFormat.parse(s1.getEventDate());
            } catch (ParseException e) {
                Log.e(TAG, "Unable to parse date1 [" + d1 + "]", e);
            }
            Date d2 = new Date();
            try {
                d2 = setlistDateFormat.parse(s2.getEventDate());
            } catch (ParseException e) {
                Log.e(TAG, "Unable to parse date2 [" + d1 + "]", e);
            }
            return d1.compareTo(d2);
        }
    };
}