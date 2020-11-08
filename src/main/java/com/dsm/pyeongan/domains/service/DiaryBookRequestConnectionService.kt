package com.dsm.pyeongan.domains.service

import retrofit2.Call
import retrofit2.http.*

interface DiaryBookRequestConnectionService {
    @Headers("accept: application/json", "content-type: application/json")
    @GET("/repositories/diary-book")
    fun addRequest(@Header("id") id: String, @Body code: String): Call<Unit>
}