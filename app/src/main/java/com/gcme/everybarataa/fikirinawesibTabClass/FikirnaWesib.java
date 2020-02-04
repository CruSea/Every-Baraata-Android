package com.gcme.everybarataa.fikirinawesibTabClass;

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

import com.gcme.everybarataa.fikirinawesibFragment.FragmentFiften;
import com.gcme.everybarataa.fikirinawesibFragment.FragmentTwenty;
import com.gcme.everybarataa.fikirinawesibFragment.FragmentTwenty2;
import com.gcme.everybarataa.fikirinawesibFragment.FragmentTwenty5;
import com.gcme.everybarataa.R;
import com.gcme.everybarataa.AboutUs;
import com.gcme.everybarataa.Feedback;
import com.gcme.everybarataa.TeleEshtaol;

/**
 * Created by buty on 12/29/15.
 */
public class FikirnaWesib extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ShareActionProvider myShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabclass_fikirinawesib);

        toolbar = (Toolbar) findViewById(R.id.toolbar14);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager14);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs14);
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
                fragment = new FragmentFiften();
            }
            if (position == 1) {
                fragment = new FragmentTwenty();
            }
            if (position == 2) {
                fragment = new FragmentTwenty2();
            }

            if (position == 3) {
                fragment = new FragmentTwenty5();
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
                return getResources().getString(R.string.wesibina_yefikir_guadegna);
            }
            if (position == 1) {
                return getResources().getString(R.string.lifers_yetekarebe_tidar);
            }
            if (position == 2) {
                return getResources().getString(R.string.yewesib_film_mirkogna);
            }
            if (position == 3) {
                return getResources().getString(R.string.ewunetegna_yesetoch_mebt_akibari);
            }

            return null;
        }
    }

}
