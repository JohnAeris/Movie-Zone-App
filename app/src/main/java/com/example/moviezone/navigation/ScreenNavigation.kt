package com.example.moviezone.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.moviezone.screens.DetailScreen
import com.example.moviezone.screens.HomeScreen

@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.HomeScreen.name) {

        composable(Screen.HomeScreen.name) { HomeScreen(navController) }

        composable(Screen.DetailScreen.name + "/{movie}",
            arguments = listOf(navArgument(name = "movie") {type = NavType.StringType})
        ) { backStackEntry ->
            DetailScreen(navController, backStackEntry.arguments?.getString("movie"))
        }
    }
}