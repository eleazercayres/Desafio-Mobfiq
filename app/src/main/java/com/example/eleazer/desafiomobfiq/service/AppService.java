package com.example.eleazer.desafiomobfiq.service;

import com.example.eleazer.desafiomobfiq.modelos.Categories;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AppService {

    @POST("/polling")
    Call<Void> enviar(@Body Categories category);

    @GET("/StorePreference/CategoryTree")
    Call<Categories> ouvirCategrias();
}
