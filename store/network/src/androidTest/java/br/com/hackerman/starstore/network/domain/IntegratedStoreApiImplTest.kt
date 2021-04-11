package br.com.hackerman.starstore.network.domain

import br.com.hackerman.starstore.network.domain.model.ProductListResult
import org.junit.Test

internal class IntegratedStoreApiImplTest {

    @Test
    fun getProductList() {
        val subject = StoreApi.get()
        val result = subject.getProductList()
        assert(result is ProductListResult.Success)
    }
}