package com.mc.codejob.sportsbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class findGameListTab extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_findgame_frag);
    }
    public void sortViewOpen(View v){
        Intent intent = new Intent(findGameListTab.this,sortActivity.class);
        startActivity(intent);
    }
    public void filterViewOpen(View v){
        Intent intent = new Intent(findGameListTab.this,filterActivity.class);
        startActivity(intent);
    }
}
