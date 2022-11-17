package com.example.moviezone.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
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
                movieList: List<MovieData> = getMovieData()
) {
    LazyColumn(
        modifier = Modifier.padding(20.dp)
    ) {
        item {
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

                Spacer(modifier = Modifier.height(20.dp))
            }
        }

        item {
            Text(
                text = "New Releases",
                style = MaterialTheme.typography.h3,
                color = colorResource(id = R.color.red_ryb))

            LazyRow() {
                items(items = movieList.filter { movie -> movie.genre.contains("New Release")}) { it ->
                    NewMovieCard(movie = it) { movie ->
                        navController.navigate(route = Screen.DetailScreen.name + "/$movie")
                    }
                }
            }
        }

        item {
            Text(
                text = "Anime",
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.primary)

            LazyRow() {
                items(items = movieList.filter { movie -> movie.genre.contains("Anime")}) { it ->
                    MovieCard(movie = it) { movie ->
                        navController.navigate(route = Screen.DetailScreen.name + "/$movie")
                    }
                }
            }
        }

        item {
            Text(
                text = "Adventure",
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.primary)

            LazyRow() {
                items(items = movieList.filter { movie -> movie.genre.contains("Adventure")}) { it ->
                    MovieCard(movie = it) { movie ->
                        navController.navigate(route = Screen.DetailScreen.name + "/$movie")
                    }
                }
            }
        }

        item {
            Text(
                text = "Comedy",
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.primary)

            LazyRow() {
                items(items = movieList.filter { movie -> movie.genre.contains("Comedy")}) { it ->
                    MovieCard(movie = it) { movie ->
                        navController.navigate(route = Screen.DetailScreen.name + "/$movie")
                    }
                }
            }
        }

        item {
            Text(
                text = "Action",
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.primary)

            LazyRow() {
                items(items = movieList.filter { movie -> movie.genre.contains("Action")}) { it ->
                    MovieCard(movie = it) { movie ->
                        navController.navigate(route = Screen.DetailScreen.name + "/$movie")
                    }
                }
            }
        }

        item {
            Text(
                text = "Thriller",
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.primary)

            LazyRow() {
                items(items = movieList.filter { movie -> movie.genre.contains("Thriller")}) { it ->
                    MovieCard(movie = it) { movie ->
                        navController.navigate(route = Screen.DetailScreen.name + "/$movie")
                    }
                }
            }
        }

        item {
            Text(
                text = "Drama",
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.primary)

            LazyRow() {
                items(items = movieList.filter { movie -> movie.genre.contains("Drama")}) { it ->
                    MovieCard(movie = it) { movie ->
                        navController.navigate(route = Screen.DetailScreen.name + "/$movie")
                    }
                }
            }
        }


    }
}

//Movie Poster Card
@Composable
private fun MovieCard(movie: MovieData, onPosterClick: (String) -> Unit) {

    val context = LocalContext.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(5.dp),
        modifier = Modifier.size(width = 100.dp, height = 200.dp)
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
            maxLines = 3,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Clip,
            style = MaterialTheme.typography.caption,
            color = MaterialTheme.colors.primary
        )

    }
}

//New Release Movie Poster Card
@Composable
private fun NewMovieCard(movie: MovieData, onPosterClick: (String) -> Unit) {

    val context = LocalContext.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(5.dp),
        modifier = Modifier.size(width = 100.dp, height = 200.dp)
    ) {
        Box() {
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

            Card(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(start = 10.dp, top = 5.dp),
                backgroundColor = colorResource(id = R.color.red_ryb),
                shape = RoundedCornerShape(CornerSize(2.dp))
            ) {
                Text(text = "New", style = MaterialTheme.typography.h1, fontSize = 8.sp, color = Color.White, modifier = Modifier.padding(bottom = 2.dp, start = 3.dp, end = 3.dp))
            }
        }

        Text(
            text = movie.title,
            maxLines = 3,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Clip,
            style = MaterialTheme.typography.caption,
            color = MaterialTheme.colors.primary
        )

    }
}