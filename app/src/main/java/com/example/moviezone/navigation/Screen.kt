package com.example.moviezone.navigation

enum class Screen {
    HomeScreen,
    DetailScreen;
    companion object {
        fun appRoute(route: String?): Screen
        = when (route?.substringBefore("/")) {
            HomeScreen.name -> HomeScreen
            DetailScreen.name -> DetailScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route doesn't exists!")
        }
    }


}