package com.example.delhitourguide;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CinemaFragment#} factory method to
 * create an instance of this fragment.
 */
public class CinemaFragment extends Fragment {


    public CinemaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_listview, container, false);

        ArrayList<India> place = new ArrayList<>();

        place.add(new India("Berco's", "NEW DELHI, INDIA", R.drawable.berco));
        place.add(new India("Olive Bar & Kitchen", "NEW DELHI, INDIA", R.drawable.olive));
        place.add(new India("Farzi Cafe", "Central New Delhi , India" , R.drawable.farzi));
        place.add(new India("Beeryani", "New Delhi, India", R.drawable.beeryani));
        place.add(new India("Indian Accent", "Gurgaon, Haryana, India", R.drawable.indian));
        place.add(new India("Pind Balluchi", "New Delhi , India", R.drawable.pind));
        place.add(new India("Om Sweets", "Delhi, India ", R.drawable.om));
        place.add(new India("Parikrama The Revolving Restraunt", "Central New Delhi , India" , R.drawable.parikrama));
        place.add(new India("Sagar Ratna", "Central New Delhi , India" , R.drawable.sagar));
        place.add(new India("Lord of the Drinks ", "GURGAON, INDIA", R.drawable.lord));
        place.add(new India("Summer House Cafe", "New Delhi , India", R.drawable.summer));
        place.add(new India("Ardor 2.1", "Central New Delhi , India" , R.drawable.ardor));

        ;
        ListView listView = rootView.findViewById(R.id.list);
        IndiaArrayadapter arrayAdapter = new IndiaArrayadapter(getActivity(), place);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext() , InfoActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}