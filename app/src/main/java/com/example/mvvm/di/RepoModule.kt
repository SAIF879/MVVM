package com.example.mvvm.di


import com.example.mvvm.data.repo.PostsRepoImpl
import com.example.mvvm.domin.repo.PostsRepo
import org.koin.dsl.module

val repoModule = module {
    single<PostsRepo> { PostsRepoImpl(get()) }
}
