package com.dsm.pyeongan.domains.service;

import retrofit2.Call;
import retrofit2.http.*;

public interface DiaryBookRequestConnectionService {
    @Headers(value = {"accept: application/json", "content-type: application/json"})
    @POST
    Call<String> addRequest(@Url String url, @Header("userId") String userId, @Body String code);
}