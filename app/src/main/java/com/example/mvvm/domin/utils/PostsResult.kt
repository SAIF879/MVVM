package com.example.mvvm.domin.utils

import com.example.mvvm.domin.model.Posts

sealed class PostsResult{
    data class Success(val posts: List<Posts>) : PostsResult()
    data class Error(val exception: String) : PostsResult()
}