
package com.zennymorh.payoneertask.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Status {

    @SerializedName("code")
    private String mCode;
    @SerializedName("reason")
    private String mReason;

    public String getCode() {
        return mCode;
    }

    public void setCode(String code) {
        mCode = code;
    }

    public String getReason() {
        return mReason;
    }

    public void setReason(String reason) {
        mReason = reason;
    }

}
