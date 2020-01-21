package com.gcme.everybarataa.fikirinawesibTabClass;

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
public class FikirnaWesib7 extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabclass_fikirinawesib7);

        toolbar = (Toolbar) findViewById(R.id.toolbar21);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager21);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs21);
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
                fragment = new FragmentTwenty2();
            }
            if (position == 1) {
                fragment = new FragmentTwenty();
            }
            if (position == 2) {
                fragment = new FragmentFiften();
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
                return getResources().getString(R.string.yewesib_film_mirkogna);
            }
            if (position == 1) {
                return getResources().getString(R.string.lifers_yetekarebe_tidar);
            }
            if (position == 2) {
                return getResources().getString(R.string.wesibina_yefikir_guadegna);
            }
            if (position == 3) {
                return getResources().getString(R.string.ewunetegna_yesetoch_mebt_akibari);
            }
            return null;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

// Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu_aboutus, menu);

        return true;


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.menu_share) {

            String shareBody = "https://www.habeshastudent.com/m/relationships.html";
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "SUBJECT");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
            startActivity(Intent.createChooser(sharingIntent, "choose one"));


        }else if (id == R.id.call) {

            Intent myIntent = new Intent(this, TeleEshtaol.class);
            startActivity(myIntent);
        }else if (id == R.id.feedback) {

            Intent myIntent = new Intent(this, Feedback.class);
            startActivity(myIntent);
        }else if (id == R.id.aboutus) {

            Intent myIntent = new Intent(this, AboutUs.class);
            startActivity(myIntent);
        }

        return true;
    }
}
