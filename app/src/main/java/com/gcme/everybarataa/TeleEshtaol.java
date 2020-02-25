package com.gcme.everybarataa;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * Created by buty on 1/4/16.
 */
public class TeleEshtaol extends AppCompatActivity implements View.OnClickListener {

    private Button Teleshtaol, WebViewBtn;
    private static final int REQUEST_CALL = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teleshtaol);
        TextView t = findViewById(R.id.tvteleshtaol);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/AbyssinicaSIL-R.ttf");
        t.setTypeface(tf);

        Teleshtaol = findViewById(R.id.call_teleshtaol);
        Teleshtaol.setOnClickListener(this);
        WebViewBtn = findViewById(R.id.goToFbBtn);
        WebViewBtn.setOnClickListener(this);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_teleshtaol);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home:
                        startActivity(new Intent(TeleEshtaol.this, MainActivity.class));
                        Animatoo.animateSlideRight(TeleEshtaol.this);
                        break;
                    case R.id.menu_teleshataol:
                        //  startActivity(new Intent(TeleEshtaol.this, TeleEshtaol.class));
                        break;
                    case R.id.menu_contact_us:
                        startActivity(new Intent(TeleEshtaol.this, Feedback.class));
                        Animatoo.animateSlideRight(TeleEshtaol.this);
                        break;
                    case R.id.menu_about:
                        startActivity(new Intent(TeleEshtaol.this, AboutUs.class));
                        Animatoo.animateSlideRight(TeleEshtaol.this);
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.call_teleshtaol:
                makePhoneCall();

                break;
            case R.id.goToFbBtn:
                startActivity(new Intent(this, WebView.class));
                break;
        }
        return;
    }

    private void makePhoneCall() {
        String number = "+251116174400";
            if (ContextCompat.checkSelfPermission(TeleEshtaol.this,
                    Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(TeleEshtaol.this,
                        new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                makePhoneCall();
            } else {
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
            }
        }
    }
}