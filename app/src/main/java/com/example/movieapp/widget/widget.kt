

package com.example.movieapp.widget

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight

import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.movieapp.getmovie
import com.example.movieapp.movie
import kotlin.math.exp


@Composable
fun Movierow(
    movies: movie= getmovie()[0],
    onitemclick: (String) -> Unit
){
    var expanded by remember {
        mutableStateOf(false)
    }

    Card(modifier = Modifier
        .padding(4.dp)
        .fillMaxWidth()
        .clickable {
            onitemclick(movies.Id)
        }, colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)

    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Surface(modifier = Modifier
                .padding(12.dp)
                .height(70.dp)
                .width(100.dp),
                shape = RoundedCornerShape(corner = CornerSize(5.dp))
            ) {
                Image(painter = rememberAsyncImagePainter(model = movies.Images[0], contentScale = ContentScale.Crop),
                    contentDescription ="logo", modifier = Modifier.height(102.dp) )
            }
            Column(modifier = Modifier.padding(4.dp)) {
            Text(text = movies.Title, fontSize = 19.sp, fontWeight = FontWeight.Bold)
                Text(text = "Director:${movies.Director}", fontSize = 13.sp, fontWeight = FontWeight.SemiBold)
                Text(text ="Realeased:${movies.Year}" , fontSize = 13.sp, fontWeight = FontWeight.SemiBold)


                AnimatedVisibility(visible = expanded) {
                    Column(modifier = Modifier.padding(4.dp), verticalArrangement = Arrangement.SpaceEvenly) {
                        Text(buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color.DarkGray, fontSize = 13.sp)){
                                append("Plot: ")
                            }
                            withStyle(style = SpanStyle(color = Color.DarkGray, fontSize = 12.sp, fontWeight = FontWeight.Normal)){
                                append(movies.Plot)
                            } },modifier = Modifier.padding(6.dp))

                            Divider(modifier = Modifier.padding(6.dp))

                            Text(text = "Genre:${movies.Genre}", fontSize = 12.sp, fontWeight = FontWeight.SemiBold)
                            Text(text = "Actors:${movies.Actor}", fontSize = 12.sp, fontWeight = FontWeight.SemiBold)
                            Text(text = "Ratings:${movies.Ratings}", fontSize = 12.sp, fontWeight = FontWeight.SemiBold)


                    }
                }
                Icon(imageVector = if(expanded)  Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown , contentDescription ="Account Box", modifier = Modifier
                    .size(23.dp)
                    .padding(2.dp)
                    .clickable {
                        expanded = !expanded
                    })
        }

        }
    }
}

