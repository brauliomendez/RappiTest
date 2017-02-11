package com.brauliomendez.rappitest.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public class InfoCategoryEntry {

    @SerializedName("im:id")
    public String imId;

    public String term;

    public String scheme;

    public String label;

    public String getImId() {
        return imId;
    }

    public String getTerm() {
        return term;
    }

    public String getScheme() {
        return scheme;
    }

    public String getLabel() {
        return label;
    }
}
