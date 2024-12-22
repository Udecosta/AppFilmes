package com.example.appgloboplay.domain

import com.example.appgloboplay.models.Details
import com.example.appgloboplay.models.MoviesList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("movies?")
    suspend fun getMovies(
        @Query("page")page: Int
    ):Response<MoviesList>

    @GET("movies/{movie_id}")
    suspend fun getDetailsById(
        @Path("movie_id")id: Int
    ):Response<Details>
}