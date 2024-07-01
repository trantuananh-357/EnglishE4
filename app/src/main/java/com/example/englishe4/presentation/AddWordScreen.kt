package com.example.englishe4.presentation

import android.util.Log
import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material.Text
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarColors
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.englishe4.R
import com.example.englishe4.presentation.component.ItemWordCardScreen
import com.example.englishe4.presentation.component.TopAppBar
import com.example.englishe4.screen.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddWordScreen(
    navController: NavHostController,
    viewModel: AddWordSViewModel
) {
    val context = LocalContext.current
    val resultSearch = viewModel.topicCards.collectAsState()
    val contentSearch = viewModel.searchText.collectAsState()
    val dataSearch by viewModel.listData.collectAsState()
    val historys = remember {
        mutableListOf<WordCard>()
    }
    val active = remember {
        mutableStateOf(false)
    }
    Log.d("data", "AddWordScreen: $resultSearch")
    Scaffold(
        topBar = {
            TopAppBar(type = "main", navController = navController, title = "Kho của tôi")
        },
        bottomBar = {
            Button(
                onClick = {
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp, bottom = 40.dp)
                    .height(50.dp),
                shape = RoundedCornerShape(30.dp)
            ) {
                Text(text = "Add")
            }
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .padding(start = 16.dp, end = 16.dp)
                .verticalScroll(rememberScrollState())
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(50.dp))
            Text(
                modifier = Modifier.padding(bottom = 10.dp, start = 5.dp),
                text = "Title",
            )
            OutlinedTextField(
                value = viewModel.searchWord.collectAsState().value,
                onValueChange = {
                    viewModel.onWordChange(it)
                },
                placeholder = {
                    Text(
                        text = "Enter the title",
                        modifier = Modifier.padding(top = 2.dp),
                    )
                },
                shape = RoundedCornerShape(18.dp),
                modifier = Modifier.fillMaxWidth(),
                isError = false
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                modifier = Modifier.padding(bottom = 10.dp, start = 5.dp),
                text = "Vocabulary",
            )
            SearchBar(
                query = contentSearch.value,
                onQueryChange = {
                    viewModel.onTextChange(it)
                },
                onSearch = {
                    viewModel.submit(it)
                    active.value = false
                },
                active = active.value,
                onActiveChange = {
                    active.value = it
                },
                colors = SearchBarDefaults.colors(Color.White),
                placeholder = {
                    Text(
                        text = "Nhập vào từ cần thêm",
                        fontSize = 14.sp,
                    )
                },
                windowInsets = WindowInsets(top = -40.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(50.dp, 200.dp)
                    .padding(all = 4.dp)
                    .drawBehind {
                        drawRoundRect(
                            color = Color.Gray,
                            size = size,
                            cornerRadius = androidx.compose.ui.geometry.CornerRadius(
                                18.dp.toPx(),
                                18.dp.toPx()
                            ),
                            style = Stroke(width = 1.dp.toPx())
                        )
                    },
                shape = RoundedCornerShape(if (active.value) 18.dp else 18.dp),

                ) {
                if (active.value) {

                }
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState()),
                ) {
                    resultSearch.value.forEach { item ->
                        Row(
                            modifier = Modifier
                                .clickable {
                                    item.content?.let { it1 -> viewModel.submit(it1) }
                                    active.value = false
                                },
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            item.content?.let { it1 ->
                                Text(
                                    text = it1,
                                    style = TextStyle(
                                        fontSize = 14.sp,
                                    ),
                                    modifier = Modifier.padding(start = 10.dp)
                                )
                            }
                        }
                    }
                }

            }
            Spacer(modifier = Modifier.height(10.dp))
            if (dataSearch.isEmpty()) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    CircularProgressIndicator(
                        modifier = Modifier
                            .width(20.dp)
                            .height(20.dp),
                        strokeWidth = 1.dp,
                        color = colorResource(id = R.color.purple_200)
                    )
                }

            } else {
                dataSearch.forEach { item ->
                    Log.d("data", "AddWordScreen: $item")
                    item.response?.let { it1 ->
                        ItemWordCardScreen(data = it1) {

                            viewModel.findDataByItem(item.response ?: "")
                            navController.navigate(Screen.BottomBar.DetailsCard.bRouter + "/" + item.response)
                        }
                    }
                }
            }
        }

    }


}

@Preview(showBackground = true)
@Composable
fun dada() {
}
