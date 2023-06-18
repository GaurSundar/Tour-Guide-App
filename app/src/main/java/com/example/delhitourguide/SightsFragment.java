package com.example.delhitourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SightsFragment#} factory method to
 * create an instance of this fragment.
 */
public class SightsFragment extends Fragment {


    IndiaArrayadapter arrayAdapter;
    EditText text ;


    public SightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_listview, container, false);

        ArrayList<India> place = new ArrayList<>();
        text = rootView.findViewById(R.id.search);



        place.add(new India("India Gate", "Nearest Metro Station: Central Sectretariat Metro Station", R.drawable.indiagate));
        place.add(new India("Gurudwara Bangla Sahib", "Nearest Metro Station: Patel Chowk Metro Station", R.drawable.banglasahib));
        place.add(new India("Red Fort", "Nearest Metro Station: Chandni Chowk Metro Station", R.drawable.redfort));
        place.add(new India("Jama Masjid", "Nearest Metro Station: Chawri Bazaar Metro Station", R.drawable.jama));
        place.add(new India("Purana Qila", "Nearest Metro Station: Supreme Court Metro Station", R.drawable.puranaqila));
        place.add(new India("Rashtrapati Bhavan", "Nearest Metro Station: Central Sectretariat Metro Station", R.drawable.bhavan));
        place.add(new India("Akshardham Temple", "Nearest Metro Station: Akshardham Metro Station", R.drawable.akshardham));
        place.add(new India("Sunder Nursery", "Nearest Metro Station: JLN Stadium Metro Station", R.drawable.sundar));
        place.add(new India("LaxmiNarayan mandir", "Nearest Metro Station: RK Ashram Marg Metro Station", R.drawable.laxmi));
        place.add(new India("Qutub Minar", "Nearest Metro Station: Qutub Minar Metro Station", R.drawable.minar));
        place.add(new India("Lotus Temple", "Nearest Metro Station: Kalkaji Metro Station", R.drawable.lotus));
        place.add(new India("Jantar Mantar", "Nearest Metro Station: Janpath Metro Station", R.drawable.jantar));
        place.add(new India("Humayun's Tomb", "Nearest Metro Station: JLN Stadium Metro Station", R.drawable.tomb));


        ListView listView = rootView.findViewById(R.id.list);
        arrayAdapter = new IndiaArrayadapter(getActivity() , place);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Uri uri = Uri.parse("geo:0,0?q=India Gate");
                Intent intent = new Intent(Intent.ACTION_VIEW , uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });

        text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                SightsFragment.this.arrayAdapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        return rootView;
    }
}