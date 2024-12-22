package com.example.appgloboplay.navigation

import android.R.attr.type
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigation(navController: NavHostController) {

    NavHost(navController = navController, startDestination = "Banner screen") {
        composable("Banner Screen") {
            BannerScreen(navController = navController)
        }
        composable("Home Screen") {
            HomeScreen(navController = navController)
        }
        composable("Details screen/{id}",
            arguments = listOf(
                navArgument(
                    name = "id"
                ) {
                    type = NavType.IntType
                }
            )
        ) { id ->
            id.arguments?.getInt("id")?.let { id1 ->
                DetailsScreen(id = id1)
            }
        }
    }
}



