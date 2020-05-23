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
public class Hotels extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    public Hotels() {
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
        View root =  inflater.inflate(R.layout.fragment_hotels, container, false);
        ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(R.drawable.beach,getString(R.string.beach),getString(R.string.beachindubai)));
        tour.add(new Tour(R.drawable.club,getString(R.string.club),getString(R.string.Clubathyd)));
        tour.add(new Tour(R.drawable.laptop,getString(R.string.Lpa),getString(R.string.Lpa)));
        tour.add(new Tour(R.drawable.tent,getString(R.string.tent),getString(R.string.tentatnight)));
        tour.add(new Tour(R.drawable.swimming,getString(R.string.swimming),getString(R.string.swimmingpool)));
        tour.add(new Tour(R.drawable.hotels,getString(R.string.hotels),getString(R.string.hotels)));
        tour.add(new Tour(R.drawable.nightresort,getString(R.string.nightresort),getString(R.string.nightresort)));
        tour.add(new Tour(R.drawable.room,getString(R.string.rooom),getString(R.string.rooms)));
        tour.add(new Tour(R.drawable.nightresort,getString(R.string.nightresort),getString(R.string.nightdance)));

        TourAdapter tourAdapter = new TourAdapter(root.getContext(),tour);
        ListView listView = root.findViewById(R.id.hotels_list);
        listView.setAdapter(tourAdapter);
        return root;
    }
}
