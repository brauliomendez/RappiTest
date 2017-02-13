package com.brauliomendez.rappitest.catalogue.presentation.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.brauliomendez.rappitest.R;
import com.brauliomendez.rappitest.catalogue.domain.entity.Entry;
import com.brauliomendez.rappitest.catalogue.presentation.ui.viewholder.CategoryViewHolder;

import org.jetbrains.annotations.NotNull;

import mx.leo.easyrecycler.adapter.EasyAdapter;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public class CategoryAdapter extends EasyAdapter<CategoryViewHolder, Entry>{

    @NotNull @Override public CategoryViewHolder createHolder(ViewGroup viewGroup, int i) {
        return new CategoryViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_category, viewGroup, false));
    }

    @Override public void onBindItemViewHolder(CategoryViewHolder holder, Entry entry, int i) {
        holder.setItem(entry);
    }
}
