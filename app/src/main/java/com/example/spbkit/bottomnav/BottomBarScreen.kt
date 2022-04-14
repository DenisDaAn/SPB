package com.example.spbkit.bottomnav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Timetable : BottomBarScreen(
        route = "timetable",
        title = "Timetable",
        icon = Icons.Default.DateRange
    )
    object Chat : BottomBarScreen(
        route = "chat",
        title = "Chat",
        icon = Icons.Default.MailOutline
    )

    object Profile : BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )

    object Menu : BottomBarScreen(
        route = "menu",
        title = "Menu",
        icon = Icons.Default.Menu
    )


}
