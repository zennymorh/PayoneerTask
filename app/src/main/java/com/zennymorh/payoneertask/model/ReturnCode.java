
package com.zennymorh.payoneertask.model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ReturnCode {

    @SerializedName("name")
    private String mName;
    @SerializedName("source")
    private String mSource;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getSource() {
        return mSource;
    }

    public void setSource(String source) {
        mSource = source;
    }

}
