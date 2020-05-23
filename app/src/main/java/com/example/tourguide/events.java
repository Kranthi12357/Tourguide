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
 * Use the {@link events} factory method to
 * create an instance of this fragment.
 */
public class events extends Fragment {
    // TODO: Rename parameter arguments, choose names that match


    public events() {
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
        View root =  inflater.inflate(R.layout.fragment_events, container, false);
        ArrayList<Tour> arrayList = new ArrayList<Tour>();
        arrayList.add(new Tour(R.drawable.food,getString(R.string.nightdance),getString(R.string.dubai)));
        arrayList.add(new Tour(R.drawable.nightresort,getString(R.string.waiter),getString(R.string.london)));
        arrayList.add(new Tour(R.drawable.beach,getString(R.string.telephone),getString(R.string.tajmahal)));
        arrayList.add(new Tour(R.drawable.wheel,getString(R.string.london),getString(R.string.beach)));
        arrayList.add(new Tour(R.drawable.hotels,getString(R.string.nightresort),getString(R.string.dubai)));
        TourAdapter tourAdapter = new TourAdapter(root.getContext(),arrayList);
        ListView listView = (ListView) root.findViewById(R.id.event_list);
        listView.setAdapter(tourAdapter);
        return root;
    }
}
