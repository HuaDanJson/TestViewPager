package cool.monkey.android.testviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.vp_main_activity) ViewPager mViewPager;

    private List<Fragment> fragmentList = new ArrayList<>();

    private MainViewPager mainViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getFragment();
        mainViewPager = new MainViewPager(getSupportFragmentManager());
        mViewPager.setAdapter(mainViewPager);
        mViewPager.setCurrentItem(0);
    }

    public void getFragment() {
        for (int i = 0; i < 5; i++) {
            Fragment1 fragment1 = new Fragment1();
            fragment1.setDate(i);
            fragmentList.add(fragment1);
        }
    }

    class MainViewPager extends FragmentPagerAdapter {


        public MainViewPager(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }
    }

}
