

package com.example.movieapp.Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
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
import coil.compose.rememberAsyncImagePainter
import com.example.movieapp.getmovie
import com.example.movieapp.movie
import com.example.movieapp.widget.Movierow


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun DetailScreen(navController: NavController, movieId: String?) {
    val newMOvieList = getmovie().filter { movies->
        movies.Id==movieId
    }
    Scaffold(
        topBar ={
            TopAppBar(title = {
                Image(imageVector = Icons.Filled.ArrowBack, contentDescription = "click", modifier = Modifier.clickable { navController.popBackStack()})
                Text(text = "MOVIE APP", modifier = Modifier.fillMaxWidth(), fontSize = 25.sp, fontWeight = FontWeight.ExtraBold,textAlign = TextAlign.Center)
            }, colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color(0xFFFAF098)))
        }){

        DetailValue(it,newMOvieList)
    }

}

@Composable
private fun DetailValue(PaddingValues: PaddingValues, newMOvieList: List<movie>) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {

        Column(modifier = Modifier.padding(PaddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Movierow(movies = newMOvieList.first()) {}
            Spacer(modifier = Modifier.height(8.dp))
            HorizontalDivider(modifier = Modifier.padding(4.dp))
            Text(text = "Movie Images", fontSize = 20.sp, fontWeight = FontWeight.ExtraBold)
            LazyRow(modifier = Modifier.wrapContentHeight()) {
                items(newMOvieList[0].Images) { image ->
                    Card(
                        modifier = Modifier
                            .padding(6.dp)
                            .size(240.dp).wrapContentHeight().wrapContentWidth(), elevation = CardDefaults.cardElevation(4.dp)
                    ) {
                        Image(
                            painter = rememberAsyncImagePainter(model = image),
                            contentDescription = "images"
                        )
                    }
                }
            }
        }
    }
}


