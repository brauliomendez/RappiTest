package com.brauliomendez.rappitest.catalogue.domain.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class ImContentType {


    @SerializedName("attributes")
    @Expose
    private Attributes__ attributes;

    public Attributes__ getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes__ attributes) {
        this.attributes = attributes;
    }

}
