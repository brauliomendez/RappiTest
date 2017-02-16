package com.brauliomendez.rappitest.catalogue.domain.entity;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class IdAttribute extends RealmObject {

    @SerializedName("im:id")
    private String imId;

    @SerializedName("im:bundleId")
    private String imBundleId;

    public String getImId() {
        return imId;
    }

    public void setImId(String imId) {
        this.imId = imId;
    }

    public String getImBundleId() {
        return imBundleId;
    }

    public void setImBundleId(String imBundleId) {
        this.imBundleId = imBundleId;
    }

}
