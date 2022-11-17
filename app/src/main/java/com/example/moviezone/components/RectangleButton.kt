package com.example.moviezone.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.Icon
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import com.example.moviezone.R

@Composable
fun FilledRectangleButton(
    modifier: Modifier = Modifier,
    label: String,
    onClick: () -> Unit,
    elevation: Dp = 8.dp,
    icon: ImageVector
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onClick.invoke()
            },
        shape = RoundedCornerShape(CornerSize(4.dp)),
        elevation = elevation,
        backgroundColor = MaterialTheme.colors.secondaryVariant

    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(10.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = icon,
                    contentDescription = "Button",
                    tint = MaterialTheme.colors.onSurface,
                    modifier = Modifier.size(20.dp)
                )
                
                Spacer(modifier = Modifier.width(10.dp))
                
                Text(text = label, style = MaterialTheme.typography.button, color = MaterialTheme.colors.onSurface)
            }    
        }
    }
}

@Composable
fun OutlinedRectangleButton(
    modifier: Modifier = Modifier,
    label: String,
    onClick: () -> Unit,
    elevation: Dp = 4.dp,
    icon: Painter
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onClick.invoke()
            },
        shape = RoundedCornerShape(CornerSize(4.dp)),
        elevation = elevation,
        border = BorderStroke(1.dp, colorResource(id = R.color.old_lavender)),
        backgroundColor = MaterialTheme.colors.background

    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(10.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = icon,
                    contentDescription = "Download Button",
                    modifier = Modifier
                        .size(25.dp)
                )

                Spacer(modifier = Modifier.width(10.dp))

                Text(text = label, style = MaterialTheme.typography.button, color = MaterialTheme.colors.primary)
            }
        }
    }
}