package com.example.myapplication.model

sealed class Screen(val route: String) {
    object MainScreen : Screen("main")
    object LoginScreen : Screen("login")
}