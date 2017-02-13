package com.brauliomendez.rappitest.catalogue.domain.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class ImArtist {

    @SerializedName("label")
    @Expose
    private String label;

    @SerializedName("attributes")
    @Expose
    private Attributes_____ attributes;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Attributes_____ getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes_____ attributes) {
        this.attributes = attributes;
    }

}
