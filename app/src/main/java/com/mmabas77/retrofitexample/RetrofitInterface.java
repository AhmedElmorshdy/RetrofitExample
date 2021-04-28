package com.mmabas77.retrofitexample;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {
    @GET("posts/1")
    Call<Model>getData();
}
