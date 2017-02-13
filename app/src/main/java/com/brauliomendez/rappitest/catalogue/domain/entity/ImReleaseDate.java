package com.brauliomendez.rappitest.catalogue.domain.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class ImReleaseDate {

    @SerializedName("label")
    @Expose
    private String label;

    @SerializedName("attributes")
    @Expose
    private Attributes_______ attributes;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Attributes_______ getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes_______ attributes) {
        this.attributes = attributes;
    }

}
