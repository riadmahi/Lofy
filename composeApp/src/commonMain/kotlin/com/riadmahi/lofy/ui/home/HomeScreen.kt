package com.riadmahi.lofy.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.riadmahi.lofy.model.Listing
import com.riadmahi.lofy.ui.component.BottomPillBar
import com.riadmahi.lofy.ui.component.CategoryChips
import com.riadmahi.lofy.ui.component.HorizontalListings
import com.riadmahi.lofy.ui.component.LargeListingCard
import com.riadmahi.lofy.ui.component.LofyTopBar
import com.riadmahi.lofy.ui.component.SearchPill
import com.riadmahi.lofy.ui.component.SectionTitle

@Composable
fun LofyHomeScreen(
    userName: String,
    avatarUrl: String?,
    recommended: List<Listing>,
    latest: List<Listing>,
    onSearchClick: () -> Unit,
    onFiltersClick: () -> Unit,
    onSelectCategory: (String) -> Unit,
    onListingClick: (Listing) -> Unit,
    onBellClick: () -> Unit
) {
    Box(
        Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background).statusBarsPadding()
    ) {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(bottom = 120.dp)
        ) {
            item {
                LofyTopBar(
                    userName = userName,
                    avatarUrl = avatarUrl,
                    onBellClick = onBellClick,
                    modifier = Modifier.fillMaxWidth()
                )
            }
            item { SearchPill(onSearchClick, onFiltersClick) }
            item { CategoryChips(onSelectCategory) }
            item { SectionTitle("Recommended") }
            item { HorizontalListings(recommended, onListingClick) }
            item { SectionTitle("Latest offers") }
            items(latest, key = { it.id }) { listing ->
                LargeListingCard(listing, onListingClick)
            }
        }

        BottomPillBar(
            items = listOf("Home", "Favorites", "Account", "Settings"),
            selected = 0,
            onClick = { /* TODO */ }
        )
    }
}