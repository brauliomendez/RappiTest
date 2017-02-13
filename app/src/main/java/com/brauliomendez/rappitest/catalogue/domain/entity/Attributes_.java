package com.brauliomendez.rappitest.catalogue.domain.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by BraulioMendez on 2/12/17.
 */

public class Attributes_ {

    @SerializedName("amount")
    @Expose
    private String amount;

    @SerializedName("currency")
    @Expose
    private String currency;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
