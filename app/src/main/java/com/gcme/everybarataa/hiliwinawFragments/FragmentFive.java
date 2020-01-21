package com.gcme.everybarataa.hiliwinawFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.gcme.everybarataa.R;

/**
 * Created by buty on 12/7/15.
 */
public class FragmentFive extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_five, container, false);
//        TextView t=(TextView) view.findViewById(R.id.tvFive);
//        Typeface tf=Typeface.createFromAsset(getActivity().getAssets(), "fonts/AbyssinicaSIL-R.ttf");
//        t.setTypeface(tf);
        return view;
    }

}