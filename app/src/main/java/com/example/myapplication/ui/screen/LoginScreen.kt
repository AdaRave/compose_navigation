package com.example.myapplication.ui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.myapplication.model.Screen

@Composable
fun LoginScreen(navController: NavController) {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        Button(onClick = {
            navController.navigate(Screen.MainScreen.route){
                popUpTo(Screen.MainScreen.route){
                    inclusive = true
                }
            }
        }) {
            Text(text = "Next")
        }
    }

}