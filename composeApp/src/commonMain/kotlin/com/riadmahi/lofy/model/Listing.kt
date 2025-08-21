package com.riadmahi.lofy.model

data class Listing(
    val id: String,
    val title: String,
    val city: String,
    val state: String,
    val pricePerMonth: Int,
    val rating: Double,
    val imageUrl: String,
)