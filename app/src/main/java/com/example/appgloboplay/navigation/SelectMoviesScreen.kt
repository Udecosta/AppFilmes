package com.example.appgloboplay.navigation

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.appgloboplay.viewModel.MovieViewModel

@Composable
fun Select(navController: NavController){
    val movieViewModel = viewModel<MovieViewModel>()
    val scrollState = rememberScrollState()
    Row (
        modifier = Modifier.horizontalScroll(scrollState)
    ) {
        for (movieItem in 1..50){
            Text(movieViewModel.state.movies.toString())
        }
    }
}