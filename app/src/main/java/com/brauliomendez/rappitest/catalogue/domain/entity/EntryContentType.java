package com.brauliomendez.rappitest.catalogue.domain.entity;

import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class EntryContentType extends RealmObject {

    private EntryContentTypeAttribute attributes;

    public EntryContentTypeAttribute getAttributes() {
        return attributes;
    }

    public void setAttributes(EntryContentTypeAttribute attributes) {
        this.attributes = attributes;
    }

}
