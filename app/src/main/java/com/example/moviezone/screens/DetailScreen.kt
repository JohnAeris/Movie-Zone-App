package com.example.moviezone.screens

import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImagePainter
import coil.compose.SubcomposeAsyncImage
import coil.compose.SubcomposeAsyncImageContent
import com.example.moviezone.R
import com.example.moviezone.components.FilledRectangleButton
import com.example.moviezone.components.OutlinedRectangleButton
import com.example.moviezone.model.getMovieData

@Composable
fun DetailScreen(navController: NavController, movieId: String?) {

    //Initializing variables
    val fetchMovie = getMovieData().filter { movie ->
        movie.id == movieId
    }
    val movie = fetchMovie.first()

    Scaffold(
        //Top App Bar
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

        //Movie Details User Interface
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {

            val context = LocalContext.current
            var isReadMore by remember {
                mutableStateOf(false)
            }

            LazyColumn {
                //Movie Image
                item {
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
                                         .makeText(
                                             context,
                                             "Play ${movie.title}",
                                             Toast.LENGTH_SHORT
                                         )
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

                    Box {
                        Divider(color = colorResource(id = R.color.old_lavender), thickness = 4.dp)
                        Divider(color = colorResource(id = R.color.red_ryb), thickness = 4.dp, modifier = Modifier.width(10.dp))
                    }
                 }

                //Movie Title, Year, Maturity Rating, Time, Type
                item {
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

                            Divider(
                                Modifier
                                    .width(0.5.dp)
                                    .height(15.dp),
                                thickness = 0.5.dp,
                                color = MaterialTheme.colors.primary)

                            Text(
                                text = movie.type,
                                style = MaterialTheme.typography.h6,
                                color = MaterialTheme.colors.primary
                            )
                        }

                    }
                }

                //Genre
                item {
                    Divider(
                        thickness = 1.dp,
                        modifier = Modifier.padding(
                            start = 5.dp,
                            end = 5.dp,
                            top = 15.dp,
                            bottom = 10.dp
                        ),
                        color = colorResource(id = R.color.gainsboro)
                    )

                    Column(modifier = Modifier.padding(start = 15.dp, end = 15.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "Genre: ",
                                style = MaterialTheme.typography.h4,
                                fontSize = 12.sp,
                                color = MaterialTheme.colors.primary
                            )

                            for (i in movie.genre) {
                                Card(
                                    modifier = Modifier
                                        .padding(3.dp)
                                        .wrapContentSize(),
                                    backgroundColor = MaterialTheme.colors.secondaryVariant
                                ) {
                                    Text(
                                        text = i,
                                        fontSize = 10.sp,
                                        style = MaterialTheme.typography.body2,
                                        color = MaterialTheme.colors.onSurface,
                                        modifier = Modifier.padding(start = 3.dp, end = 3.dp)
                                    )
                                }
                            }
                        }
                    }
                }

                //Play and Download Button
                item {
                    Spacer(modifier = Modifier.height(5.dp))

                    Column(verticalArrangement = Arrangement.spacedBy(5.dp), modifier = Modifier.padding(5.dp)) {
                        FilledRectangleButton(label = "Play", icon = Icons.Default.PlayArrow, onClick = {
                            Toast.makeText(context, "Play ${movie.title}", Toast.LENGTH_SHORT).show()
                        })

                        val downloadIcon = if (isSystemInDarkTheme()) {
                            painterResource(id = R.drawable.download_dark_theme_ic)
                        } else {
                            painterResource(id = R.drawable.download_light_theme_ic)
                        }

                        OutlinedRectangleButton(label = "Download", icon = downloadIcon, onClick = {
                            Toast.makeText(context, "Downloading ${movie.title}", Toast.LENGTH_SHORT).show()
                        })

                    }
                }

                //Movie Plot, Casts, Director
                item {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        backgroundColor = MaterialTheme.colors.background,
                        shape = RoundedCornerShape(CornerSize(8.dp)),
                        elevation = 4.dp
                    ) {
                        Column(modifier = Modifier.padding(5.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                            Column {
                                Text(text = movie.firstDescription, style = MaterialTheme.typography.body1, color = MaterialTheme.colors.primary)
                                
                                Spacer(modifier = Modifier.height(5.dp))
                                
                                AnimatedVisibility(visible = isReadMore) {
                                    Column {
                                        Text(text = movie.secondDescription, style = MaterialTheme.typography.body1, color = MaterialTheme.colors.primary)

                                        Spacer(modifier = Modifier.height(10.dp))

                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            Text(text = "Starring:", style = MaterialTheme.typography.h4, fontSize = 12.sp, color = MaterialTheme.colors.primary)
                                            Spacer(modifier = Modifier.width(10.dp))
                                            Text(text = movie.starring, style = MaterialTheme.typography.h6, color = MaterialTheme.colors.primary)
                                        }

                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            Text(text = "Director:", style = MaterialTheme.typography.h4, fontSize = 12.sp, color = MaterialTheme.colors.primary)
                                            Spacer(modifier = Modifier.width(10.dp))
                                            Text(text = movie.director, style = MaterialTheme.typography.h6, color = MaterialTheme.colors.primary)
                                        }
                                    }
                                }
                            }
                            
                            Spacer(modifier = Modifier.height(10.dp))
                            
                            Row(modifier = Modifier.clickable {
                                isReadMore = !isReadMore
                            }) {

                                val readMoreIcon = if (isReadMore) {
                                    Icons.Default.KeyboardArrowUp
                                } else {
                                    Icons.Default.ArrowDropDown
                                }

                                Icon(
                                    imageVector = readMoreIcon,
                                    contentDescription = "Show More Button",
                                    Modifier.size(20.dp),
                                    tint = MaterialTheme.colors.primary
                                )

                                Spacer(modifier = Modifier.width(5.dp))

                                Text(
                                    text = "Read more",
                                    style = MaterialTheme.typography.h2,
                                    fontSize = 12.sp,
                                    color = MaterialTheme.colors.primary
                                )

                            }

                        }

                    }
                }

            }
        }
    }
}