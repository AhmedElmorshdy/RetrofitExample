package com.mmabas77.retrofitexample;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    static String baseUrl = "https://jsonplaceholder.typicode.com/";
    Context context;
    static Retrofit retrofit;

    public RetrofitInstance(Context context) {
        this.context = context;
    }

    public static Retrofit getRetrofit() {

        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
