package com.example.mvvm.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PostsDto(
    @SerialName("userId" ) var userId : Int?    = null,
    @SerialName("id"     ) var id     : Int?    = null,
    @SerialName("title"  ) var title  : String? = null,
    @SerialName("body"   ) var body   : String? = null
)