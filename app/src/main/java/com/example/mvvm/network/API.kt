package com.example.mvvm.network

import com.example.mvvm.model.JokeResponce
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import java.util.concurrent.Flow

interface ApiServecie{
    @GET("joke/Any")
    suspend fun getRandomJoke():JokeResponce
}

object API {
    private const val BASE_URL = "https://v2.jokeapi.dev/"
    private val retrofit =
        Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).build()

    val apiServecie = retrofit.create(ApiServecie::class.java)
}
