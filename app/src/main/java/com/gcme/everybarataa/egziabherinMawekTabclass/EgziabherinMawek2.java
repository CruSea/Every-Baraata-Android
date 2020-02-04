package com.gcme.everybarataa.egziabherinMawekTabclass;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import com.gcme.everybarataa.egziabherinMawekFragment.FragmentThirty;
import com.gcme.everybarataa.egziabherinMawekFragment.FragmentTwenty7;
import com.gcme.everybarataa.egziabherinMawekFragment.FragmentTwenty8;
import com.gcme.everybarataa.egziabherinMawekFragment.FragmentTwenty9;
import com.gcme.everybarataa.R;
import com.gcme.everybarataa.AboutUs;
import com.gcme.everybarataa.Feedback;
import com.gcme.everybarataa.TeleEshtaol;

/**
 * Created by buty on 12/29/15.
 */
public class EgziabherinMawek2 extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ShareActionProvider myShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egziabherin_mawek2);

        toolbar = (Toolbar) findViewById(R.id.toolbar28);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager28);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs28);
        tabLayout.setupWithViewPager(viewPager);



    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;


            if (position == 0) {
                fragment = new FragmentTwenty9();
            }
            if (position == 1) {
                fragment = new FragmentTwenty8();
            }
            if (position == 2) {
                fragment = new FragmentTwenty7();
            }
            if (position == 3) {
                fragment = new FragmentThirty();
            }

            return fragment;
        }
        @Override
        public int getCount() {
            return 4;
        }


        @Override
        public CharSequence getPageTitle(int position) {


            if (position == 0) {
                return getResources().getString(R.string.egziabher_tselotin_yimelisal);
            }
            if (position == 1) {
                return getResources().getString(R.string.eyesus_lemin_mote);
            }
            if (position == 2) {
                return getResources().getString(R.string.egziabherin_begil_mawek);
            }
            if (position == 3) {
                return getResources().getString(R.string.eyesus_manew);
            }


            return null;
        }
    }


}

