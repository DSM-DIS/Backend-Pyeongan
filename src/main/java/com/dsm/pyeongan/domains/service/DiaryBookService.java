package com.dsm.pyeongan.domains.service;

import com.dsm.pyeongan.utils.form.CodeRequestForm;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

@Service
public class DiaryBookService {
    public void connectingRoom(String userId, String code) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gyeongsang:8893")
                .client(new OkHttpClient().newBuilder().build())
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
                .build();

        DiaryBookRequestConnectionService service = retrofit.create(DiaryBookRequestConnectionService.class);
        service.addRequest(userId, code);
    }
}