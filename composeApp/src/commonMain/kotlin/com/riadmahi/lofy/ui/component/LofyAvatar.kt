package com.riadmahi.lofy.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@Composable
fun LofyAvatar(avatarUrl: String?, size: Int = 36) {
    val modifier = Modifier.size(size.dp).clip(CircleShape)

    if (avatarUrl.isNullOrBlank()) {
        // Placeholder
        Box(
            modifier.background(Color(0xFFD9D9D9)),
            contentAlignment = Alignment.Center
        ) {
            Text("J", color = Color(0xFF2B2B2B))
        }
    } else {
        AsyncImage(
            model = avatarUrl,
            contentDescription = null,
            modifier = modifier,
            contentScale = ContentScale.Crop
        )
    }
}