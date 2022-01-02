package com.zennymorh.payoneertask.repository;

import androidx.lifecycle.LiveData;

import com.zennymorh.payoneertask.util.StateImpl;

public interface IPaymentRepository {
    LiveData<StateImpl<?>> getPaymentMethods();
}
