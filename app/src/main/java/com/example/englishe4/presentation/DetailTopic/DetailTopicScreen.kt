package com.example.englishe4.presentation.DetailTopic

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController


@Composable
fun DetailTopicScreen(navHostController: NavHostController){

    Scaffold {
        Column (
            modifier = Modifier.padding(it)
        ) { 
            Text(text = "detail")

        }
    }
}