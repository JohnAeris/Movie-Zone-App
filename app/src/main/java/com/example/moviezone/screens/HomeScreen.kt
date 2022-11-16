package com.example.moviezone.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.moviezone.R
import com.example.moviezone.navigation.Screen


@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = MaterialTheme.colors.surface,
                elevation = 4.dp
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(start = 10.dp))
                {

                    Image(
                        painter = painterResource(R.drawable.app_ic),
                        contentDescription = "Application's Icon",
                        modifier = Modifier.size(25.dp)
                    )

                    Spacer(modifier = Modifier.width(10.dp))


                    Text(
                        text = "MovieZone",
                        style = MaterialTheme.typography.h1,
                        color = MaterialTheme.colors.primary,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                }
            }
        }
    ) {
        MainContent(navController)
    }
}

@Composable
fun MainContent(navController: NavController,
                moviePosterList: List<Painter> =
                    listOf(
                        painterResource(id = R.drawable.jujutsu_poster),
                        painterResource(id = R.drawable.bluelock_poster),
                        painterResource(id = R.drawable.hunter_poster),
                        painterResource(id = R.drawable.bleach_poster),
                        painterResource(id = R.drawable.demon_slayer)
                    )
) {
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        Column() {
            Text(
                text = "Movies",
                style = MaterialTheme.typography.h2,
                color = MaterialTheme.colors.primary)

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = stringResource(R.string.movie_description),
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.primary)
        }

        Column() {
            Text(
                text = "Anime",
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.primary)

            val context = LocalContext.current

            LazyRow() {
                items(items = moviePosterList) { item ->
                    MovieCard(item) { movie ->
                        navController.navigate(route = Screen.DetailScreen.name)
                        //Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}

@Composable
private fun MovieCard(item: Painter, onPosterClick: (Painter) -> Unit) {
    Card(
        modifier = Modifier
            .wrapContentSize()
            .padding(start = 5.dp, end = 5.dp)
            .size(100.dp, 140.dp)
            .clickable {
                onPosterClick(item)
            },
        shape = RoundedCornerShape(corner = CornerSize(4.dp)),
        elevation = 8.dp)
    {
        Image(
            painter = item,
            contentDescription = "Movie Poster",
            contentScale = ContentScale.FillBounds
        )
    }
}