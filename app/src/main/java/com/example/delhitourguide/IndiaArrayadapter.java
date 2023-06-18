package com.example.delhitourguide;

import android.app.Activity;
import android.content.Context;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class IndiaArrayadapter extends ArrayAdapter<India> {

    public IndiaArrayadapter(Activity context , ArrayList<India> place){
        super(context , 0 , place);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemview =  convertView;
        if (listitemview == null) {
            listitemview =  LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        India india = getItem(position);

        TextView textView1 = listitemview.findViewById(R.id.placename);
        textView1.setText(india.getPlacename());
        textView1.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView1.setSelected(true);

        TextView textView2 = listitemview.findViewById(R.id.metro);
        textView2.setText(india.getNearmetro());
        textView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView2.setSelected(true);

        ImageView imageView = listitemview.findViewById(R.id.image);
        imageView.setImageResource(india.getImageid());

        return listitemview;
    }
}
