package com.riadmahi.lofy.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.riadmahi.lofy.model.Listing

@Composable
fun HorizontalListings(items: List<Listing>, onClick: (Listing) -> Unit) {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 20.dp),
        horizontalArrangement = Arrangement.spacedBy(14.dp)
    ) { items(items, key = { it.id }) { SmallListingCard(it, onClick) } }
}