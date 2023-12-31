package com.septalfauzan.sodoku.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColorScheme(
    primary = DarkBluePastel,
    inversePrimary = DarkGrayBlueVariant,
    secondary = DarkGrayBlue,
    surface = DarkGrayBlueSurface,
)

private val LightColorPalette = lightColorScheme(
    primary = BluePastel,
    inversePrimary = GrayBlue,
    secondary = LightGrayBlue,
    surface = White,
    background = BlueishWhite,
    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun SodokuTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}