package com.gcme.everybarataa.yehiwotTiyakeFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.gcme.everybarataa.R;

/**
 * Created by buty on 12/29/15.
 */
public class FragmentNine extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_nine, container, false);
//        TextView t=(TextView) view.findViewById(R.id.tvNine);
//        Typeface tf=Typeface.createFromAsset(getActivity().getAssets(), "fonts/AbyssinicaSIL-R.ttf");
//        t.setTypeface(tf);
        return view;
    }
}