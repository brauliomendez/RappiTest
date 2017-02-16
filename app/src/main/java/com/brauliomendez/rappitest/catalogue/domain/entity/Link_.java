package com.brauliomendez.rappitest.catalogue.domain.entity;

import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class Link_ extends RealmObject {

    private Link_Attribute attributes;

    public Link_Attribute getAttributes() {
        return attributes;
    }

    public void setAttributes(Link_Attribute attributes) {
        this.attributes = attributes;
    }

}
