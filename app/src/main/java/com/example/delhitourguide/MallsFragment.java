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
 * Use the {@link MallsFragment#} factory method to
 * create an instance of this fragment.
 */
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_listview, container, false);

        ArrayList<India> place = new ArrayList<>();

        place.add(new India("Select CityWalk", "NEW DELHI, INDIA", R.drawable.select));
        place.add(new India("DLF Promenade", " NEW DELHI, INDIA", R.drawable.dlfpro));
        place.add(new India("The Great India Place", "New Delhi , India", R.drawable.great));
        place.add(new India("DLF Mall of India", "New Delhi, India", R.drawable.dlf));
        place.add(new India("City Square Mall", "Gurgaon, Haryana, India", R.drawable.city));
        place.add(new India("TDI Mall", "New Delhi , India", R.drawable.tdi));
        place.add(new India("Metro Walk Mall", "Delhi, India ", R.drawable.metro));
        place.add(new India("Pacific Mall", "New Delhi , India", R.drawable.pacific));
        place.add(new India("Ambience Mall", "New Delhi , India", R.drawable.ambience));
        place.add(new India("Vegas Mall ", "GURGAON, INDIA", R.drawable.vegas));
        place.add(new India("The Chanakya", "New Delhi , India", R.drawable.chanakya));
        place.add(new India("Ansal Plaza", "New Delhi , India", R.drawable.ansal));


        ListView listView = rootView.findViewById(R.id.list);
        IndiaArrayadapter arrayAdapter = new IndiaArrayadapter(getActivity(), place);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext() , InfoActivity.class);
                intent.putExtra("name" , "near");
                startActivity(intent);
            }
        });

        return rootView;

    }
}