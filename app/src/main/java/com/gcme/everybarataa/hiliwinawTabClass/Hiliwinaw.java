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
import com.gcme.everybarataa.hiliwinawFragments.FragmentOne;
import com.gcme.everybarataa.hiliwinawFragments.FragmentTwo;
import com.gcme.everybarataa.hiliwinawFragments.FragmentSix;
import com.gcme.everybarataa.hiliwinawFragments.FragmentThree;
import com.gcme.everybarataa.R;
import com.gcme.everybarataa.AboutUs;
import com.gcme.everybarataa.Feedback;
import com.gcme.everybarataa.TeleEshtaol;

public class Hiliwinaw extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabclass_hiliwinaw);

        toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager =  findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout =  findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

//        FloatingActionButton fab =  findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_SEND);
//                intent.setType("vnd.android-dir/mms-sms");
//                intent.putExtra("address", "+251911202110");
//                intent.putExtra("sms_body", "ሜሴጆን ይጻፉ!!!");
//                startActivity(intent);
//            }
//        });
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
                    fragment = new FragmentOne();
                     }
                if (position == 1) {

                    fragment = new FragmentTwo();
                    }


                if (position == 2) {

                    fragment = new FragmentThree();

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
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_aboutus, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.menu_share) {
//            Intent shareIntent = new Intent(Intent.ACTION_SEND);
//            shareIntent.setType("text/html");
//            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "SUBJECT");
//            shareIntent.putExtra(Intent.EXTRA_TEXT, "https://www.habeshastudent.com/m/existence.html");
//            startActivity(Intent.createChooser(shareIntent, "choose one"));


            String shareBody = "https://www.habeshastudent.com/m/existence.html";
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "SUBJECT");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "choose one"));


        }else if (id == R.id.call) {

            Intent myIntent = new Intent(Hiliwinaw.this, TeleEshtaol.class);
            startActivity(myIntent);
        }else if (id == R.id.feedback) {

            Intent myIntent = new Intent(Hiliwinaw.this, Feedback.class);
            startActivity(myIntent);
        }else if (id == R.id.aboutus) {

            Intent myIntent = new Intent(Hiliwinaw.this, AboutUs.class);
            startActivity(myIntent);
        }

        return true;
    }
}