package com.example.moviezone.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.moviezone.R

val Bangers = FontFamily(Font(R.font.bangers_regular))

val PoppinsBold = FontFamily(Font(R.font.poppins_bold))
val PoppinsSemiBold = FontFamily(Font(R.font.poppins_semi_bold))
val PoppinsMedium = FontFamily(Font(R.font.poppins_medium))
val PoppinsNormal = FontFamily(Font(R.font.poppins_regular))
val PoppinsExtraLight = FontFamily(Font(R.font.poppins_extra_light))
val PoppinsExtraLightItalic = FontFamily(Font(R.font.poppins_extra_light_italic))
val PoppinsThin = FontFamily(Font(R.font.poppins_thin))
val PoppinsThinItalic = FontFamily(Font(R.font.poppins_thin))

// Set of Material typography styles to start with
val Typography = Typography(

    h1 = TextStyle(
        fontFamily = Bangers,
        fontSize = 24.sp
    ),

    h2 = TextStyle(
        fontFamily = PoppinsBold,
        fontSize = 24.sp
    ),

    h3 = TextStyle(
        fontFamily = PoppinsSemiBold,
        fontSize = 20.sp
    ),

    h4 = TextStyle(
        fontFamily = PoppinsMedium,
        fontSize = 16.sp
    ),

    h5 = TextStyle(
        fontFamily = PoppinsNormal,
        fontSize = 16.sp
    ),

    h6 = TextStyle(
        fontFamily = PoppinsExtraLight,
        fontSize = 12.sp
    ),

    body1 = TextStyle(
        fontFamily = PoppinsNormal,
        fontSize = 12.sp
    ),

    body2 = TextStyle(
        fontFamily = PoppinsExtraLightItalic,
        fontSize = 12.sp
    ),

    subtitle1 = TextStyle(
        fontFamily = PoppinsThin,
        fontSize = 12.sp
    ),

    subtitle2 = TextStyle(
        fontFamily = PoppinsThinItalic,
        fontSize = 12.sp
    ),

    caption = TextStyle(
        fontFamily = PoppinsMedium,
        fontSize = 12.sp
    ),

    button = TextStyle(
        fontFamily = PoppinsMedium,
        fontSize = 16.sp
    )

)