package com.brauliomendez.rappitest.catalogue.presentation.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.brauliomendez.rappitest.R;

import butterknife.ButterKnife;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class SocialFragment extends Fragment {

    @Nullable
    @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                                       @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_social, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
