package com.example.loginapp.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginapp.ui.LoginScreen
import com.example.loginapp.ui.RegisterScreen

@Composable
fun AppNavHost() {
    val nav = rememberNavController()
    NavHost(navController = nav, startDestination = LoginRoute) {
        composable<LoginRoute> {
            LoginScreen(onSignUpClick = { nav.navigate(RegisterRoute) })
        }
        composable<RegisterRoute> {
            RegisterScreen(onSignInClick = { nav.popBackStack() })
        }
    }
}
