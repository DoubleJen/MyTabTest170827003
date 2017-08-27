package tw.adouble.app.helloworld.mytabtest170827003;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

//                FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
//                getSupportFragmentManager(), FragmentPagerItems.with(this)
//                .add(R.string.titleA, F1Fragment.class)
//                .add(R.string.titleB, F2Fragment.class)
//                .create());

        FragmentPagerItems.Creator creator = FragmentPagerItems.with(this);
        creator.add("Title A", F1Fragment.class);
        creator.add("Title B", F2Fragment.class);
        FragmentPagerItems items = creator.create();



        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), items
        );



        //????Attempt to invoke virtual method 'void android.support.v4.view.ViewPager.setAdapter(android.support.v4.view.PagerAdapter)' on a null object reference
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpagertab);
        viewPager.setAdapter(adapter);

        SmartTabLayout viewPagerTab = (SmartTabLayout) findViewById(R.id.viewpagertab);
        viewPagerTab.setViewPager(viewPager);
    }
}
