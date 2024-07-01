package com.example.englishe4.presentation.TopicScreen.component

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.englishe4.R


@Composable
fun ItemTopicCard(onClick :()-> Unit) {
    Box (
        modifier = Modifier
            .height(230.dp)
            .clickable {
                onClick()
            }
    ) {
        Card(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .height(200.dp)
                .padding(20.dp)
                .align(Alignment.BottomCenter),
            elevation = 10.dp,
            shape = RoundedCornerShape(20.dp),
            backgroundColor = colorResource(id = R.color.bg_card_topic),
        ) {
            Row {
                Column(
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(start = 40.dp,10.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Row(
                        modifier = Modifier
                            .wrapContentSize(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(top = 30.dp)
                                .width(30.dp)
                                .height(30.dp)
                                .border(
                                    width = 1.dp,
                                    color = colorResource(id = R.color.white),
                                    shape = RoundedCornerShape(10.dp),
                                ),
                            contentAlignment = Alignment.Center

                        ) {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(
                                    modifier = Modifier
                                        .size(15.dp),
                                    painter = painterResource(id = R.drawable.icon_check),
                                    contentDescription = "CHECK",
                                    tint = colorResource(id = R.color.white)
                                )
                            }
                        }


                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Level 1",
                        style = TextStyle(
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            color = colorResource(id = R.color.white)
                        )
                    )
                    Text(
                        text = "Weather",
                        style = TextStyle(
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            color = colorResource(id = R.color.white),
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )


                }

            }




        }
        Image(
            modifier = Modifier
                .padding(end= 50.dp)
                .width(150.dp)
                .height(150.dp)
                .align(Alignment.TopEnd)
            ,
            alignment = Alignment.TopEnd,
            painter = painterResource(id = R.drawable.img_bg_topic_2),
            contentDescription = "IMG",
        )

    }


}


@Preview(showBackground = true)
@Composable
fun dsfsdf() {
    ItemTopicCard({})
}