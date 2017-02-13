package com.brauliomendez.rappitest.catalogue.presentation.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.brauliomendez.rappitest.R;
import com.brauliomendez.rappitest.catalogue.presentation.ui.adapter.ViewPagerAdapter;
import com.brauliomendez.rappitest.catalogue.presentation.ui.fragment.GameFragment;
import com.brauliomendez.rappitest.catalogue.presentation.ui.fragment.MusicFragment;
import com.brauliomendez.rappitest.catalogue.presentation.ui.fragment.PhotoFragment;
import com.brauliomendez.rappitest.catalogue.presentation.ui.fragment.SocialFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MenuActivity extends AppCompatActivity {

    @BindView(R.id.main_view_pager) ViewPager viewPager;
    @BindView(R.id.main_tab_layout) TabLayout tabLayout;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
        setUpViewPager();
        setUpTabLayout();
    }

    private void setUpViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new GameFragment(), "Games");
        adapter.addFragment(new MusicFragment(), "Music");
        adapter.addFragment(new PhotoFragment(), "Photo");
        adapter.addFragment(new SocialFragment(), "Social");
        viewPager.setAdapter(adapter);
    }

    private void setUpTabLayout() {
        tabLayout.setupWithViewPager(viewPager);
    }
}
