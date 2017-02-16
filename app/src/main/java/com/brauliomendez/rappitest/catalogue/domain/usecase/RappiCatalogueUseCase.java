package com.brauliomendez.rappitest.catalogue.domain.usecase;

import com.brauliomendez.rappitest.catalogue.domain.entity.FeedResponse;
import com.brauliomendez.rappitest.catalogue.domain.repository.RappiRequestRepository;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public class RappiCatalogueUseCase {

    private RappiRequestRepository rappiRequestRepository;

    public RappiCatalogueUseCase(RappiRequestRepository rappiRequestRepository) {
        this.rappiRequestRepository = rappiRequestRepository;
    }

    public Observable<FeedResponse> buildCatalogue() {
        return rappiRequestRepository.getDataCatalogue().subscribeOn(Schedulers.newThread());
    }
}
