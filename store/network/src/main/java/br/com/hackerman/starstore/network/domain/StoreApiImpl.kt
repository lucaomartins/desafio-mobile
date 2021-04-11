package br.com.hackerman.starstore.network.domain

import br.com.hackerman.starstore.network.data.repository.StoreApiRepository
import br.com.hackerman.starstore.network.domain.model.ProductListResult

internal class StoreApiImpl(private val storeApiRepository: StoreApiRepository) : StoreApi {
    override fun getProductList(): ProductListResult {
        return storeApiRepository.getProductList()
    }
}