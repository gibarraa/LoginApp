package com.example.loginapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.loginapp.nav.AppNavHost
import com.example.loginapp.ui.theme.LoginAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginAppTheme {
                AppNavHost()
            }
        }
    }
}
