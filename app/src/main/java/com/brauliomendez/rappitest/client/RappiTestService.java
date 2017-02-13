package com.brauliomendez.rappitest.client;

import com.brauliomendez.rappitest.catalogue.domain.entity.Feed;
import com.brauliomendez.rappitest.catalogue.domain.entity.FeedResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public interface RappiTestService {

    @GET(RappiTestConstants.SERVICES_INFO_ENDPOINT) Observable<FeedResponse> getInfoRequest();
}
