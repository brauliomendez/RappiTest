package com.brauliomendez.rappitest.catalogue.domain.entity;

import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class EntryReleaseDate extends RealmObject {

    private String label;

    private EntryReleaseDateAttribute attributes;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public EntryReleaseDateAttribute getAttributes() {
        return attributes;
    }

    public void setAttributes(EntryReleaseDateAttribute attributes) {
        this.attributes = attributes;
    }

}
