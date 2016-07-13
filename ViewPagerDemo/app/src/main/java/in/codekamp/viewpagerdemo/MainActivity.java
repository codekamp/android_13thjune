package in.codekamp.viewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager)findViewById(R.id.pager);

        List<String> newsList = new ArrayList<>();


        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(), newsList));
    }

    private class MyPagerAdapter extends FragmentStatePagerAdapter {

        private List<String> newsList;

        public MyPagerAdapter(FragmentManager fm, List<String> newsList) {
            super(fm);

            this.newsList = newsList;
        }

        @Override
        public int getCount() {
            return newsList.size();
        }

        @Override
        public Fragment getItem(int position) {
            return NewsFragment.newInstance(newsList.get(position));
        }
    }
}
