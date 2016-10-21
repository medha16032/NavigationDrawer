package com.example.medhagupta.navigationdrawer;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by anupamchugh on 10/12/15.
 */
public class FixturesFragment extends Dialog implements android.view.View.OnClickListner{

    public FixturesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_fixtures, container, false);

        return rootView;
    }

}
