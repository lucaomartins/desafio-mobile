package br.com.hackerman.starstore.network.data.model

data class Product(
        val title: String,
        val price: Long,
        val zipcode: String,
        val seller: String,
        val thumbnailHd: String,
        val date: String
)