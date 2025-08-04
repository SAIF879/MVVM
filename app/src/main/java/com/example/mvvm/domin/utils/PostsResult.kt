package com.example.mvvm.domin.utils

import com.example.mvvm.data.dto.PostsDto

sealed class PostsResult{
    data class Success(val posts: List<PostsDto>) : PostsResult()
    data class Error(val exception: Exception) : PostsResult()
}