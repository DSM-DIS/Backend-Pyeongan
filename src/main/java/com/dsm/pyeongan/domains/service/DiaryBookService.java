package com.dsm.pyeongan.domains.service;

import com.dsm.pyeongan.utils.form.CodeRequestForm;
import com.dsm.pyeongan.utils.form.DiaryBookRequestForm;
import com.dsm.pyeongan.utils.form.UserIdRequestForm;
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

        UserIdRequestForm userIdRequestForm = new Gson().fromJson(userId, UserIdRequestForm.class);
        CodeRequestForm codeRequestForm = new Gson().fromJson(code, CodeRequestForm.class);
        System.out.println("userId : " + userId);
        System.out.println("code : " + code);
        DiaryBookRequestForm form = new DiaryBookRequestForm(userIdRequestForm.getUserId(), codeRequestForm.getCode());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gyeongsang:8893")
                .client(new OkHttpClient().newBuilder().build())
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
                .build();

        DiaryBookRequestConnectionService service = retrofit.create(DiaryBookRequestConnectionService.class);
        try {
            service.addRequest(new Gson().toJson(form)).execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}