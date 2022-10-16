package com.example.myapplication.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomScreen(
    val route: String,
    val title: String, val icon: ImageVector
){
    object Main: BottomScreen(
        route = "main",
        title = "Main",
        icon = Icons.Default.Home
    )
    object Profile: BottomScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )
    object Settings: BottomScreen(
        route = "settings",
        title = "Settings",
        icon = Icons.Default.Settings
    )
}

