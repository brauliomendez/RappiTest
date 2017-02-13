package com.brauliomendez.rappitest.catalogue.presentation.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.brauliomendez.rappitest.R;
import com.brauliomendez.rappitest.catalogue.data.RappiRequestRepositoryImp;
import com.brauliomendez.rappitest.catalogue.domain.entity.Entry;
import com.brauliomendez.rappitest.catalogue.domain.repository.RappiRequestRepository;
import com.brauliomendez.rappitest.catalogue.domain.usecase.RappiCatalogueUseCase;
import com.brauliomendez.rappitest.catalogue.presentation.presenter.CategoryRappiCataloguePresenter;
import com.brauliomendez.rappitest.catalogue.presentation.ui.adapter.CategoryAdapter;
import com.brauliomendez.rappitest.catalogue.presentation.view.CategoryRappiCatalogueView;
import com.brauliomendez.rappitest.client.RappiTestClient;
import com.brauliomendez.rappitest.client.RappiTestService;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class PhotoFragment extends Fragment {

    @BindView(R.id.base_recycler_view)
    RecyclerView recyclerView;

    private static CategoryAdapter categoryAdapter = new CategoryAdapter();

    private CategoryRappiCatalogueView categoryRappiCatalogueView = new CategoryRappiCatalogueView() {
        @Override public void showItems(List<Entry> entries) {
            categoryAdapter.addItems((ArrayList<Entry>) entries);
        }

        @Override public void onCategoryRappiCatalogueError(String message) {

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
    }

    private void setRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(categoryAdapter);
    }

    private void setUpCleanArquitecture() {
        RappiTestService rappiTestService = RappiTestClient.getInstance();
        RappiRequestRepository rappiRequestRepository = new RappiRequestRepositoryImp(rappiTestService);
        RappiCatalogueUseCase rappiCatalogueUseCase = new RappiCatalogueUseCase(rappiRequestRepository);
        CategoryRappiCataloguePresenter presenter = new CategoryRappiCataloguePresenter(rappiCatalogueUseCase,
                categoryRappiCatalogueView);
        presenter.getCategoriesRappiCatalogue("Photo & Video");
    }
}
