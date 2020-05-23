package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class Places extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    // TODO: Rename and change types of parameters


    public Places() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_places, container, false);
        ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(R.drawable.woman,getString(R.string.woman),getString(R.string.boating)));
        tour.add(new Tour(R.drawable.taj,getString(R.string.taj),getString(R.string.tajmahal)));
        tour.add(new Tour(R.drawable.telephone,getString(R.string.telephone),getString(R.string.telephone)));
        tour.add(new Tour(R.drawable.wheel,getString(R.string.london),getString(R.string.london)));
        tour.add(new Tour(R.drawable.woman,getString(R.string.woman),getString(R.string.boat)));
        tour.add(new Tour(R.drawable.beach,getString(R.string.beach),getString(R.string.dubai)));

        TourAdapter tourAdapter = new TourAdapter(root.getContext(),tour);
        ListView listView = root.findViewById(R.id.places_list);
        listView.setAdapter(tourAdapter);
        return root;
    }
}
