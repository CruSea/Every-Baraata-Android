package com.gcme.everybarataa.fikirinawesibFragment;

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
 * Created by buty on 12/29/15.
 */
public class FragmentTwenty extends Fragment {
     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View view=inflater.inflate(R.layout.fragemnt_fikir_twenty, container, false);


         TextView t = view.findViewById(R.id.tvTwenty);
         TextView t2 = view.findViewById(R.id.tvTwentyTwo);
//        Typeface tf=Typeface.createFromAsset(getActivity().getAssets(), "fonts/AbyssinicaSIL-R.ttf");
//        t.setTypeface(tf);
         Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "fonts/TimesNewRoman.ttf");
         t.setTypeface(tf);
         t2.setTypeface(tf);

         FloatingActionButton fab = view.findViewById(R.id.fab_twenty);
         fab.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String shareBody = getResources().getString(R.string.lifers_yetekarebe_tidar_link);
                 Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                 sharingIntent.setType("text/plain");
                 sharingIntent.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(R.string.lifers_yetekarebe_tidar));
                 sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                 startActivity(Intent.createChooser(sharingIntent, "choose one"));
             }
         });
         return view;
    }
}