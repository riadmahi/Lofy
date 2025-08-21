package com.riadmahi.lofy.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val LightColors = lightColorScheme(
    primary = Color(0xFF111111),
    onPrimary = Color.White,
    secondary = Color(0xFFEFE3DB),
    onSecondary = Color(0xFF111111),
    background = Color(0xFFF6F2EE),    // Fond global beige
    onBackground = Color(0xFF111111),
    surface = Color.White,             // Cartes / barres flottantes
    onSurface = Color(0xFF111111),
    error = Color(0xFFB3261E),
    onError = Color.White,
)

val DarkColors = darkColorScheme(
    primary = Color(0xFFEFE3DB),       // Beige clair en accent
    onPrimary = Color(0xFF111111),
    secondary = Color(0xFF444444),     // Gris foncé pour éléments secondaires
    onSecondary = Color(0xFFEFE3DB),
    background = Color(0xFF111111),    // Fond global noir
    onBackground = Color(0xFFEFE3DB),
    surface = Color(0xFF1E1E1E),       // Cartes foncées
    onSurface = Color(0xFFEFE3DB),
    error = Color(0xFFCF6679),
    onError = Color.Black,
)