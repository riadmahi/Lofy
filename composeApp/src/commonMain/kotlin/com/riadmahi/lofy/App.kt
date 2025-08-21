package com.riadmahi.lofy

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.riadmahi.lofy.model.Listing
import com.riadmahi.lofy.theme.LofyTheme
import com.riadmahi.lofy.ui.home.LofyHomeScreen
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import lofy.composeapp.generated.resources.Res
import lofy.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    val demo = List(6) {
        Listing(
            id = "$it",
            title = listOf("Celestia Loft", "Sapphire Home", "Luma Studio")[it % 3],
            city = listOf("Minneapolis", "Columbus", "Austin")[it % 3],
            state = listOf("MN", "OH", "TX")[it % 3],
            pricePerMonth = listOf(1200, 1450, 980)[it % 3],
            rating = listOf(4.8, 4.6, 4.9)[it % 3],
            imageUrl = "https://picsum.photos/seed/$it/800/600"
        )
    }

    LofyTheme {
        LofyHomeScreen(
            userName = "James Carter",
            avatarUrl = "https://picsum.photos/seed/james/200",
            recommended = demo.take(3),
            latest = demo,
            onSearchClick = {},
            onFiltersClick = {},
            onSelectCategory = {},
            onListingClick = {},
            onBellClick = {}
        )
    }
}