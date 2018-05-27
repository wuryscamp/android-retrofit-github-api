package com.wuriyanto.githubapp.helper;

import com.wuriyanto.githubapp.constant.Base;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wurianto on 5/27/18.
 */

public class ServiceGenerator {

    public static Retrofit build() {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl(Base.GITHUB_BASE_URL);
        builder.addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();
        return retrofit;
    }
}
