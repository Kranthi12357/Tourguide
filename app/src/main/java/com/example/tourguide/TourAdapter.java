package com.example.tourguide;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {


    public TourAdapter(@NonNull Context context, @NonNull ArrayList<Tour> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Tour tour = getItem(position);
        View CurrentView = convertView;
        if (CurrentView == null){
            CurrentView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        ImageView imageView = CurrentView.findViewById(R.id.imageView);
        TextView textView = CurrentView.findViewById(R.id.title);
        TextView textView1 = CurrentView.findViewById(R.id.description);
        imageView.setImageResource(tour.getImageView());
        textView.setText(tour.getText());
        textView1.setText(tour.getSmalltext());
        return CurrentView;
    }
}
