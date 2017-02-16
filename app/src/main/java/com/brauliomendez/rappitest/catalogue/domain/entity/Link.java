package com.brauliomendez.rappitest.catalogue.domain.entity;

import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class Link extends RealmObject {

    private LinkAttribute attributes;

    public LinkAttribute getAttributes() {
        return attributes;
    }

    public void setAttributes(LinkAttribute attributes) {
        this.attributes = attributes;
    }
}
