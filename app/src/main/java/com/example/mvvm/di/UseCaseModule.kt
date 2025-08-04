package com.example.mvvm.di

import com.example.mvvm.domin.useCase.PostsUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { PostsUseCase(get()) }
}
