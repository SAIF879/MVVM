package com.example.mvvm.data.repo

import com.example.mvvm.data.api.ApiService
import com.example.mvvm.data.mapper.toPosts
import com.example.mvvm.data.utils.safeApiCall
import com.example.mvvm.domin.repo.PostsRepo
import com.example.mvvm.domin.utils.PostsResult

class PostsRepoImpl(private val apiService: ApiService) : PostsRepo {
    override suspend fun getAllPosts(): PostsResult {
        return safeApiCall(
            apiCall = { apiService.getAllPosts() },
            onSuccess = { postsDto -> PostsResult.Success(postsDto.map { it.toPosts() }) },
            onError = { message -> PostsResult.Error(message) },
        )
    }

}