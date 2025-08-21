package com.riadmahi.lofy.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.riadmahi.lofy.model.Listing

@Composable
fun LargeListingCard(item: Listing, onClick: (Listing) -> Unit) {
    Column(
        Modifier.padding(horizontal = 20.dp)
            .clip(RoundedCornerShape(24.dp))
            .background(MaterialTheme.colorScheme.surface)
            .clickable { onClick(item) }
    ) {
        AsyncImage(
            model = item.imageUrl,
            modifier = Modifier.fillMaxWidth().height(180.dp),
            contentDescription = null
        )
        Column(Modifier.padding(14.dp)) {
            Text(item.title, color = MaterialTheme.colorScheme.onSurface, style = MaterialTheme.typography.titleMedium)
            Text("${item.city}, ${item.state}", color = Color(0xFF8D8D8D))
            Spacer(Modifier.height(8.dp))
            Text("$${item.pricePerMonth} / month", color = MaterialTheme.colorScheme.onSurface, style = MaterialTheme.typography.titleMedium)
        }
    }
}
