package com.example.a17823.getservicedemo.Service;

import com.example.a17823.getservicedemo.entities.IsTrueBean;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by 17823 on 2018/2/3.
 */

public interface LoginService {
    //@POST("Login_test")
    @POST("Login_Run")
    Call<IsTrueBean> getState(
            @Query("Account") String Account,
            @Query("Pwd") String Pwd
    );
}
