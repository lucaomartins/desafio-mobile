package br.com.hackerman.starstore.network.domain

import br.com.hackerman.starstore.network.data.repository.StoreApiRepository
import io.mockk.every
import io.mockk.mockk
import io.mockk.verifySequence
import org.junit.jupiter.api.Test

internal class StoreApiImplTest {
    private val storeApiRepositoryMock: StoreApiRepository = mockk {
        every { getProductList() } returns mockk()
    }

    @Test
    fun `When called getProductList method Should call getProductList from storeApiRepository`() {
        val subject = StoreApiImpl(storeApiRepositoryMock)
        subject.getProductList()
        verifySequence {
            storeApiRepositoryMock.getProductList()
        }
    }
}