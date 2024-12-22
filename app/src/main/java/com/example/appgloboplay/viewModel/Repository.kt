package com.example.appgloboplay.viewModel

import com.example.appgloboplay.models.Details
import com.example.appgloboplay.models.MoviesList
import com.example.appgloboplay.utils.RetrofitInstance
import retrofit2.Response

class Repository {
    suspend fun getMovieList(page:Int): Response<MoviesList>{
        return RetrofitInstance.api.getMovies(page)
    }
    suspend fun getDetailsById(id:Int): Response<Details>{
        return RetrofitInstance.api.getDetailsById(id = id)
    }
}