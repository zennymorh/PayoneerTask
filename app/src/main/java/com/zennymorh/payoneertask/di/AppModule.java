package com.zennymorh.payoneertask.di;

import com.zennymorh.payoneertask.network.ApiService;
import com.zennymorh.payoneertask.network.HttpClient;
import com.zennymorh.payoneertask.network.LoggingInterceptor;
import com.zennymorh.payoneertask.repository.PaymentRepository;
import com.zennymorh.payoneertask.util.Constants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {
    @Singleton
    @Provides
    public Retrofit providesRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    public PaymentRepository providesPaymentsRepository(ApiService apiService) {
        return new PaymentRepository(apiService);
    }

    @Provides
    @Singleton
    public ApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor) {
        return HttpClient.create(httpLoggingInterceptor);
    }

    @Provides
    @Singleton
    HttpLoggingInterceptor provideLoggingInterceptor() {
        return LoggingInterceptor.create();
    }

}
