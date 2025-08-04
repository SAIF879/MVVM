package com.example.mvvm.domin.useCase


import com.example.mvvm.domin.repo.PostsRepo
import com.example.mvvm.domin.utils.PostsResult

class PostsUseCase(private val postsRepo: PostsRepo) {
    suspend operator fun invoke() : PostsResult{
       return postsRepo.getAllPosts()
    }
}