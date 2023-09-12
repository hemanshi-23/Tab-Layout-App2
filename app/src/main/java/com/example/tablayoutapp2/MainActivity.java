package com.example.tablayoutapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private int[] navIcons = {
            R.drawable.basic,
            R.drawable.advance,
            R.drawable.pro
    };

    public String[] navTitle = {
            "Basic",
            "Advance",
            "Pro"
    };

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;
    int i;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.TabLayout);
        viewPager = (ViewPager) findViewById(R.id.ViewPager);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.add(new Fragment_1(navTitle[0]),"PAGE 1");
        viewPagerAdapter.add(new Fragment_2(navTitle[1]),"Page 2");
        viewPagerAdapter.add(new Fragment_3(navTitle[2]),"Page 3");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        for(  i=0; i<tabLayout.getTabCount() ; i++)
        {
            LinearLayout NavTab = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.nav_tab,null);

            // NavTab = findViewById(R.id.NavLayout);

            TextView tab_label = NavTab.findViewById(R.id.nav_title);
            ImageView tab_icon = NavTab.findViewById(R.id.nav_icon);

            tab_label.setText(navTitle[i]);
            tab_icon.setImageResource(navIcons[i]);

            // for selecting first tab when user opens the app.
           /* if(i == 0) {
                tab_label.setTextColor(getResources().getColor(R.color.black));
                tab_icon.setImageResource(navIcons[i]);
            } else {
                tab_label.setTextColor(getResources().getColor(R.color.white));
                tab_icon.setImageResource(navIcons[i]);
            }*/

            tabLayout.getTabAt(i).setCustomView(NavTab);

        }
    }
}