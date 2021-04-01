package br.com.hackerman.starstore.api

import br.com.hackerman.starstore.domain.Product
import br.com.hackerman.starstore.util.RetrofitUtil
import retrofit2.Response

object ProductApiHelper {
    suspend fun getProductList(): Response<List<Product>> {
        return RetrofitUtil.getApiService(ProductApi.BASE_URL, ProductApi::class.java).getProductList()
    }
}