import disposable.BasicDisposable
import disposable.SwapDisposable
import disposable.SwapDisposable.Companion.DEFAULT_DISPOSABLE
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class SwapDisposableTest : DisposableTest<SwapDisposable> {
    override fun createDisposable(): SwapDisposable {
        return SwapDisposable()
    }

    @Test
    fun `should return default diposable if no disosable is present`() {
        val swapDisposable = SwapDisposable()
        assertEquals(DEFAULT_DISPOSABLE, swapDisposable.get())
    }

    @Test
    internal fun `should get disposable added by replace`() {
        val disposable = BasicDisposable()
        val swapDisposable = SwapDisposable()
        val response = swapDisposable.replace(disposable)

        assertEquals(disposable, swapDisposable.get())
        assertTrue(response)
    }

    @Test
    fun `should get disposable added by update`() {
        val disposable = BasicDisposable()
        val swapDisposable = SwapDisposable()
        val response = swapDisposable.update(disposable)

        assertEquals(disposable, swapDisposable.get())
        assertTrue(response)
    }
}