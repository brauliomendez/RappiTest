package com.brauliomendez.rappitest.catalogue.domain.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public class InfoIdEntry {

    @SerializedName("im:id")
    public String imId;

    @SerializedName("im:bundleId")
    public String imBundleId;

    public String getImId() {
        return imId;
    }

    public String getImBundleId() {
        return imBundleId;
    }
}
