package com.zennymorh.payoneertask.util;

import org.jetbrains.annotations.NotNull;

import java.net.HttpURLConnection;
import java.util.Objects;

import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.RecordedRequest;

public class MockPaymentDispatcher extends Dispatcher {
    @Override
    public @NotNull MockResponse dispatch(@NotNull RecordedRequest recordedRequest) {
        if (Objects.equals(recordedRequest.getPath(), "/optile/checkout-android/develop/shared-test/lists/listresult.json")) {
            return new MockResponse().setResponseCode(HttpURLConnection.HTTP_OK)
                    .setBody(MockSuccessResponse.SUCCESS_RESPONSE);
        } else throw new IllegalArgumentException("Unknown Request Path " + recordedRequest.getPath());
    }
}
