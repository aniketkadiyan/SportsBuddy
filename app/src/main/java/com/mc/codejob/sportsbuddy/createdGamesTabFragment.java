package com.mc.codejob.sportsbuddy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class createdGamesTabFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.tab_createdgames_frag,container,false);
        return mView;
    }
}
