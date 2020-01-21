package com.gcme.everybarataa.ActivityFilmoch;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.core.view.MenuItemCompat;

import com.gcme.everybarataa.R;
import com.gcme.everybarataa.AboutUs;
import com.gcme.everybarataa.Feedback;
import com.gcme.everybarataa.TeleEshtaol;

/**
 * Created by buty on 1/4/16.
 */
public class Thirty9 extends AppCompatActivity {

    android.webkit.WebView web5;
    ProgressBar progressBar5;
    private ShareActionProvider myShareActionProvider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filmoch39);

        web5 = (android.webkit.WebView) findViewById(R.id.wvFilmoch39);
        progressBar5 = (ProgressBar) findViewById(R.id.pbFilmoch39);

        web5.setWebViewClient(new myWebClient());
        web5.getSettings().setJavaScriptEnabled(true);
        web5.loadUrl("https://www.youtube.com/watch?v=nvTeDX8jZdw&list=PL5kXjOnjug3O_vDc4QbbwP9R496-OmIiQ&index=7");

    }

    public class myWebClient extends WebViewClient
    {

        @Override
        public void onPageFinished(android.webkit.WebView view, String url) {
            // TODO Auto-generated method stub
            super.onPageFinished(view, url);
            progressBar5.setVisibility(View.GONE);
        }

        @Override
        public void onPageStarted(android.webkit.WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(android.webkit.WebView view, String url) {
            // TODO Auto-generated method stub
            view.loadUrl(url);
            return true;
        }

    }

    // To handle "Back" key press event for WebView to go back to previous screen.
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if((keyCode == KeyEvent.KEYCODE_BACK) && web5.canGoBack())
        {
            web5.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

// Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu_aboutus, menu);

// Inflate the menu; this adds items to the action bar if it is present.

        MenuItem shareItem = menu.findItem(R.id.menu_share);
        myShareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(shareItem);
        myShareActionProvider.setShareHistoryFileName(
                ShareActionProvider.DEFAULT_SHARE_HISTORY_FILE_NAME);
        myShareActionProvider.setShareIntent(Shareintent());

        return super.onCreateOptionsMenu(menu);


    }
    /** Returns a share intent */
    private Intent Shareintent(){
        Intent Shareintent = new Intent(Intent.ACTION_SEND);
        Shareintent.setType("text/html");
        Shareintent.putExtra(Intent.EXTRA_SUBJECT, "SUBJECT");
        Shareintent.putExtra(Intent.EXTRA_TEXT, "http://www.habeshastudent.com/m/video.html");
        return Shareintent;


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