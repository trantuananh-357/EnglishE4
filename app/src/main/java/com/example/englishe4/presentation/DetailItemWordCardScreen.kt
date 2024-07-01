package com.example.englishe4.presentation

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.englishe4.R
import com.example.englishe4.model.Definition
import com.example.englishe4.model.DictionaryData
import com.example.englishe4.model.DictionaryEntry
import com.example.englishe4.model.Example
import com.example.englishe4.presentation.cardFlip.CardWordItemFlip
import com.example.englishe4.presentation.component.TopAppBar


@Composable
fun DetailItemWordCardScreen(
    word: String,
    navController: NavHostController,
    viewModel: AddWordSViewModel
) {
    val dataFind by viewModel.dataFind.collectAsState()
    LaunchedEffect(Unit) {
        viewModel.findDataByItem(word)
    }
    Log.d("dataVM", "DetailItemWordCardScreen: ${viewModel.listData.collectAsState().value} ")
    Scaffold(
        topBar = {
            TopAppBar(type = "backpress", navController = navController, title = "Chi tiết thẻ")
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .padding(
                    20.dp
                )
                .background(
                    color = colorResource(id = R.color.white),
                    shape = RoundedCornerShape(10.dp),
                ),
        ) {
            dataFind.let { it1 ->
                if (it1 != null) {
                    CardWordItemFlip(word = it1)
                }
            }
            Icon(
                modifier = Modifier
                    .size(20.dp),
                painter = painterResource(id = R.drawable.arrows_turn_right_solid),
                contentDescription = "Arrow",
                tint = Color.Red
            )
            Column(
                modifier = Modifier
                    .padding(start = 20.dp)
                    .wrapContentSize()
                ,
            ) {
                dataFind?.data?.definitions?.forEach { item ->
                    Row(
                        modifier = Modifier
                            .padding(top = 20.dp),
                    ) {
                        Icon(
                            modifier = Modifier
                                .padding(end = 10.dp)
                                .size(12.dp),
                            painter = painterResource(id = R.drawable.icon_usa),
                            contentDescription = "Arrow"
                        )
                        item.definitionEN?.let { it1 ->
                            Text(
                                text = it1,
                                style = TextStyle(
                                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                                )
                            )
                        }

                    }
                    Row(
                        modifier = Modifier
                            .padding(top = 5.dp),
                    ) {
                        Icon(
                            modifier = Modifier
                                .padding(end = 10.dp)
                                .size(12.dp),
                            painter = painterResource(id = R.drawable.icon_usa),
                            contentDescription = "Arrow"
                        )

                        item.definitionVI?.let { it1 ->
                            Text(
                                text = it1,
                                style = TextStyle(
                                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                                )
                            )
                        }
                    }
                }

            }

            Text(
                modifier = Modifier
                    .padding(top = 10.dp),
                text = "Ví dụ :",
                style = TextStyle(
                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    color = colorResource(id = R.color.teal_200)
                )
            )
            dataFind?.data?.definitions?.get(0)?.examples?.forEach { item ->
                ExampleItem(data = item)
            }


        }


    }
}


@Composable
fun ExampleItem(data: Example) {
    Icon(
        modifier = Modifier
            .size(25.dp),
        painter = painterResource(id = R.drawable.icon_dot),
        contentDescription = "Arrow",
        tint = Color.Blue
    )
    Column(
        modifier = Modifier
            .padding(start = 20.dp)
    ) {
        Row(
            modifier = Modifier
        ) {
            Icon(
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(12.dp),
                painter = painterResource(id = R.drawable.icon_usa),
                contentDescription = "Arrow"
            )
            data.exampleEN?.let {
                Text(
                    text = it,
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    )
                )
            }
        }
        Row(
            modifier = Modifier
                .padding(top = 5.dp),
        ) {
            Icon(
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(12.dp),
                painter = painterResource(id = R.drawable.icon_usa),
                contentDescription = "Arrow"
            )
            data.exampleVI?.let {
                Text(
                    text = it,
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    )
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun sada() {
//    DetailItemWordCardScreen(word = "", navController = rememberNavController())
}

//val data = DictionaryEntry(
//    entry = "achomawi",
//    response = "Achomawi",
//    status = "success",
//    data = DictionaryData(
//        phonetic = "/ ˌætʃoʊˈmɑːwiː/",
//        definitions =
//        listOf(
//            Definition(
//                partOfSpeech = "proper noun",
//                definitionEN = "A language spoken by people of the Pit River tribe in northern California.",
//                definitionVI = "Một ngôn ngữ được người dân bộ lạc Pit River ở miền bắc California sử dụng.",
//                examples = listOf(
//                    Example(
//                        exampleEN = "The Achomawi language is spoken by a small group of people in northern California.",
//                        exampleVI = "Ngôn ngữ Achomawi được một nhóm nhỏ người ở miền bắc California sử dụng."
//                    )
//                )
//            )
//        ), antonyms = listOf()
//    )
//)