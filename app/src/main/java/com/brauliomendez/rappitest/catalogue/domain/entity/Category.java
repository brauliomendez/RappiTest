package com.brauliomendez.rappitest.catalogue.domain.entity;

import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class Category extends RealmObject {

    private CategoryAttribute attributes;

    public CategoryAttribute getAttributes() {
        return attributes;
    }

    public void setAttributes(CategoryAttribute attributes) {
        this.attributes = attributes;
    }

}
