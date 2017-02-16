package com.brauliomendez.rappitest.catalogue.domain.repository;

import com.brauliomendez.rappitest.catalogue.domain.entity.FeedResponse;

import io.reactivex.Observable;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public interface RappiRequestRepository {

    Observable<FeedResponse> getDataCatalogue();
}
