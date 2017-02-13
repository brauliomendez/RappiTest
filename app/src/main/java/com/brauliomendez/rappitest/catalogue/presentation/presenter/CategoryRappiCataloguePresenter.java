package com.brauliomendez.rappitest.catalogue.presentation.presenter;

import android.util.Log;

import com.brauliomendez.rappitest.catalogue.domain.entity.Entry;
import com.brauliomendez.rappitest.catalogue.domain.entity.Feed;
import com.brauliomendez.rappitest.catalogue.domain.entity.FeedResponse;
import com.brauliomendez.rappitest.catalogue.domain.usecase.RappiCatalogueUseCase;
import com.brauliomendez.rappitest.catalogue.presentation.view.CategoryRappiCatalogueView;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public class CategoryRappiCataloguePresenter {

    private RappiCatalogueUseCase rappiCatalogueUseCase;
    private CategoryRappiCatalogueView categoryRappiCatalogueView;

    public CategoryRappiCataloguePresenter(RappiCatalogueUseCase rappiCatalogueUseCase,
                                           CategoryRappiCatalogueView categoryRappiCatalogueView) {
        this.rappiCatalogueUseCase = rappiCatalogueUseCase;
        this.categoryRappiCatalogueView = categoryRappiCatalogueView;
    }

    public void getCategoriesRappiCatalogue(final String query) {
        rappiCatalogueUseCase
                .buildCatalogue()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<FeedResponse>() {
                    @Override public void onSubscribe(Disposable d) {

                    }

                    @Override public void onNext(FeedResponse value) {
                        filterItems(value.getFeed().getEntry(), query, categoryRappiCatalogueView);
                    }

                    @Override public void onError(Throwable e) {
                        categoryRappiCatalogueView.onCategoryRappiCatalogueError(e.getMessage());
                    }

                    @Override public void onComplete() {

                    }
                });
    }

    private void filterItems(List<Entry> entries, String query, CategoryRappiCatalogueView
                            categoryRappiCatalogueView) {
        List<Entry> itemsFilter = new ArrayList<>();
        for (Entry entry : entries) {
            if (entry.getCategory().getAttributes().getLabel().equals(query)){
                itemsFilter.add(entry);
            }
        }
        categoryRappiCatalogueView.showItems(itemsFilter);
    }
}
