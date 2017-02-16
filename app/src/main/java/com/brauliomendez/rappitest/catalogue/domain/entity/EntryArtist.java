package com.brauliomendez.rappitest.catalogue.domain.entity;

import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class EntryArtist extends RealmObject {

    private String label;

    private EntryArtistAttribute attributes;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public EntryArtistAttribute getAttributes() {
        return attributes;
    }

    public void setAttributes(EntryArtistAttribute attributes) {
        this.attributes = attributes;
    }

}
