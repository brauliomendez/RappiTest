package com.brauliomendez.rappitest.catalogue.domain.entity;

import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class EntryImage extends RealmObject {

    private String label;

    private EntryImageAttribute attributes;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public EntryImageAttribute getAttributes() {
        return attributes;
    }

    public void setAttributes(EntryImageAttribute attributes) {
        this.attributes = attributes;
    }

}
