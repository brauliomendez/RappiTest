package com.brauliomendez.rappitest.catalogue.domain.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class Link_ {

    @SerializedName("attributes")
    @Expose
    private Attributes________ attributes;

    public Attributes________ getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes________ attributes) {
        this.attributes = attributes;
    }

}
