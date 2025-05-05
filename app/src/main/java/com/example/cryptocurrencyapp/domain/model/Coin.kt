package com.example.cryptocurrencyapp.domain.model

data class Coin(   //Thing which we show in our app
    val id: String,
    val isActive: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
)
