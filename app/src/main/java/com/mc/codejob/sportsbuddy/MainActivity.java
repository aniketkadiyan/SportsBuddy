package com.mc.codejob.sportsbuddy;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void changepwd(View v) {


        Intent intent1 = new Intent(MainActivity.this, changepassword.class);

        startActivity(intent1);


    }

    public void changename(View v) {


        Intent intent2 = new Intent(MainActivity.this, changename.class);

        startActivity(intent2);


    }
    public void changenum(View v) {


        Intent intent3 = new Intent(MainActivity.this, changephone.class);

        startActivity(intent3);


    }
    public void fabclick(View v){
        Intent intent = new Intent(MainActivity.this,findGameListTab.class);
        startActivity(intent);
    }
    public void sortViewOpen(View v){
        Intent intent = new Intent(MainActivity.this,sortActivity.class);
        startActivity(intent);
    }
    public void filterViewOpen(View v){
        Intent intent = new Intent(MainActivity.this,filterActivity.class);
        startActivity(intent);
    }
    public void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(MainActivity.this,messagingActivity.class);
        startActivity(intent);
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position){
                case 0: homeTabFragment homeTab = new homeTabFragment(); return homeTab;
                case 1: findGamesTabFragment findGamesTab = new findGamesTabFragment(); return findGamesTab;
                case 2: historyTabFragment historyTab = new historyTabFragment(); return historyTab;
                case 3: settingsTabFragment settingsTab = new settingsTabFragment(); return settingsTab;
            }
            return null;

        }

        @Override
        public int getCount() {

            return 4;
        }
    }
}
