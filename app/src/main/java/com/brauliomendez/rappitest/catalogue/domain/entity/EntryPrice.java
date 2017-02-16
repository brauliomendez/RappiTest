package com.brauliomendez.rappitest.catalogue.domain.entity;

import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class EntryPrice extends RealmObject {

    private String label;

    private EntryPriceAttribute attributes;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public EntryPriceAttribute getAttributes() {
        return attributes;
    }

    public void setAttributes(EntryPriceAttribute attributes) {
        this.attributes = attributes;
    }
}
