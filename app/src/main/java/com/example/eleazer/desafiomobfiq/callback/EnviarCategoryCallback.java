package com.example.eleazer.desafiomobfiq.callback;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by emjunior on 07/06/2017.
 */

public class EnviarCategoryCallback implements Callback<Void> {

    @Override
    public void onResponse(Call<Void> call, Response<Void> response) {
        System.out.println(response.message());
    }

    @Override
    public void onFailure(Call<Void> call, Throwable t) {
        System.out.println(t.getMessage());
    }
}
