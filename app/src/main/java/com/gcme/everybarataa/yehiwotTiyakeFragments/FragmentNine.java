package com.gcme.everybarataa.yehiwotTiyakeFragments;

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
public class FragmentNine extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_nine, container, false);
        TextView t=(TextView) view.findViewById(R.id.tvNine);


        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "fonts/TimesNewRoman.ttf");
        t.setTypeface(tf);

        FloatingActionButton fab = view.findViewById(R.id.fab_nine);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String shareBody = getResources().getString(R.string.bechink_sinikebeb_link);
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, getResources().getString(R.string.bechink_sinikebeb));
                sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "choose one"));
            }
        });
        return view;
    }
}