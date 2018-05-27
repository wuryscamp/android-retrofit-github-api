package com.wuriyanto.githubapp.service;

import com.wuriyanto.githubapp.model.GithubUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by wurianto on 5/27/18.
 */

public interface GithubService {

    @GET("/users")
    public Call<List<GithubUser>> getUsers(@Query("per_page") int perPage, @Query("page") int page);

    @GET("/users/{username}")
    public Call<GithubUser> getUser(@Path("username") String username);
 }
