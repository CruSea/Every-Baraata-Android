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

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

/**
 * Created by buty on 1/4/16.
 */
public class TeleEshtaol extends AppCompatActivity implements View.OnClickListener {
private Button Teleshtaol,WebViewBtn;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teleshtaol);
        TextView t =  findViewById(R.id.tvteleshtaol);
        Typeface tf=Typeface.createFromAsset(getAssets(), "fonts/AbyssinicaSIL-R.ttf");
        t.setTypeface(tf);

        Teleshtaol =   findViewById(R.id.call_teleshtaol);
        Teleshtaol.setOnClickListener(this);
        WebViewBtn = findViewById(R.id.webViewButton);
        WebViewBtn.setOnClickListener(this);
        }

@Override
public void onClick(View v) {
        switch (v.getId()) {
        case R.id.call_teleshtaol:

            Intent callIntent =new Intent(Intent.ACTION_CALL);
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
        case R.id.webViewButton:
                 startActivity(new Intent(this, WebView.class));
             break;
        }
        return;
        }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.call) {
            startActivity(new Intent(this, TeleEshtaol.class));
            return true;
        }
        if (item.getItemId() == R.id.feedback) {
            startActivity(new Intent(this, Feedback.class));
            return true;
        }
        if (item.getItemId() == R.id.aboutus) {
            startActivity(new Intent(this, AboutUs.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

        }