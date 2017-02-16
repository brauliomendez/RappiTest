package com.brauliomendez.rappitest.catalogue.domain.entity;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class CategoryAttribute extends RealmObject {

    @SerializedName("im:id")
    private String imId;

    private String term;

    private String scheme;

    private String label;

    public String getImId() {
        return imId;
    }

    public void setImId(String imId) {
        this.imId = imId;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
