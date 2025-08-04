package com.example.mvvm.ui.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm.domin.model.Posts
import com.example.mvvm.domin.useCase.PostsUseCase
import com.example.mvvm.domin.utils.PostsResult
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

sealed class PostsUiState {
    object Loading : PostsUiState()
    data class Success(val posts: List<Posts>) : PostsUiState()
    data class Error(val message: String) : PostsUiState()
}

class PostsViewModel(private val postsUseCase: PostsUseCase): ViewModel(){

    private val _posts : MutableStateFlow<PostsUiState> = MutableStateFlow(PostsUiState.Loading)
    val posts : StateFlow<PostsUiState> = _posts

    init {
        getAllPosts()
    }

    fun getAllPosts(){
        viewModelScope.launch {
            _posts.value = PostsUiState.Loading
            val result = postsUseCase()
            when(result){
                is PostsResult.Error -> {
                    _posts.value = PostsUiState.Error(result.exception)
                }
                is PostsResult.Success -> {
                    _posts.value = PostsUiState.Success(result.posts)
                }
            }
        }
    }

}