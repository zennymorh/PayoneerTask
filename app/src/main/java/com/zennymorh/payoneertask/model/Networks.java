
package com.zennymorh.payoneertask.model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Networks {

    @SerializedName("applicable")
    private List<Applicable> mApplicable;

    public List<Applicable> getApplicable() {
        return mApplicable;
    }

    public void setApplicable(List<Applicable> applicable) {
        mApplicable = applicable;
    }

}
