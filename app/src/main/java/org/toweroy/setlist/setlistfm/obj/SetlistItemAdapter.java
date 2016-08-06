package org.toweroy.setlist.setlistfm.obj;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.toweroy.setlist.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by richardtolman on 06/08/16.
 */

public class SetlistItemAdapter extends RecyclerView.Adapter<SetlistItemAdapter.ViewHolder> {
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


}