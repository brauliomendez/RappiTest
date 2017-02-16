package com.brauliomendez.rappitest.catalogue.domain.entity;

import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class FeedResponse extends RealmObject {

    Feed feed;

    public Feed getFeed() {
        return feed;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }
}
