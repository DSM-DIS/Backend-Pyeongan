package com.dsm.pyeongan.domains.service;

import retrofit2.Call;
import retrofit2.http.*;

public interface DiaryBookRequestConnectionService {
    @Headers(value = {"accept: application/json", "content-type: application/json"})
    @POST("/repositories/diary-book")
    Call<String> addRequest(@Header("userId") String userId, @Body String code);
}