package com.brauliomendez.rappitest.catalogue.domain.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class Link {

    @SerializedName("attributes")
    @Expose
    private Attributes___ attributes;

    public Attributes___ getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes___ attributes) {
        this.attributes = attributes;
    }
}
