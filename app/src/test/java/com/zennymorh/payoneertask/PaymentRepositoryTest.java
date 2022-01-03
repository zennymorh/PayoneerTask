package com.zennymorh.payoneertask;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.LiveData;

import com.jraska.livedata.TestObserver;
import com.zennymorh.payoneertask.model.Applicable;
import com.zennymorh.payoneertask.repository.IPaymentRepository;
import com.zennymorh.payoneertask.repository.PaymentRepository;
import com.zennymorh.payoneertask.util.MockApiService;
import com.zennymorh.payoneertask.util.StateImpl;
import com.zennymorh.payoneertask.util.Status;

import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class PaymentRepositoryTest extends MockApiService {

    @Rule
    public InstantTaskExecutorRule rule = new InstantTaskExecutorRule();

    private IPaymentRepository iPaymentRepository;

    @Override
    public void setUp() throws IOException {
        super.setUp();
        iPaymentRepository = new PaymentRepository(apiService);
    }

    @Test
    public void paymentMethodReturnsValidResponse() throws InterruptedException {
        LiveData<StateImpl<?>> paymentMethod = iPaymentRepository.getPaymentMethods();
        TestObserver.test(paymentMethod)
                .awaitValue()
                .assertHasValue()
                .assertValue(resource -> resource.status.equals(Status.LOADING))
                .awaitNextValue()
                .assertHasValue()
                .assertValue(resource -> {
                    assert resource.data != null;
                    List<Applicable> networks = (List<Applicable>) resource.data;
                    return networks.size() == 10;
                })
                .assertValue(resource -> resource.status.equals(Status.SUCCESS))
                .assertValue(resource -> {
                    assert resource.data != null;
                    List<Applicable> networks = (List<Applicable>) resource.data;
                    Applicable item = networks.get(5);
                    boolean isCorrectCode = item.getLabel().equals("Mastercard");
                    boolean isCorrectLink = item.getLinks().getLogo().equals("https://raw.githubusercontent.com/optile/checkout-android/develop/checkout/src/main/assets/networklogos/mastercard.png");
                    return isCorrectCode && isCorrectLink;
                });
    }
}
