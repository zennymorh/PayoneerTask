package com.zennymorh.payoneertask.network;

import com.zennymorh.payoneertask.model.PaymentMethod;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiService {
    @Headers("Content-Type: application/json")
    @GET("optile/checkout-android/develop/shared-test/lists/listresult.json")
    Call<PaymentMethod> getPaymentMethods();
}
