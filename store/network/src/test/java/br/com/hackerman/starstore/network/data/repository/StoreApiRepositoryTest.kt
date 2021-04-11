package br.com.hackerman.starstore.network.data.repository

import br.com.hackerman.starstore.network.data.model.Product
import br.com.hackerman.starstore.network.data.store.StoreApi
import br.com.hackerman.starstore.network.domain.model.ProductListResult
import io.mockk.coEvery
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import retrofit2.Response

@Suppress("ClassName")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class StoreApiRepositoryTest {
    private val storeApiMock: StoreApi = mockk()

    @Nested
    inner class `Being an successful response When called method` {

        private val successResponseMock: Response<List<Product>> = mockk {
            every { isSuccessful } returns true
            every { body() } returns mockk()
        }

        @BeforeEach
        internal fun setUp() {
            coEvery { storeApiMock.getProductList() } returns successResponseMock
        }

        @Test
        fun `getProductList Should return a ProductListResult Success`() {
            val subject = StoreApiRepository(storeApiMock)
            assert(subject.getProductList() is ProductListResult.Success)
        }
    }

    @Nested
    inner class `Being an error response When called method` {

        private val errorResponseMock: Response<List<Product>> = mockk {
            every { isSuccessful } returns false
            every { errorBody() } returns mockk()
            every { message() } returns ""
        }

        @BeforeEach
        internal fun setUp() {
            coEvery { storeApiMock.getProductList() } returns errorResponseMock
        }

        @Test
        fun `getProductList Should return a ProductListResult Error`() {
            val subject = StoreApiRepository(storeApiMock)
            assert(subject.getProductList() is ProductListResult.Error)
        }
    }

}