package com.gcme.everybarataa.yehiwotTiyakeTabClass;

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

import com.gcme.everybarataa.yehiwotTiyakeFragments.FragmentEight;
import com.gcme.everybarataa.yehiwotTiyakeFragments.FragmentNine;
import com.gcme.everybarataa.yehiwotTiyakeFragments.FragmentSeven;
import com.gcme.everybarataa.R;
import com.gcme.everybarataa.AboutUs;
import com.gcme.everybarataa.Feedback;
import com.gcme.everybarataa.TeleEshtaol;

/**
 * Created by buty on 12/29/15.
 */
public class YehiwotTiyake extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ShareActionProvider myShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabclass_yehiwottiyake);

        toolbar =  findViewById(R.id.toolbar6);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager =  findViewById(R.id.viewpager6);
        setupViewPager(viewPager);

        tabLayout =  findViewById(R.id.tabs6);
        tabLayout.setupWithViewPager(viewPager);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
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
                fragment = new FragmentSeven();
            }
            if (position == 1) {
                fragment = new FragmentEight();
            }
            if (position == 2) {
                fragment = new FragmentNine();
            }

            return fragment;
        }
        @Override
        public int getCount() {
            return 3;
        }


        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0) {
                return getResources().getString(R.string.hiwot_lemin_kebad_hone);
            }
            if (position == 1) {
                return getResources().getString(R.string.yehiwote_alama_mndnew);
            }
            if (position == 2) {
                return getResources().getString(R.string.bechink_sinikebeb);
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

            String shareBody = "https://www.habeshastudent.com/m/life.html";
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