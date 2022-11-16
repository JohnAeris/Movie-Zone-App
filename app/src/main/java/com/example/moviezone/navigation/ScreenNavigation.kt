package com.example.moviezone.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.moviezone.screens.DetailScreen
import com.example.moviezone.screens.HomeScreen

@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.HomeScreen.name) {

        composable(Screen.HomeScreen.name) { HomeScreen(navController) }
        composable(Screen.DetailScreen.name) { DetailScreen(navController) }

    }
}