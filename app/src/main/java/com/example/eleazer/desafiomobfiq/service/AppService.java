package com.example.eleazer.desafiomobfiq.service;

import com.example.eleazer.desafiomobfiq.modelos.Categories;
import com.example.eleazer.desafiomobfiq.modelos.JsonRootBean;
import com.example.eleazer.desafiomobfiq.modelos.Query;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AppService {

    @POST("/Search/Criteria")
    Call<JsonRootBean> enviar(@Body Query query);

    @GET("/StorePreference/CategoryTree")
    Call<Categories> ouvirCategrias();
}
