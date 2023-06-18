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
 * Use the {@link HotelsFragment#} factory method to
 * create an instance of this fragment.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_listview, container, false);

        ArrayList<India> place = new ArrayList<>();

        place.add(new India("THE OBEROI NEW DELHI", "NEW DELHI, INDIA", R.drawable.oberoi));
        place.add(new India("THE LODHI Hotel", "NEW DELHI, INDIA", R.drawable.lodhi));
        place.add(new India("The Leela Palace", "New Delhi , India", R.drawable.leela));
        place.add(new India("THE CLARIDGES", "New Delhi, India", R.drawable.claridges));
        place.add(new India("ITC Grand Bharat", "Gurgaon, Haryana, India", R.drawable.itc));
        place.add(new India("The Roseate", "New Delhi , India", R.drawable.roseate));
        place.add(new India("The Leela Ambience", "Delhi, India ", R.drawable.leeelaambience));
        place.add(new India("Taj Palace Hotel", "New Delhi , India", R.drawable.taj));
        place.add(new India("The LaLiT New Delhi", "New Delhi , India", R.drawable.lalit));
        place.add(new India("The Grand New Delhi", "New Delhi , India", R.drawable.grand));
        place.add(new India("Pride Plaza Hotel", "New Delhi , India", R.drawable.pride));
        place.add(new India("Radisson Blue Hotel", "Paschim Vihar , New Delhi", R.drawable.radisson));


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
