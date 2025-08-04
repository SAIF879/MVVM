package com.example.mvvm.data.mapper

import com.example.mvvm.data.dto.PostsDto
import com.example.mvvm.domin.model.Posts

fun PostsDto.toPosts(): Posts{
    return Posts(
        title = title ?: "",
        body = body ?: ""
    )
}