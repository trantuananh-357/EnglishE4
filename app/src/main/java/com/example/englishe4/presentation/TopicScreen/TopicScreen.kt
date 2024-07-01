package com.example.englishe4.presentation.TopicScreen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.englishe4.R
import com.example.englishe4.presentation.TopicScreen.component.ItemTopicCard
import com.example.englishe4.presentation.component.TopAppBar
import com.example.englishe4.screen.Screen


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TopicScreen(navController: NavHostController){
    val pageCount = 3
    val pageState = rememberPagerState(pageCount = {pageCount})
    Scaffold (
        topBar = {
            TopAppBar(
                type = "backpress",
                navController = navController,
                title = "Kho chủ đề"
            )
        }
    ) {
        Column  (
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
        ){
            LazyColumn {
                items(10){
                    ItemTopicCard(){
                        navController.navigate(Screen.BottomBar.DetailTopic.bRouter)
                    }
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun sadsfd(){
    TopicScreen(navController = rememberNavController())
}