package com.gcme.everybarataa.egziabherinMawekFragment;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.gcme.everybarataa.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * Created by buty on 12/30/15.
 */
public class FragmentTwenty7 extends Fragment {
     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View view=inflater.inflate(R.layout.fragment_twenty7, container, false);

         TextView t = view.findViewById(R.id.tvTwenty7);
         TextView t1 = view.findViewById(R.id.tvTwenty71);
         TextView t2 = view.findViewById(R.id.tvTwenty72);
         TextView t3 = view.findViewById(R.id.tvTwenty73);
         TextView t4 = view.findViewById(R.id.tvTwenty74);
//        Typeface tf=Typeface.createFromAsset(getActivity().getAssets(), "fonts/AbyssinicaSIL-R.ttf");
//        t.setTypeface(tf);
         Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "fonts/TimesNewRoman.ttf");
         t.setTypeface(tf);
         t1.setTypeface(tf);
         t3.setTypeface(tf);
         t4.setTypeface(tf);
         t2.setTypeface(tf);

         FloatingActionButton fab = view.findViewById(R.id.fab_twenty7);
         fab.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String shareBody = getResources().getString(R.string.egziabherin_begil_mawek_link);
                 Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                 sharingIntent.setType("text/plain");
                 sharingIntent.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(R.string.egziabherin_begil_mawek));
                 sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                 startActivity(Intent.createChooser(sharingIntent, "choose one"));
             }
         });



         return view;
    }
}
