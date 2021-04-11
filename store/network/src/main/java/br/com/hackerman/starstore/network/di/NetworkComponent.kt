package br.com.hackerman.starstore.network.di

import br.com.hackerman.starstore.network.data.repository.StoreApiRepository
import br.com.hackerman.starstore.network.data.store.StoreApi
import br.com.hackerman.starstore.util.RetrofitUtil

internal object NetworkComponent {
    val storeApiRepository: StoreApiRepository by lazy {
        StoreApiRepository(RetrofitUtil.getApiService(StoreApi.BASE_URL, StoreApi::class.java))
    }
}