package com.example.movieapp.navagation

enum class MovieScreens {
    HomeScreen,
    DetailsScreen;

    companion object{
        fun fromRoute(route: String?):MovieScreens
        = when (route?.substringBefore("/")){
            HomeScreen.name -> DetailsScreen
            DetailsScreen.name -> DetailsScreen

          null -> HomeScreen
          else -> throw IllegalArgumentException("Rout $route is not recognized")
        }
    }
}