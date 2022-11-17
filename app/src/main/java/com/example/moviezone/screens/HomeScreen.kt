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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.ImageLoader
import coil.compose.AsyncImage
import coil.compose.AsyncImagePainter
import coil.compose.SubcomposeAsyncImage
import coil.compose.SubcomposeAsyncImageContent
import com.example.moviezone.R
import com.example.moviezone.model.MovieData
import com.example.moviezone.model.getMovieData
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
                moviePosterList: List<MovieData> = getMovieData()
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

            LazyRow() {
                items(items = moviePosterList) {
                    MovieCard(movie = it) { movie ->
                        navController.navigate(route = Screen.DetailScreen.name + "/$movie")
                    }
                }
            }
        }
    }
}

@Composable
private fun MovieCard(movie: MovieData, onPosterClick: (String) -> Unit) {

    val context = LocalContext.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Card(
            modifier = Modifier
                .wrapContentSize()
                .padding(start = 5.dp, end = 5.dp)
                .size(100.dp, 140.dp)
                .clickable {
                    Toast
                        .makeText(context, movie.title, Toast.LENGTH_SHORT)
                        .show()
                    onPosterClick(movie.id)
                },
            backgroundColor = MaterialTheme.colors.primaryVariant,
            shape = RoundedCornerShape(corner = CornerSize(4.dp)),
            elevation = 8.dp)
        {

            SubcomposeAsyncImage(
                model = movie.poster,
                contentDescription = "{${movie.title} Poster}",
                contentScale = ContentScale.FillBounds
            ) {
                val state = painter.state
                if (state is AsyncImagePainter.State.Loading || state is AsyncImagePainter.State.Error) {
                    CircularProgressIndicator()
                } else {
                    SubcomposeAsyncImageContent()
                }
            }
        }

        Text(
            text = movie.title,
            style = MaterialTheme.typography.caption,
            color = MaterialTheme.colors.primary
        )

    }
}