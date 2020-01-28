package com.gcme.everybarataa.hiliwinawFragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.gcme.everybarataa.R;

/**
 * Created by buty on 12/7/15.
 */
public class FragmentEgziabherAle extends Fragment {

    TextView t,t2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_egziabher_ale, container, false);
        t = view.findViewById(R.id.tvone);
        t2 = view.findViewById(R.id.tvOne2);
        Typeface tf=Typeface.createFromAsset(getActivity().getAssets(), "fonts/TimesNewRoman.ttf");
        t.setTypeface(tf);
        t2.setTypeface(tf);
        return view;
    }


}
