//package com.dsm.pyeongan.domains.service
//
//import org.springframework.stereotype.Service
//import retrofit2.Call
//import retrofit2.Callback
//import retrofit2.Response
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//@Service
//class DiaryBookService {
//
//    fun connectingRoom(id: String, code: String) {
//
//        val retrofit = Retrofit.Builder()
//                .baseUrl("http://localhost:8888")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//
//        val service = retrofit.create(DiaryBookRequestConnectionService::class.java)
//
//        service.addRequest(userId = id, code = code)?.enqueue(object : Callback<Unit> {
//            override fun onFailure(call: Call<Unit>, t: Throwable) {
//                print("실패함")
//            }
//
//            override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
//                println("성공함")
//            }
//        })
//    }
//}