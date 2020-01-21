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
public class FragmentYegziabherMenor extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_yeegziabher_menor, container, false);
//        TextView t = view.findViewById(R.id.tvThree);
//        Typeface tf=Typeface.createFromAsset(getActivity().getAssets(), "fonts/AbyssinicaSIL-R.ttf");
//        t.setTypeface(tf);
        return view;
    }
}