package com.brauliomendez.rappitest.client;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by BraulioMendez on 2/11/17.
 */

public class RappiTestClient {

    private static RappiTestService API_SERVICE;

    private static OkHttpClient createInterceptorClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        builder.networkInterceptors().add(httpLoggingInterceptor);
        return builder.build();
    }

    public static RappiTestService getInstance() {
        if (API_SERVICE == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(RappiTestConstants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(createInterceptorClient())
                    .build();
            API_SERVICE = retrofit.create(RappiTestService.class);
        }
        return API_SERVICE;
    }
}
