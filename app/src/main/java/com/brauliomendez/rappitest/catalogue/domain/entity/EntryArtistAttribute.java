package com.brauliomendez.rappitest.catalogue.domain.entity;

import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class EntryArtistAttribute extends RealmObject {

    private String href;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
