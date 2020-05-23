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
public class Restaurants extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

    public Restaurants() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_restaurants, container, false);
        ArrayList<Tour> tour = new ArrayList<Tour>();
        tour.add(new Tour(R.drawable.glasses,getString(R.string.glasses),getString(R.string.chicken)));
        tour.add(new Tour(R.drawable.table,getString(R.string.table),getString(R.string.mutton)));
        tour.add(new Tour(R.drawable.chair,getString(R.string.chair),getString(R.string.biryani)));
        tour.add(new Tour(R.drawable.waiter,getString(R.string.waiter),getString(R.string.haleem)));
        tour.add(new Tour(R.drawable.food,getString(R.string.food),getString(R.string.friedrice)));

        TourAdapter tourAdapter = new TourAdapter(root.getContext(),tour);
        ListView listView = root.findViewById(R.id.restaurant_list);
        listView.setAdapter(tourAdapter);

        return root;
    }
}
