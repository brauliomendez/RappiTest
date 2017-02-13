package com.brauliomendez.rappitest.catalogue.presentation.presenter;

import android.util.Log;

import com.brauliomendez.rappitest.catalogue.domain.entity.Feed;
import com.brauliomendez.rappitest.catalogue.domain.entity.FeedResponse;
import com.brauliomendez.rappitest.catalogue.domain.usecase.RappiCatalogueUseCase;
import com.brauliomendez.rappitest.catalogue.presentation.view.CategoryRappiCatalogueView;

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

    public void getCategoriesRappiCatalogue() {
        rappiCatalogueUseCase
                .buildCatalogue()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<FeedResponse>() {
                    @Override public void onSubscribe(Disposable d) {

                    }

                    @Override public void onNext(FeedResponse value) {
                        Log.d("entries", value.toString());
                        categoryRappiCatalogueView.showItems(value.getFeed().getEntry());
                    }

                    @Override public void onError(Throwable e) {
                        categoryRappiCatalogueView.onCategoryRappiCatalogueError(e.getMessage());
                    }

                    @Override public void onComplete() {

                    }
                });
    }
}
