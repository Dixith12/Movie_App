package com.example.movieapp.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.movieapp.getmovie
import com.example.movieapp.navigation.MovieScreen
import com.example.movieapp.widget.Movierow
import com.example.movieapp.movie as movie


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Scaffold(
        topBar ={
            TopAppBar(title = {
                Icons.AutoMirrored.Filled.ArrowBack
                Text(text = "MOVIE APP", modifier = Modifier.fillMaxWidth(), fontSize = 25.sp, fontWeight = FontWeight.ExtraBold,textAlign = TextAlign.Center)
            }, colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xFFFAF098)))
        }){
        body(it, navController = navController)
    }
}
@Composable
fun body(paddingValues: PaddingValues, movielist:List<movie> = getmovie(), navController: NavController) {
    Column(modifier = Modifier.padding(paddingValues)) {
        LazyColumn {
            items(movielist){movies->
                    Movierow(movies = movies){
                        movie->
                            navController.navigate(route = MovieScreen.DetailScreen.name+"/$movie")
                    }
                }
            }
        }
    }





