package com.gcme.everybarataa.hiliwinawTabClass;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.gcme.everybarataa.MainActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import com.gcme.everybarataa.hiliwinawFragments.FragmentFive;
import com.gcme.everybarataa.hiliwinawFragments.FragmentFour;
import com.gcme.everybarataa.hiliwinawFragments.FragmentEgziabherAle;
import com.gcme.everybarataa.hiliwinawFragments.FragmentEgziabherManew;
import com.gcme.everybarataa.hiliwinawFragments.FragmentSix;
import com.gcme.everybarataa.hiliwinawFragments.FragmentYegziabherMenor;
import com.gcme.everybarataa.R;
import com.gcme.everybarataa.AboutUs;
import com.gcme.everybarataa.Feedback;
import com.gcme.everybarataa.TeleEshtaol;

/**
 * Created by buty on 12/29/15.
 */
public class Hiliwinaw extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabclass_hiliwinaw);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tabs);
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
                fragment = new FragmentEgziabherAle();
            }
            if (position == 1) {

                fragment = new FragmentEgziabherManew();
            }


            if (position == 2) {

                fragment = new FragmentYegziabherMenor();

            }

            if (position == 3) {
                fragment = new FragmentFour();
            }

            if (position == 4) {
                fragment = new FragmentFive();
            }

            if (position == 5) {
                fragment = new FragmentSix();
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 6;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0) {
                return getResources().getString(R.string.egziabher_ale_title);
            }
            if (position == 1) {
                return getResources().getString(R.string.egziabher_manew);
            }
            if (position == 2) {
                return getResources().getString(R.string.egziabher_menor_ergit_new);
            }
            if (position == 3) {
                return getResources().getString(R.string.bemejemeria_hulu_neger_bado_neberin);
            }
            if (position == 4) {
                return getResources().getString(R.string.egziabher_man_feterew);
            }
            if (position == 5) {
                return getResources().getString(R.string.egziabher_yet_new);
            }

            return null;
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}