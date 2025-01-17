package com.example.word.remote_data;

import com.example.word.models.ModelDo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DaApi {
    @GET("api/activity")
    Call<ModelDo> getActivities();

    @GET("/api/activity/{key}")
    Call<ModelDo> getActivityByKey( @Query("key")  String key);
    @GET("/api/activity?price")
    Call<ModelDo> getActivityByPrice( @Query("price") double price);
    @GET("/api/activity?link")
    Call<ModelDo> getActivityByLink( @Query("link") String link);
}
