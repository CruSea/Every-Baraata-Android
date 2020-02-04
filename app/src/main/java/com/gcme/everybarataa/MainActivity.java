package com.gcme.everybarataa;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.gcme.everybarataa.activityFilmoch.Fourty;
import com.gcme.everybarataa.activityFilmoch.Thirty5;
import com.gcme.everybarataa.activityFilmoch.Thirty6;
import com.gcme.everybarataa.activityFilmoch.Thirty7;
import com.gcme.everybarataa.activityFilmoch.Thirty8;
import com.gcme.everybarataa.activityFilmoch.Thirty9;
import com.gcme.everybarataa.egziabherinMawekTabclass.EgziabherinMawek;
import com.gcme.everybarataa.egziabherinMawekTabclass.EgziabherinMawek1;
import com.gcme.everybarataa.egziabherinMawekTabclass.EgziabherinMawek2;
import com.gcme.everybarataa.egziabherinMawekTabclass.EgziabherinMawek3;
import com.gcme.everybarataa.fikirinawesibTabClass.FikirnaWesib;
import com.gcme.everybarataa.fikirinawesibTabClass.FikirnaWesib10;
import com.gcme.everybarataa.fikirinawesibTabClass.FikirnaWesib5;
import com.gcme.everybarataa.fikirinawesibTabClass.FikirnaWesib7;
import com.gcme.everybarataa.hiliwinawTabClass.Hiliwinaw;
import com.gcme.everybarataa.hiliwinawTabClass.Hiliwinaw1;
import com.gcme.everybarataa.hiliwinawTabClass.Hiliwinaw2;
import com.gcme.everybarataa.hiliwinawTabClass.Hiliwinaw3;
import com.gcme.everybarataa.hiliwinawTabClass.Hiliwinaw4;
import com.gcme.everybarataa.hiliwinawTabClass.Hiliwinaw5;
import com.gcme.everybarataa.yehiwotTiyakeTabClass.YehiwotTiyake;
import com.gcme.everybarataa.yehiwotTiyakeTabClass.YehiwotTiyake1;
import com.gcme.everybarataa.yehiwotTiyakeTabClass.YehiwotTiyake2;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity implements OnClickListener
{

    Toolbar toolbar;

    LinearLayout panel1,panel2,panel3,panel4,panel5;
    TextView text1,text2,text3,text4,text5;
    View openLayout;
    private Button button, button1,button2,button3,button4,button5,button6,button7,button8,button12,button15,
            button17,button22,button24,button25,button26,button27,button32,
            button33,button34,button35,button36,button37;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =  findViewById(R.id.toolbar_home);
        setSupportActionBar(toolbar);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home:
                        //startActivity(new Intent(MainActivity.this, MainActivity.class));
                       // Toast.makeText(MainActivity.this, "Recents", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_teleshataol:
                        startActivity(new Intent(MainActivity.this, TeleEshtaol.class));
                        Animatoo.animateSplit(MainActivity.this);
                        break;
                    case R.id.menu_contact_us:
                        startActivity(new Intent(MainActivity.this, Feedback.class));
                        Animatoo.animateSplit(MainActivity.this);
                        break;
                    case R.id.menu_about:
                        startActivity(new Intent(MainActivity.this, AboutUs.class));
                        Animatoo.animateSplit(MainActivity.this);
                        break;
                }
                return true;
            }
        });

        panel1 =  findViewById(R.id.panel1);
        panel2 =  findViewById(R.id.panel2);
        panel3 =  findViewById(R.id.panel3);
        panel4 =  findViewById(R.id.panel4);
        panel5 =  findViewById(R.id.panel5);
        button =  findViewById(R.id.btnegziabherale);
        button1 =  findViewById(R.id.btn1egziabhermanew);
        button2 =  findViewById(R.id.btn2yegziabhermenor);
        button3 =  findViewById(R.id.btn3egzaleminyefeterew);
        button4 =  findViewById(R.id.btn4silasenlitabrara);
        button5 =  findViewById(R.id.btn5silase);
        button6 =  findViewById(R.id.btn6hiyiwotkebadhone);
        button7 =  findViewById(R.id.btn7yehiwotealama);
        button8 =  findViewById(R.id.btn8bechinksinikebeb);

        button12 =  findViewById(R.id.btn12yefikirguadegnafilega);
        button15 =  findViewById(R.id.btn15yewesibfilmmirkogna);
        button17 =  findViewById(R.id.btn17lifersyetekarebetidar);
        button22 =  findViewById(R.id.btn22ewunetegnayesetochmebt);
        button24 =  findViewById(R.id.btn24egziabherinbegilmawek);
        button25 =  findViewById(R.id.btn25eyesusleminmote);
        button26 =  findViewById(R.id.btn26egziabhertselotyimelisalin);
        button27 =  findViewById(R.id.btn27eyesusamilaknew);
        button32 =  findViewById(R.id.btn32yehiwotmisikirinetoch);
        button33 =  findViewById(R.id.btn33yegilyehiwotmisikirinetoch);
        button34 =  findViewById(R.id.btn34yegilyehiwotmisikirinetoch);
        button35 =  findViewById(R.id.btn35yegilyehiwotmisikirinetoch);
        button36 =  findViewById(R.id.btn36yegilyehiwotmisikirinetoch);
        button37 =  findViewById(R.id.btn37yegilyehiwotmisikirinetoch);

        text1 =  findViewById(R.id.tv1yegziabherhiliwina);
        text2 =  findViewById(R.id.tv2yehiwottiyake);
        text3 =  findViewById(R.id.tv3wesibnfikir);
        text4 =  findViewById(R.id.tv4egziabmawek);
        text5 =  findViewById(R.id.tv5films);

        text1.setOnClickListener(this);
        text2.setOnClickListener(this);
        text3.setOnClickListener(this);
        text4.setOnClickListener(this);
        text5.setOnClickListener(this);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button12.setOnClickListener(this);
        button15.setOnClickListener(this);
        button17.setOnClickListener(this);
        button22.setOnClickListener(this);
        button24.setOnClickListener(this);
        button25.setOnClickListener(this);
        button26.setOnClickListener(this);
        button27.setOnClickListener(this);
        button32.setOnClickListener(this);
        button33.setOnClickListener(this);
        button34.setOnClickListener(this);
        button35.setOnClickListener(this);
        button36.setOnClickListener(this);
        button37.setOnClickListener(this);



    }
    @Override
    public void onClick(View v){
        switch (v.getId()){

            case R.id.btnegziabherale:
                Intent hilIntent = new Intent(MainActivity.this, Hiliwinaw.class);
                startActivity(hilIntent);

                break;
            case R.id.btn1egziabhermanew:
                Intent hilIntent1 = new Intent(MainActivity.this, Hiliwinaw1.class);
                startActivity(hilIntent1);

                break;
            case R.id.btn2yegziabhermenor:
                Intent hilIntent2 = new Intent(MainActivity.this, Hiliwinaw2.class);
                startActivity(hilIntent2);

                break;
            case R.id.btn3egzaleminyefeterew:
                Intent hilIntent3 = new Intent(MainActivity.this, Hiliwinaw3.class);
                startActivity(hilIntent3);
                break;
            case R.id.btn4silasenlitabrara:
                Intent hilIntent4 = new Intent(MainActivity.this, Hiliwinaw4.class);
                startActivity(hilIntent4);
                break;
            case R.id.btn5silase:
                Intent hilIntent5 = new Intent(MainActivity.this, Hiliwinaw5.class);
                startActivity(hilIntent5);
                break;
            case R.id.btn6hiyiwotkebadhone:
                Intent yehIntent = new Intent(MainActivity.this, YehiwotTiyake.class);
                startActivity(yehIntent);
                break;
            case R.id.btn7yehiwotealama:
                Intent yehIntent1 = new Intent(MainActivity.this, YehiwotTiyake1.class);
                startActivity(yehIntent1);
                break;
            case R.id.btn8bechinksinikebeb:
                Intent yehIntent2 = new Intent(MainActivity.this, YehiwotTiyake2.class);
                startActivity(yehIntent2);
                break;
            case R.id.btn12yefikirguadegnafilega:
                Intent fikIntent = new Intent(MainActivity.this, FikirnaWesib.class);
                startActivity(fikIntent);
                break;
            case R.id.btn15yewesibfilmmirkogna:
                startActivity(new Intent(MainActivity.this, FikirnaWesib7.class));
                break;
            case R.id.btn17lifersyetekarebetidar:
                startActivity(new Intent(MainActivity.this, FikirnaWesib5.class));
                break;
            case R.id.btn22ewunetegnayesetochmebt:
                startActivity(new Intent(MainActivity.this, FikirnaWesib10.class));
                break;
            case R.id.btn24egziabherinbegilmawek:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek.class));
                break;
            case R.id.btn25eyesusleminmote:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek1.class));
                break;
            case R.id.btn26egziabhertselotyimelisalin:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek2.class));
                break;
            case R.id.btn27eyesusamilaknew:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek3.class));
                break;
            case R.id.btn32yehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, Thirty5.class));
                break;
            case R.id.btn33yegilyehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, Thirty6.class));
                break;
            case R.id.btn34yegilyehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, Thirty7.class));
                break;
            case R.id.btn35yegilyehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, Thirty8.class));
                break;
            case R.id.btn36yegilyehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, Thirty9.class));
                break;
            case R.id.btn37yegilyehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, Fourty.class));
                break;





        }
        {
            hideOthers(v);
        }}
    private void hideThemAll()
    {
        if(openLayout == null) return;
        if(openLayout == panel1)
            panel1.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel1, true));
        if(openLayout == panel2)
            panel2.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel2, true));
        if(openLayout == panel3)
            panel3.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel3, true));
        if(openLayout == panel4)
            panel4.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel4, true));
        if(openLayout == panel5)
            panel5.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel5, true));
    }


    private void hideOthers(View layoutView)
    {
        {
            int v;
            if(layoutView.getId() == R.id.tv1yegziabherhiliwina)
            {
                v = panel1.getVisibility();

                hideThemAll();
                if(v != View.VISIBLE)
                {
                    panel1.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel1, true));
                }
            }
            else if(layoutView.getId() == R.id.tv2yehiwottiyake)
            {
                v = panel2.getVisibility();
                hideThemAll();
                if(v != View.VISIBLE)
                {
                    panel2.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel2, true));
                }
            }
            else if(layoutView.getId() == R.id.tv3wesibnfikir)
            {
                v = panel3.getVisibility();
                hideThemAll();
                if(v != View.VISIBLE)
                {
                    panel3.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel3, true));
                }
            }
            else if(layoutView.getId() == R.id.tv4egziabmawek)
            {
                v = panel4.getVisibility();
                hideThemAll();
                if(v != View.VISIBLE)
                {
                    panel4.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel4, true));
                }
            }
            else if(layoutView.getId() == R.id.tv5films)
            {
                v = panel5.getVisibility();
                hideThemAll();
                if(v != View.VISIBLE)
                {
                    panel5.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel5, true));
                }
            }
        }
    }

    public class ScaleAnimToHide extends ScaleAnimation
    {

        private View mView;

        private LayoutParams mLayoutParams;

        private int mMarginBottomFromY, mMarginBottomToY;

        private boolean mVanishAfter = false;

        public ScaleAnimToHide(float fromX, float toX, float fromY, float toY, int duration, View view,boolean vanishAfter)
        {
            super(fromX, toX, fromY, toY);
            setDuration(duration);
            openLayout = null;
            mView = view;
            mVanishAfter = vanishAfter;
            mLayoutParams = (LayoutParams) view.getLayoutParams();
            int height = mView.getHeight();
            mMarginBottomFromY = (int) (height * fromY) + mLayoutParams.bottomMargin - height;
            mMarginBottomToY = (int) (0 - ((height * toY) + mLayoutParams.bottomMargin)) - height;

            Log.v("CZ","height..." + height + " , mMarginBottomFromY...." + mMarginBottomFromY  + " , mMarginBottomToY.." +mMarginBottomToY);
        }

        @Override
        protected void applyTransformation(float interpolatedTime, Transformation t)
        {
            super.applyTransformation(interpolatedTime, t);
            if (interpolatedTime < 1.0f)
            {
                int newMarginBottom = mMarginBottomFromY + (int) ((mMarginBottomToY - mMarginBottomFromY) * interpolatedTime);
                mLayoutParams.setMargins(mLayoutParams.leftMargin, mLayoutParams.topMargin,mLayoutParams.rightMargin, newMarginBottom);
                mView.getParent().requestLayout();
            }
            else if (mVanishAfter)
            {
                mView.setVisibility(View.GONE);
            }
        }
    }
    public class ScaleAnimToShow extends ScaleAnimation
    {

        private View mView;

        private LayoutParams mLayoutParams;

        private int mMarginBottomFromY, mMarginBottomToY;

        private boolean mVanishAfter = false;

        public ScaleAnimToShow(float toX, float fromX, float toY, float fromY, int duration, View view,boolean vanishAfter)
        {
            super(fromX, toX, fromY, toY);
            openLayout = view;
            setDuration(duration);
            mView = view;
            mVanishAfter = vanishAfter;
            mLayoutParams = (LayoutParams) view.getLayoutParams();
            mView.setVisibility(View.VISIBLE);
            int height = mView.getHeight();

            mMarginBottomFromY = 0;
            mMarginBottomToY = height;

            Log.v("CZ",".................height..." + height + " , mMarginBottomFromY...." + mMarginBottomFromY  + " , mMarginBottomToY.." +mMarginBottomToY);
        }

        @Override
        protected void applyTransformation(float interpolatedTime, @NonNull Transformation t)
        {
            super.applyTransformation(interpolatedTime, t);
            if (interpolatedTime < 1.0f)
            {
                int newMarginBottom = (int) ((mMarginBottomToY - mMarginBottomFromY) * interpolatedTime) - mMarginBottomToY;
                mLayoutParams.setMargins(mLayoutParams.leftMargin, mLayoutParams.topMargin,mLayoutParams.rightMargin, newMarginBottom);
                mView.getParent().requestLayout();

            }
        }

    }
}

