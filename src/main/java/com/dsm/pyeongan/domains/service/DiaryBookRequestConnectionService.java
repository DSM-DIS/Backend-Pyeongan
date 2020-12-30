package com.dsm.pyeongan.domains.service;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

public interface DiaryBookRequestConnectionService {
    @Headers(value = {"accept: application/json", "content-type: application/json"})
    @GET("/diary-book")
    void addRequest(@Header("userId") String userId, @Body String code);
}