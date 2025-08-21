package com.riadmahi.lofy

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform