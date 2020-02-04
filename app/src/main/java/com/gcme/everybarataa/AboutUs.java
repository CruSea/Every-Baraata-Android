package com.gcme.everybarataa;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * Created by buty on 1/4/16.
 */
public class AboutUs extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_about);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home:
                        startActivity(new Intent(AboutUs.this, MainActivity.class));
                        Animatoo.animateSplit(AboutUs.this);

                        break;
                    case R.id.menu_teleshataol:
                        startActivity(new Intent(AboutUs.this, TeleEshtaol.class));
                        Animatoo.animateSplit(AboutUs.this);

                        break;
                    case R.id.menu_contact_us:
                        startActivity(new Intent(AboutUs.this, Feedback.class));
                        Animatoo.animateSplit(AboutUs.this);

                        break;
                    case R.id.menu_about:
                       // startActivity(new Intent(AboutUs.this, AboutUs.class));
                        break;
                }
                return true;
            }
        });
    }
}
