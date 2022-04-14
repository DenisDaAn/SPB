package com.example.spbkit.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.spbkit.bottomnav.BottomBarScreen
import com.example.spbkit.bottomnav.screens.HomeScreen
import com.example.spbkit.bottomnav.screens.ProfileScreen
import com.example.spbkit.bottomnav.screens.SettingsScreen
import com.example.spbkit.bottomnav.screens.TimetableScreen


@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Timetable.route
    ) {
        composable(route = BottomBarScreen.Chat.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Menu.route) {
            SettingsScreen()
        }
        composable(route = BottomBarScreen.Timetable.route) {
            TimetableScreen()
        }
    }
}