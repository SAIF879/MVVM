package com.example.mvvm.di

import com.example.mvvm.ui.screens.PostsViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module


val viewmodelModule = module {
    viewModel { PostsViewModel(get()) }
}

