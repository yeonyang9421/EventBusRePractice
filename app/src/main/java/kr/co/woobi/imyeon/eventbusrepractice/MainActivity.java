package kr.co.woobi.imyeon.eventbusrepractice;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int mColor;

    private int color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewPager viewPager=findViewById(R.id.pager);
        MypagerAdapter pagerAdapter=new MypagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        TabLayout tabLayout=findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);



    }
}
