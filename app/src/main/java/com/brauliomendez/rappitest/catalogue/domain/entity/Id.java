package com.brauliomendez.rappitest.catalogue.domain.entity;

import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class Id extends RealmObject {

    private String label;

    private IdAttribute attributes;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public IdAttribute getAttributes() {
        return attributes;
    }

    public void setAttributes(IdAttribute attributes) {
        this.attributes = attributes;
    }

}
