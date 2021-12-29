
package com.zennymorh.payoneertask.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Payment {

    @SerializedName("amount")
    private Long mAmount;
    @SerializedName("currency")
    private String mCurrency;
    @SerializedName("reference")
    private String mReference;

    public Long getAmount() {
        return mAmount;
    }

    public void setAmount(Long amount) {
        mAmount = amount;
    }

    public String getCurrency() {
        return mCurrency;
    }

    public void setCurrency(String currency) {
        mCurrency = currency;
    }

    public String getReference() {
        return mReference;
    }

    public void setReference(String reference) {
        mReference = reference;
    }

}
