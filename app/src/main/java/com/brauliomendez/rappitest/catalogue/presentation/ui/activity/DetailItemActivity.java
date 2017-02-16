package com.brauliomendez.rappitest.catalogue.presentation.ui.activity;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.brauliomendez.rappitest.R;
import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailItemActivity extends AppCompatActivity {

    @BindView(R.id.base_coordinatorLayout) CoordinatorLayout coordinatorLayout;
    @BindView(R.id.base_toolbar) Toolbar toolbar;
    @BindView(R.id.base_collapsing_toolbar_layout) CollapsingToolbarLayout collapsingToolbar;
    @BindView(R.id.detail_item_image_view) ImageView detailItemImageView;
    @BindView(R.id.detail_item_title_text_view) TextView detailItemTitleTextView;
    @BindView(R.id.detail_item_info_text_view) TextView detailItemInfoTextView;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_item);
        ButterKnife.bind(this);
        setUpCollapsingToolbar(toolbar, collapsingToolbar, " ");
        showInfoItem();
    }

    public void setUpCollapsingToolbar(Toolbar toolbar, CollapsingToolbarLayout collapsingToolbarLayout,
                                       String string) {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        collapsingToolbarLayout.setTitle(string);
    }

    private void showInfoItem() {
        Glide.with(this).load(getIntent().getExtras().getString("image")).centerCrop().into(detailItemImageView);
        detailItemTitleTextView.setText(getIntent().getExtras().getString("name"));
        detailItemInfoTextView.setText(getIntent().getExtras().getString("info"));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
