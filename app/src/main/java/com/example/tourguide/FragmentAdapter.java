package com.example.tourguide;

import android.content.res.Resources;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class FragmentAdapter extends FragmentStatePagerAdapter  {
    int Nooftabs;
    Resources resources;
     FragmentAdapter(FragmentManager fm, AppCompatActivity activity, int nooftabs){
        super(fm);
        Nooftabs = nooftabs;
        resources = activity.getResources();
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Hotels();
            case 1:return new Places();
            case 2:return new Restaurants();
            case 3:return new events();
            default:return null;
        }
    }
    @Override
    public CharSequence getPageTitle(int position){
         switch (position){
             case 0:return resources.getString(R.string.hotel);
             case 1:return resources.getString(R.string.places);
             case 2:return resources.getString(R.string.foods);
             case 3:return  resources.getString(R.string.events);
             default:return null;
         }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
