package com.brauliomendez.rappitest.catalogue.data;

import com.brauliomendez.rappitest.catalogue.domain.entity.FeedResponse;
import com.brauliomendez.rappitest.catalogue.domain.repository.RappiRequestRepository;
import com.brauliomendez.rappitest.client.RappiTestService;

import io.reactivex.Observable;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public class RappiRequestRepositoryImp implements RappiRequestRepository {

    private RappiTestService rappiTestService;

    public RappiRequestRepositoryImp(RappiTestService rappiTestService) {
        this.rappiTestService = rappiTestService;
    }

    @Override public Observable<FeedResponse> getDataCatalogue() {
        return rappiTestService.getInfoRequest();
    }
}
