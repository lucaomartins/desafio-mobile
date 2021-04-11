package br.com.hackerman.starstore.network.data.repository

import br.com.hackerman.starstore.network.data.store.StoreApi
import br.com.hackerman.starstore.network.domain.model.ProductListResult
import com.google.gson.Gson
import kotlinx.coroutines.runBlocking

internal class StoreApiRepository(
    private val storeApi: StoreApi
) {
    fun getProductList(): ProductListResult {
        return runBlocking {
            storeApi.getProductList().let {
                if (it.isSuccessful) {
                    ProductListResult.Success(it.body()!!)
                } else {
                    ProductListResult.Error(Gson().toJson(it.errorBody()), it.message())
                }
            }
        }
    }
}