package br.com.hackerman.starstore.network.domain

import br.com.hackerman.starstore.network.di.NetworkComponent
import br.com.hackerman.starstore.network.domain.model.ProductListResult

interface StoreApi {
    fun getProductList(): ProductListResult

    companion object {
        fun get(): StoreApi = StoreApiImpl(NetworkComponent.storeApiRepository)
    }
}