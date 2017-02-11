package com.brauliomendez.rappitest.catalogue.data;

import com.brauliomendez.rappitest.client.RappiTestService;
import com.brauliomendez.rappitest.catalogue.domain.entity.Feed;
import com.brauliomendez.rappitest.catalogue.domain.repository.RappiRequestRepository;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public class RappiRequestRepositoryImp implements RappiRequestRepository {

    private RappiTestService rappiTestService;

    @Override public Observable<Feed> getDataCatalogue() {
        return rappiTestService.getInfoRequest().subscribeOn(Schedulers.newThread());
    }
}
