package com.example.delhitourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 pager2= (ViewPager2) findViewById(R.id.viewpager);

        DelhiAdapter adapter= new DelhiAdapter(getSupportFragmentManager() ,getLifecycle());

        pager2.setAdapter(adapter);

        TabLayout layout = findViewById(R.id.tablayout);

        layout.addTab(layout.newTab().setText("Sights"));
        layout.addTab(layout.newTab().setText("Hotels"));
        layout.addTab(layout.newTab().setText("Shopping"));
        layout.addTab(layout.newTab().setText("Food"));

        layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager2.setCurrentItem(layout.getSelectedTabPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                layout.selectTab(layout.getTabAt(position));
            }
        });

    }
}