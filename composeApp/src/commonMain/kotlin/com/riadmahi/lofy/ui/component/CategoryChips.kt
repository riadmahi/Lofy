package com.riadmahi.lofy.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CategoryChips(onSelect: (String) -> Unit) {
    val categories = listOf("Apartment","House","Flat","Studio")
    var selected by remember { mutableStateOf(categories.first()) }
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 20.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(categories) { label ->
            val active = label == selected
            Box(
                Modifier.clip(RoundedCornerShape(20.dp))
                    .background(if (active) Color.Black else MaterialTheme.colorScheme.surface)
                    .border(
                        width = if (active) 0.dp else 1.dp,
                        color = MaterialTheme.colorScheme.secondary,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .clickable {
                        selected = label
                        onSelect(label)
                    }
                    .padding(horizontal = 14.dp, vertical = 10.dp)
            ) {
                Text(label, color = if (active) Color.White else MaterialTheme.colorScheme.onSurface)
            }
        }
    }
}