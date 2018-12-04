package com.mc.codejob.sportsbuddy;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class homeTabFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.tab_home_frag,container,false);
        return mView;
    }

}
