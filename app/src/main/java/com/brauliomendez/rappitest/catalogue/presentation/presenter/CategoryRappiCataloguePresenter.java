package com.brauliomendez.rappitest.catalogue.presentation.presenter;

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
import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public class CategoryRappiCataloguePresenter {

    private RappiCatalogueUseCase rappiCatalogueUseCase;
    private CategoryRappiCatalogueView categoryRappiCatalogueView;

    private Realm realm;

    public CategoryRappiCataloguePresenter(RappiCatalogueUseCase rappiCatalogueUseCase,
                                           CategoryRappiCatalogueView categoryRappiCatalogueView) {
        this.rappiCatalogueUseCase = rappiCatalogueUseCase;
        this.categoryRappiCatalogueView = categoryRappiCatalogueView;
    }

    public void getCategoriesRappiCatalogue(final String query) {
        rappiCatalogueUseCase
                .buildCatalogue()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<FeedResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        categoryRappiCatalogueView.showProgressBar();
                    }

                    @Override
                    public void onNext(FeedResponse value) {
                       saveDataInRealm(value.getFeed());
                       filterItems(value.getFeed().getEntry(), query, categoryRappiCatalogueView);
                    }

                    @Override
                    public void onError(Throwable e) {
                        categoryRappiCatalogueView.hideProgressBar();
                        categoryRappiCatalogueView.onCategoryRappiCatalogueError(e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        categoryRappiCatalogueView.hideProgressBar();
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

    private void saveDataInRealm(Feed feed) {
        realm = Realm.getDefaultInstance();
        if (realm.where(FeedResponse.class).findAll().size() == 0) {
            realm.beginTransaction();
            FeedResponse feedResponse = new FeedResponse();
            feedResponse.setFeed(feed);
            realm.copyToRealm(feedResponse);
            realm.commitTransaction();
        }
    }

    public void getDataFromRealm(String query) {
        realm = Realm.getDefaultInstance();
        categoryRappiCatalogueView.showProgressBar();
        List<Entry> itemsFilter = new ArrayList<>();
        RealmResults<FeedResponse> realmResult = realm.where(FeedResponse.class).findAll();
        for (FeedResponse feedResponse : realmResult) {
            for (Entry entry : feedResponse.getFeed().getEntry()) {
                if (entry.getCategory().getAttributes().getLabel().equals(query)) {
                    itemsFilter.add(entry);
                }
            }
        }
        categoryRappiCatalogueView.hideProgressBar();
        categoryRappiCatalogueView.showItems(itemsFilter);
    }
}
