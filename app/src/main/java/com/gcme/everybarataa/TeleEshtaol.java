package com.gcme.everybarataa;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * Created by buty on 1/4/16.
 */
public class TeleEshtaol extends AppCompatActivity implements View.OnClickListener {

    private Button Teleshtaol, WebViewBtn;

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
                        Animatoo.animateSplit(TeleEshtaol.this);
                        break;
                    case R.id.menu_teleshataol:
                      //  startActivity(new Intent(TeleEshtaol.this, TeleEshtaol.class));
                        break;
                    case R.id.menu_contact_us:
                        startActivity(new Intent(TeleEshtaol.this, Feedback.class));
                        Animatoo.animateSplit(TeleEshtaol.this);
                        break;
                    case R.id.menu_about:
                        startActivity(new Intent(TeleEshtaol.this, AboutUs.class));
                        Animatoo.animateSplit(TeleEshtaol.this);
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

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:+251116174400"));
                if (ActivityCompat.checkSelfPermission(TeleEshtaol.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
//            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+251116174400"));
//            try{
//                startActivity(callIntent);
//                }
//
//             catch (android.content.ActivityNotFoundException ex){
//                     Toast.makeText(getApplicationContext(), "Try again later", Toast.LENGTH_SHORT).show();
//                 }
                break;
            case R.id.goToFbBtn:
                startActivity(new Intent(this, WebView.class));
                break;
        }
        return;
    }


}