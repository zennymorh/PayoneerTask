package com.zennymorh.payoneertask.util;

import com.zennymorh.payoneertask.network.ApiService;
import com.zennymorh.payoneertask.network.HttpClient;
import com.zennymorh.payoneertask.network.LoggingInterceptor;

import org.junit.After;
import org.junit.Before;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.mockwebserver.MockWebServer;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MockApiService {
    public ApiService apiService;
    private MockWebServer mockWebServer;

    @Before
    public void setUp() throws IOException {
        mockWebServer = new MockWebServer();
        mockWebServer.setDispatcher(new MockPaymentDispatcher());
        mockWebServer.start(8080);

        HttpLoggingInterceptor loggingInterceptor = LoggingInterceptor.create();
        OkHttpClient okHttpClient = HttpClient.create(loggingInterceptor);

        apiService = new Retrofit.Builder()
                .baseUrl(mockWebServer.url("http://127.0.0.1:8080/"))
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ApiService.class);
    }

    @After
    public void tearDown() throws IOException {
        mockWebServer.shutdown();
    }
}
