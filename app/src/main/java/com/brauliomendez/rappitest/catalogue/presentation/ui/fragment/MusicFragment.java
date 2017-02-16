package com.brauliomendez.rappitest.catalogue.presentation.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.brauliomendez.rappitest.R;
import com.brauliomendez.rappitest.catalogue.data.RappiRequestRepositoryImp;
import com.brauliomendez.rappitest.catalogue.domain.entity.Entry;
import com.brauliomendez.rappitest.catalogue.domain.repository.RappiRequestRepository;
import com.brauliomendez.rappitest.catalogue.domain.usecase.RappiCatalogueUseCase;
import com.brauliomendez.rappitest.catalogue.presentation.presenter.CategoryRappiCataloguePresenter;
import com.brauliomendez.rappitest.catalogue.presentation.ui.activity.DetailItemActivity;
import com.brauliomendez.rappitest.catalogue.presentation.ui.adapter.CategoryAdapter;
import com.brauliomendez.rappitest.catalogue.presentation.view.CategoryRappiCatalogueView;
import com.brauliomendez.rappitest.client.RappiTestClient;
import com.brauliomendez.rappitest.client.RappiTestService;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import mx.leo.easyrecycler.util.RecyclerViewItemClickListener;
import mx.leo.easyrecycler.util.extensions.RecyclerViewExtensionsKt;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class MusicFragment extends Fragment {

    @BindView(R.id.base_recycler_view) RecyclerView recyclerView;
    @BindView(R.id.base_progressBar) ProgressBar progressBar;

    private static CategoryAdapter categoryAdapter = new CategoryAdapter();
    private CategoryRappiCataloguePresenter presenter;

    private CategoryRappiCatalogueView categoryRappiCatalogueView = new CategoryRappiCatalogueView() {
        @Override public void showItems(List<Entry> entry) {
            categoryAdapter.addItems((ArrayList<Entry>) entry);
        }

        @Override public void onCategoryRappiCatalogueError(String message) {

        }

        @Override public void showProgressBar() {
            progressBar.setVisibility(View.VISIBLE);
        }

        @Override public void hideProgressBar() {
            progressBar.setVisibility(View.GONE);
        }
    };

    @Nullable @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                                                 @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_base, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setRecyclerView();
        setUpCleanArquitecture();
        showInfoItem(recyclerView);
        checkInternetConnection();
    }

    private void setRecyclerView() {
        setLayoutManagerRecyclerView(recyclerView);
        recyclerView.setAdapter(categoryAdapter);
        clearItemsForEachRequest(categoryAdapter);
    }

    private void clearItemsForEachRequest(CategoryAdapter categoryAdapter) {
        if (categoryAdapter.getItems().size() > 0)
            categoryAdapter.getItems().clear();
    }

    private void setUpCleanArquitecture() {
        RappiTestService rappiTestService = RappiTestClient.getInstance();
        RappiRequestRepository rappiRequestRepository = new RappiRequestRepositoryImp(rappiTestService);
        RappiCatalogueUseCase rappiCatalogueUseCase = new RappiCatalogueUseCase(rappiRequestRepository);
        presenter = new CategoryRappiCataloguePresenter(rappiCatalogueUseCase,
                categoryRappiCatalogueView);
    }

    private void showInfoItem(RecyclerView recyclerView) {
        RecyclerViewExtensionsKt.OnItemClickListener(recyclerView, new RecyclerViewItemClickListener.OnItemClickListener() {
            @Override public void onItemClick(View view, Integer integer) {
                Entry entry = categoryAdapter.getItems().get(integer);
                Intent intent = new Intent(getContext(), DetailItemActivity.class);
                intent.putExtra("image", entry.getImImage().get(2).getLabel());
                intent.putExtra("name", entry.getImName().getLabel());
                intent.putExtra("info", entry.getSummary().getLabel());
                startActivity(intent);
            }
        });

    }

    private boolean checkDeviceFormat(Context context) {
        if ((context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK)
                >= Configuration.SCREENLAYOUT_SIZE_LARGE)
            return true;
        else
            return false;
    }

    private void setLayoutManagerRecyclerView(RecyclerView recyclerView) {
        if (checkDeviceFormat(getActivity()))
            recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        else
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    private void checkInternetConnection() {
        ConnectivityManager connec = (ConnectivityManager)getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connec != null && (
                (connec.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) ||
                        (connec.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED))) {
            presenter.getCategoriesRappiCatalogue("Music");

        } else if (connec != null && (
                (connec.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.DISCONNECTED) ||
                        (connec.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.DISCONNECTED ))) {
            presenter.getDataFromRealm("Music");
        }
    }
}

