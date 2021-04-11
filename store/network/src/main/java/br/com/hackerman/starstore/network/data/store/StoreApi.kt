package br.com.hackerman.starstore.network.data.store

import br.com.hackerman.starstore.network.data.model.Product
import retrofit2.Response
import retrofit2.http.GET

internal interface StoreApi {
    @GET("store/products.json")
    suspend fun getProductList(): Response<List<Product>>

    companion object {
        const val BASE_URL = "https://raw.githubusercontent.com/stone-pagamentos/desafio-mobile/master/"
    }
}