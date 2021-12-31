package com.zennymorh.payoneertask.repository;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.zennymorh.payoneertask.model.Applicable;
import com.zennymorh.payoneertask.model.PaymentMethod;
import com.zennymorh.payoneertask.network.ApiService;
import com.zennymorh.payoneertask.util.StateImpl;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PaymentRepository {

    @Inject
    ApiService apiService;

    public PaymentRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    private final MutableLiveData<StateImpl<?>> paymentMethods = new MutableLiveData<>();

    public LiveData<StateImpl<?>> getPaymentMethods() {
        paymentMethods.setValue(StateImpl.loading());

        apiService.getPaymentMethods().enqueue(new Callback<PaymentMethod>() {
            @Override
            public void onResponse(@NotNull Call<PaymentMethod> call, @NotNull Response<PaymentMethod> response) {
                int code = response.code();
                if(code==200){
                    assert response.body() != null;
                    List<Applicable> methods = response.body().getNetworks().getApplicable();
                    paymentMethods.postValue(StateImpl.success(methods));
                }
            }

            @Override
            public void onFailure(@NonNull Call<PaymentMethod> call, @NonNull Throwable t) {
                paymentMethods.postValue(StateImpl.error(t));
            }
        });

        return paymentMethods;
    }
}
