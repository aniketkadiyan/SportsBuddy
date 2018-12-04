package com.mc.codejob.sportsbuddy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;

public class findGamesTabFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View mView;
        mView = inflater.inflate(R.layout.tab_findgames_frag,container,false);
        return mView;
    }

}
