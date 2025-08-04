package com.example.mvvm.domin.repo

import com.example.mvvm.domin.utils.PostsResult


interface PostsRepo{
    suspend fun getAllPosts() : PostsResult
}