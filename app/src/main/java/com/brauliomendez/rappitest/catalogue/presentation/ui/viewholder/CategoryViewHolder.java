package com.brauliomendez.rappitest.catalogue.presentation.ui.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.brauliomendez.rappitest.R;
import com.brauliomendez.rappitest.catalogue.domain.entity.Entry;
import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import mx.leo.easyrecycler.viewholder.EasyViewHolder;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public class CategoryViewHolder extends EasyViewHolder {

    @BindView(R.id.logo_image_view) ImageView logoImageView;
    @BindView(R.id.name_text_view) TextView categoryTextView;

    public CategoryViewHolder(View view) {
        super(view);
        ButterKnife.bind(this, view);
    }

    public void setItem(Entry entry) {
        Glide.with(logoImageView.getContext()).load(entry.getImImage().get(2).getLabel()).into(logoImageView);
        categoryTextView.setText(entry.getImName().getLabel());
    }
}
