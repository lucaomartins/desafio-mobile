package br.com.hackerman.starstore.api

import br.com.hackerman.starstore.domain.Product
import retrofit2.Response
import retrofit2.http.GET

interface ProductApi {
    @GET("store/products.json")
    suspend fun getProductList(): Response<List<Product>>

    companion object {
        const val BASE_URL = "https://raw.githubusercontent.com/stone-pagamentos/desafio-mobile/master/"
    }
}