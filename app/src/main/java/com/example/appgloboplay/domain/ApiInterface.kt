package com.example.appgloboplay.domain

import com.example.appgloboplay.models.MoviesList
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("movies?/page=1-25")
    suspend fun getMovies(

    ): Response<MoviesList>
}