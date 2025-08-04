package com.example.mvvm.data.repo

import com.example.mvvm.data.api.ApiService
import com.example.mvvm.domin.repo.PostsRepo
import com.example.mvvm.domin.utils.PostsResult

class PostsRepoImpl(private val apiService: ApiService) : PostsRepo {
    override suspend fun getAllPosts(): PostsResult {
        //TODO
    }

}