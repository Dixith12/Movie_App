package com.example.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieapp.Screen.DetailScreen
import com.example.movieapp.Screen.HomeScreen

@Composable
fun Movienavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MovieScreen.HomeScreen.name){
        composable(MovieScreen.HomeScreen.name){
            HomeScreen(navController)
        }
        composable(MovieScreen.DetailScreen.name+"/{movie}",arguments = listOf(navArgument("movie"){type = NavType.StringType})){
            backStackEntry ->
            DetailScreen(navController,backStackEntry.arguments?.getString("movie"))
        }
    }

}