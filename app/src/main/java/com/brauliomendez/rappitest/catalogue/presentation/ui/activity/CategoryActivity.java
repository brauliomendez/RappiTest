package com.brauliomendez.rappitest.catalogue.presentation.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.brauliomendez.rappitest.R;
import com.brauliomendez.rappitest.catalogue.data.RappiRequestRepositoryImp;
import com.brauliomendez.rappitest.catalogue.domain.entity.Entry;
import com.brauliomendez.rappitest.catalogue.domain.usecase.RappiCatalogueUseCase;
import com.brauliomendez.rappitest.catalogue.presentation.presenter.CategoryRappiCataloguePresenter;
import com.brauliomendez.rappitest.catalogue.presentation.ui.adapter.CategoryAdapter;
import com.brauliomendez.rappitest.catalogue.presentation.ui.adapter.ViewPagerAdapter;
import com.brauliomendez.rappitest.catalogue.presentation.ui.fragment.GameFragment;
import com.brauliomendez.rappitest.catalogue.presentation.ui.fragment.MusicFragment;
import com.brauliomendez.rappitest.catalogue.presentation.ui.fragment.PhotoFragment;
import com.brauliomendez.rappitest.catalogue.presentation.ui.fragment.SocialFragment;
import com.brauliomendez.rappitest.catalogue.presentation.view.CategoryRappiCatalogueView;
import com.brauliomendez.rappitest.client.RappiTestClient;
import com.brauliomendez.rappitest.client.RappiTestService;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoryActivity extends AppCompatActivity {

    @BindView(R.id.main_view_pager) ViewPager viewPager;
    @BindView(R.id.main_tab_layout) TabLayout tabLayout;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
