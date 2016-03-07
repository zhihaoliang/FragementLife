package com.zhihaoliang.hellofragement;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {

    private BlankFragment[] mBlankFragments;

    private  ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mViewPager  = (ViewPager) findViewById(R.id.pageView);

        mBlankFragments = new BlankFragment[5];
        for (int i = 0;i < mBlankFragments.length;i++){
            mBlankFragments[i] = BlankFragment.newInstance("tabs"+i,"i");
        }

        mViewPager.setAdapter(new MyPageAdapter(getSupportFragmentManager()));

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mBlankFragments[0].onButtonPressed();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
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

    @Override
    public void onFragmentInteraction() {

    }

    class  MyPageAdapter extends FragmentStatePagerAdapter{

        public MyPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mBlankFragments[position];
        }

        @Override
        public int getCount() {
            return mBlankFragments.length;
        }
    }

    public void ontab0(View view) {
        mViewPager.setCurrentItem(0);

    }

    public void ontab1(View view) {
        mViewPager.setCurrentItem(1);
    }
    public void ontab2(View view) {
        mViewPager.setCurrentItem(2);
    }
    public void ontab3(View view) {
        mViewPager.setCurrentItem(3);
    }
    public void ontab4(View view) {
        mViewPager.setCurrentItem(4);
    }

}
