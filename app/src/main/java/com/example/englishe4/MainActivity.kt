package com.example.englishe4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.englishe4.navigation.NavGraph
import com.example.englishe4.ui.theme.EnglishE4Theme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navComposable = rememberNavController()
            EnglishE4Theme {
                MainScreen(navHostController = navComposable)
            }
        }
    }
}
