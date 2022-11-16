package com.example.moviezone.screens

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImagePainter
import coil.compose.SubcomposeAsyncImage
import coil.compose.SubcomposeAsyncImageContent
import com.example.moviezone.R
import com.example.moviezone.model.MovieData
import com.example.moviezone.model.getMovieData
import com.example.moviezone.ui.theme.PoppinsExtraLight
import com.example.moviezone.ui.theme.PoppinsMedium

@Composable
fun DetailScreen(navController: NavController, movieId: String?) {

    val fetchMovie = getMovieData().filter { movie ->
        movie.id == movieId
    }

    val movie = fetchMovie.first()

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
                    
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Arrow Back",
                        modifier = Modifier
                            .clickable { navController.popBackStack() },
                        tint = MaterialTheme.colors.primary
                    )
                    
                    Spacer(modifier = Modifier.width(5.dp))

                    Text(
                        text = "Back",
                        style = MaterialTheme.typography.h3,
                        color = MaterialTheme.colors.primary,
                        modifier = Modifier.padding(top = 5.dp)
                    )

                }
            }
        }
    ) {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {

            val context = LocalContext.current

            Column {
                Box(contentAlignment = Alignment.Center) {
                    Card(
                        backgroundColor = MaterialTheme.colors.onBackground,
                        shape = RectangleShape,
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(200.dp)) {

                        SubcomposeAsyncImage(
                            model = movie.image,
                            contentDescription = "{${movie.title} Image}",
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
                        shape = CircleShape,
                        backgroundColor = Color.White,
                        elevation = 8.dp,
                        modifier = Modifier
                            .clickable {
                                Toast
                                    .makeText(context, "Play ${movie.title}", Toast.LENGTH_SHORT)
                                    .show()
                            }
                            .size(50.dp),
                    )
                    {
                        Icon(
                            imageVector = Icons.Default.PlayArrow,
                            contentDescription = "Play Button",
                            tint = colorResource(id = R.color.red_ryb),
                            modifier = Modifier.size(40.dp)
                        )
                    }
                }

                Box() {
                    Divider(color = colorResource(id = R.color.old_lavender), thickness = 4.dp)
                    Divider(color = colorResource(id = R.color.red_ryb), thickness = 4.dp, modifier = Modifier.width(10.dp))
                }

                Column(modifier = Modifier.padding(start = 10.dp)) {
                    Text(
                        text = movie.title,
                        fontSize = 28.sp,
                        style = MaterialTheme.typography.h2,
                        color = MaterialTheme.colors.primary
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                        Text(
                            text = movie.year,
                            style = MaterialTheme.typography.h6,
                            color = MaterialTheme.colors.primary
                        )

                        Divider(
                            Modifier
                                .width(0.5.dp)
                                .height(15.dp),
                            thickness = 0.5.dp,
                            color = MaterialTheme.colors.primary)

                        Card(
                            modifier = Modifier.wrapContentSize(),
                            shape = RoundedCornerShape(CornerSize(4.dp)),
                            backgroundColor = colorResource(id = R.color.old_lavender)
                        ) {
                            Text(
                                text = movie.maturityRating,
                                style = MaterialTheme.typography.h5,
                                fontSize = 12.sp,
                                color = MaterialTheme.colors.primary,
                                modifier = Modifier.padding(start = 5.dp, end = 5.dp, top = 2.dp, bottom = 2.dp)
                            )
                        }

                        Divider(
                            Modifier
                                .width(0.5.dp)
                                .height(15.dp),
                            thickness = 0.5.dp,
                            color = MaterialTheme.colors.primary)

                        Text(
                            text = movie.time,
                            style = MaterialTheme.typography.h6,
                            color = MaterialTheme.colors.primary
                        )
                    }

                }


            }
        }
    }
}