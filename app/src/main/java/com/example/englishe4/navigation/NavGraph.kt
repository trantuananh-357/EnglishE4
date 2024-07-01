package com.example.englishe4.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.englishe4.presentation.AddWordSViewModel
import com.example.englishe4.presentation.AddWordScreen
import com.example.englishe4.presentation.DetailItemWordCardScreen
import com.example.englishe4.presentation.DetailTopic.DetailTopicScreen
import com.example.englishe4.presentation.TopicScreen.TopicScreen
import com.example.englishe4.screen.Screen


@Composable
fun NavGraph(
    navController: NavHostController,
){
        NavHost(navController = navController, startDestination = Screen.BottomBar.Topic.bRouter){
            composable(Screen.BottomBar.Home.bRouter){
                val viewModel : AddWordSViewModel = hiltViewModel()
                AddWordScreen(navController = navController, viewModel = viewModel)
            }
            composable(
                Screen.BottomBar.DetailsCard.bRouter+"/{word}",
                arguments = listOf(navArgument("word"){type = NavType.StringType})
            )
            {backStackEntry ->
                val parentEntry = remember(this) {
                    navController.getBackStackEntry(Screen.BottomBar.Home.bRouter)
                }
                val viewModel : AddWordSViewModel = viewModel(parentEntry)
                DetailItemWordCardScreen(word = backStackEntry.arguments?.getString("word") ?: "", navController = navController, viewModel = viewModel)
            }
            composable(Screen.BottomBar.DetailTopic.bRouter){
                DetailTopicScreen(navHostController = navController)
            }
            composable(Screen.BottomBar.Topic.bRouter){
                TopicScreen(navController = navController)
            }
        }
}
