package com.example.composetutorial.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColors = darkColors(
    primary = Color.Gray,
    primaryVariant = Color.Black,
    secondary = Color.White
)

private val LightColors = lightColors(
    primary = Color.Green,
    primaryVariant = Color.Cyan,
    secondary = Color.DarkGray
)

@Composable
fun SampleCustomTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val color = if (darkTheme) DarkColors else LightColors

    MaterialTheme(colors = color) {
        content()
    }
}