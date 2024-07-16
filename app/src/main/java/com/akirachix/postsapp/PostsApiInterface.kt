package com.akirachix.postsapp

import retrofit2.Call
import retrofit2.http.GET

interface PostsApiInterface {
    @GET("/posts")
    fun getPosts(): Call<List<Post>>
}