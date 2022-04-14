package com.example.spbkit.nav

sealed class Screens(val route : String) {
    object Onboadring : Screens(route = "onboarding_screen")
    object Login : Screens(route = "login_screen")
    object Menu : Screens(route = "menu_screen")
}