package com.example.mvvm.data.api

import com.example.mvvm.data.dto.PostsDto
import retrofit2.Response
import retrofit2.http.GET

interface ApiService{

    @GET("/posts")
    suspend fun getAllPosts() : Response<List<PostsDto>>

}