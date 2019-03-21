package kr.co.woobi.imyeon.eventbusrepractice;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MypagerAdapter extends FragmentPagerAdapter {
    List<Fragment> mData = new ArrayList<>();

    public MypagerAdapter(FragmentManager fm) {
        super(fm);

        int r = new Random().nextInt(256);
        int g = new Random().nextInt(256);
        int b = new Random().nextInt(256);
        int randomColor = Color.rgb(r, g, b);

        mData.add(new FirstFragment());
        mData.add(new ThirdFragment());
        mData.add(SecondFragment.newInstance(randomColor));
    }

    @Override
    public Fragment getItem(int i) {
        return mData.get(i);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=position + "번째";
        switch (position){
            case 0:
                title = " 이벤트 예제";
                break;
            case 1:
                title="빨간색 배경";
                break;

            case 2:
                title = "랜덤색 배경";
                break;
        }
        return title;
    }
}
