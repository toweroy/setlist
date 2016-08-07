package org.toweroy.setlist.setlistfm;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.toweroy.setlist.R;
import org.toweroy.setlist.db.ArtistDbHelper;
import org.toweroy.setlist.setlistfm.obj.Artist;
import org.toweroy.setlist.setlistfm.obj.Setlist;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AttendedFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AttendedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AttendedFragment extends Fragment {

    private final String TAG = this.getTag();
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String USERNAME = "toweroy";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    protected RecyclerView mRecyclerView;
    protected SetlistItemAdapter mSetlistsAdapter;
    protected RecyclerView.LayoutManager mLayoutManager;
    protected ArtistDbHelper mArtistDbHelper;
    protected List<Setlist> mSetlists = new ArrayList<>();
    private OnFragmentInteractionListener mListener;

    public AttendedFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AttendedFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AttendedFragment newInstance(String param1, String param2) {
        AttendedFragment fragment = new AttendedFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        loadArtistDb();
    }

    private void loadArtistDb() {
        mArtistDbHelper = new ArtistDbHelper(getContext());
        List<Artist> dbArtists = ArtistDbHelper.read(mArtistDbHelper, null, null);
        Log.d(TAG, "Found " + dbArtists.size() + " artist(s)");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_attended, container, false);
        rootView.setTag(getTag());

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.attendedListRecyclerView);

//        Setlist setlists[] = {
//                new Setlist("Debase Medis", "", "", "", "", "", "", new Artist("", "", "", "Baroness", "", "", ""), null, null, "", ""),
//                new Setlist("Rockfest", "", "", "", "", "", "", new Artist("", "", "", "Iron Maiden", "", "", ""), null, null, "", ""),
//                new Setlist("Rockfest", "", "", "", "", "", "", new Artist("", "", "", "Amon Amarth", "", "", ""), null, null, "", ""),
//                new Setlist("Debase Medis", "", "", "", "", "", "", new Artist("", "", "", "Devin Townsend Project", "", "", ""), null, null, "", ""),
//                new Setlist("Debase Medis", "", "", "", "", "", "", new Artist("", "", "", "GYBE", "", "", ""), null, null, "", ""),
//                new Setlist("Debase Hornstull", "", "", "", "", "", "", new Artist("", "", "", "Kataklysm", "", "", ""), null, null, "", "")
//        };

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mSetlistsAdapter = new SetlistItemAdapter(mSetlists);
        mRecyclerView.setAdapter(mSetlistsAdapter);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        // Start loading setlists
        new GetAttendedTask(getContext(), USERNAME, mSetlists, mSetlistsAdapter, mArtistDbHelper).execute();
        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
