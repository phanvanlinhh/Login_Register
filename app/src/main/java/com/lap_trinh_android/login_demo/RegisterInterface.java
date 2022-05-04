package com.lap_trinh_android.login_demo;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface RegisterInterface {
    String REGIURL = "http://192.168.40.52/Login_android/";
    @FormUrlEncoded
    @POST("simpleregister.php")
    Call<String> getUserRegi(
            @Field("name") String name,
            @Field("hobby") String hobby,
            @Field("username") String uname,
            @Field("password") String password
    );
}
