package com.example.englishe4.screen

import androidx.annotation.DrawableRes
import com.example.englishe4.R

sealed class Screen(val title : String, route: String){
    sealed class BottomBar(val bTitle: String, val bRouter: String, @DrawableRes val icon: Int) :
        Screen(bTitle, bRouter) {
        object Home : BottomBar(
            bTitle = "Home",
            bRouter = "home",
            R.drawable.icon_book
        )

        object DetailsCard : BottomBar(
            bTitle = "Details",
            bRouter = "details",
            R.drawable.icon_book
        )
        object DetailTopic : BottomBar(
            bTitle = "DetailTopic",
            bRouter = "detailtopic",
            R.drawable.icon_book
        )
        object Topic : BottomBar(
            bTitle = "Topic",
            bRouter = "topic",
            R.drawable.icon_book
        )
    }
}