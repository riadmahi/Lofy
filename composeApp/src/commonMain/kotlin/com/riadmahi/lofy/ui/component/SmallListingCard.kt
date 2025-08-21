package com.riadmahi.lofy.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.riadmahi.lofy.model.Listing

@Composable
fun SmallListingCard(item: Listing, onClick: (Listing) -> Unit) {
    Column(
        Modifier.width(260.dp)
            .clip(RoundedCornerShape(24.dp))
            .background(MaterialTheme.colorScheme.surface)
            .clickable { onClick(item) }
    ) {
        AsyncImage(
            model = item.imageUrl,
            modifier = Modifier.fillMaxWidth().height(150.dp),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Box(Modifier.padding(12.dp)) {
            Column {
                Text(item.title, style = MaterialTheme.typography.titleMedium, maxLines = 1, color = MaterialTheme.colorScheme.onSurface)
                Text("${item.city}, ${item.state}", color = Color(0xFF8D8D8D))
            }
            Surface(
                modifier = Modifier.align(Alignment.TopEnd),
                shape = RoundedCornerShape(12.dp),
                color = Color(0xFF2B2B2B)
            ) {
                Text(
                    "★ ${item.rating}",
                    color = Color.White,
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                )
            }
        }
        Row(
            Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("$${item.pricePerMonth}", style = MaterialTheme.typography.titleMedium, color = MaterialTheme.colorScheme.onSurface,)
            Text(" / month", color = Color(0xFF8D8D8D), modifier = Modifier.padding(start = 4.dp))
        }
    }
}
