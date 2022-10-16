package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.model.BottomScreen
import com.example.myapplication.model.Screen
import com.example.myapplication.ui.screen.LoginScreen
import com.example.myapplication.ui.screen.MainScreen
import com.example.myapplication.ui.screen.bottom.Main
import com.example.myapplication.ui.screen.bottom.Profile
import com.example.myapplication.ui.screen.bottom.Settings

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.LoginScreen.route) {
        composable(route = Screen.LoginScreen.route) {
            LoginScreen(navController)
        }
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController)
        }

    }
}

@Composable
fun BottomNavGraph(controller: NavHostController) {
    NavHost(navController = controller, startDestination = BottomScreen.Main.route) {
        composable(route = BottomScreen.Main.route) {
            Main()
        }
        composable(route = BottomScreen.Profile.route) {
            Profile()
        }
        composable(route = BottomScreen.Settings.route) {
            Settings()
        }
    }
}