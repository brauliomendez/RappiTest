package com.brauliomendez.rappitest.catalogue.domain.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class Category {

    @SerializedName("attributes")
    @Expose
    private Attributes______ attributes;

    public Attributes______ getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes______ attributes) {
        this.attributes = attributes;
    }

}
