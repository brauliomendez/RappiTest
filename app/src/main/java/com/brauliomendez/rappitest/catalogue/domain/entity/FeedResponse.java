package com.brauliomendez.rappitest.catalogue.domain.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class FeedResponse {

    @SerializedName("feed")
    Feed feed;

    public Feed getFeed() {
        return feed;
    }
}
