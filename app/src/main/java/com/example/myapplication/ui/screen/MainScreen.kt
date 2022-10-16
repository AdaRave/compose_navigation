package com.example.myapplication.ui.screen

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.BottomNavGraph
import com.example.myapplication.model.BottomScreen

@Composable
fun MainScreen(navController: NavController) {
    val controller = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomBar(navigation = controller)
        }
    ) {
        BottomNavGraph(controller = controller)
    }

}

@Composable
fun BottomBar(navigation: NavHostController) {
    val screen = listOf(
        BottomScreen.Main,
        BottomScreen.Profile,
        BottomScreen.Settings
    )

    val navBackStackEntry by navigation.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation() {
        screen.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                controller = navigation
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomScreen,
    currentDestination: NavDestination?,
    controller: NavHostController
) {
    BottomNavigationItem(
        label = { Text(text = screen.title) },
        icon = { Icon(imageVector = screen.icon, contentDescription = "") },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        onClick = { controller.navigate(screen.route) }
    )
}