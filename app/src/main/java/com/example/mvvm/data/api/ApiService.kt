package com.example.mvvm.data.api

import com.example.mvvm.data.dto.PostsDto
import retrofit2.Response

interface ApiService{

    suspend fun getAllPosts() : Response<List<PostsDto>>

}