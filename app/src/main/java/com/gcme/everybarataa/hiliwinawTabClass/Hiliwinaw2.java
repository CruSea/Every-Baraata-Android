package com.gcme.everybarataa.hiliwinawTabClass;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

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
public class Hiliwinaw2 extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabclass_hiliwinaw2);

        toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager =  findViewById(R.id.viewpager2);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tabs2);
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
                        fragment = new FragmentYegziabherMenor();
              }
                    if (position == 1) {

                        fragment = new FragmentEgziabherManew();
                }
                    if (position == 2) {

                        fragment = new FragmentEgziabherAle();
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
                return getResources().getString(R.string.egziabher_menor_ergit_new);
            }
            if (position == 1) {
                return getResources().getString(R.string.egziabher_manew);
            }
            if (position == 2) {
                return getResources().getString(R.string.egziabher_ale_title);
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
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//
//        getMenuInflater().inflate(R.menu.menu_aboutus, menu);
//        return true;
//
//    }
//
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        if (item.getItemId() == R.id.menu_share) {
//            String shareBody = "https://www.habeshastudent.com/m/existence.html";
//            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
//            sharingIntent.setType("text/plain");
//            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "SUBJECT");
//            sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
//            startActivity(Intent.createChooser(sharingIntent, "choose one"));
//        }
//
//        if (item.getItemId() == R.id.call) {
//            startActivity(new Intent(this, TeleEshtaol.class));
//            return true;
//        }
//        if (item.getItemId() == R.id.feedback) {
//            startActivity(new Intent(this, Feedback.class));
//            return true;
//        }
//        if (item.getItemId() == R.id.aboutus) {
//            startActivity(new Intent(this, AboutUs.class));
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}