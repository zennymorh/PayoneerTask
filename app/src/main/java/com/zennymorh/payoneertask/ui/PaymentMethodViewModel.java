package com.zennymorh.payoneertask.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.zennymorh.payoneertask.repository.PaymentRepository;
import com.zennymorh.payoneertask.util.StateImpl;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class PaymentMethodViewModel extends ViewModel {
    public PaymentRepository repository;
    @Inject
    PaymentMethodViewModel(PaymentRepository repository){
        this.repository = repository;
    }

    public LiveData<StateImpl<?>> getPaymentNetworks(){
        return repository.getPaymentMethods();
    }
}
