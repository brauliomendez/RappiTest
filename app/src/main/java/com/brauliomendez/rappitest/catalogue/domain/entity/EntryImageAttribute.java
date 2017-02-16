package com.brauliomendez.rappitest.catalogue.domain.entity;

import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class EntryImageAttribute extends RealmObject {

    private String height;

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

}
