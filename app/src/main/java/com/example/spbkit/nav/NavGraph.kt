package com.example.spbkit.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.spbkit.*

@Composable
fun SetUpNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.Onboadring.route){
        composable(route = Screens.Onboadring.route){
            OnBoardActivity(navController)
        }
        composable(route = Screens.Login.route){
            LogActivity(navController)
        }
        composable(route = Screens.Menu.route){
            MainScreen()
        }
    }

}