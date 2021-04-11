package br.com.hackerman.starstore.network.domain.model

import br.com.hackerman.starstore.network.data.model.Product

sealed class ProductListResult {
    data class Success(val productList: List<Product>) : ProductListResult()
    data class Error(val reason: String, val additionalInfo: String) : ProductListResult()
}