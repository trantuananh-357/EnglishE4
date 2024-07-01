package com.example.englishe4

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.englishe4.navigation.NavGraph

@Composable
fun MainScreen(navHostController: NavHostController){
    Scaffold {
        Column (
            modifier = Modifier
                .padding(it)
        ) {
            NavGraph(navController = navHostController)
        }
    }
}