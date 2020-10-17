import disposable.BasicDisposable
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import reactor.core.Disposable

interface DisposableTest <T: Disposable> {

    fun createDisposable(): T

    @Test
    fun `should return false on calling isDisposed on new Disposable`() {
        val disposable: Disposable = BasicDisposable()
        assertFalse(disposable.isDisposed())
    }

    @Test
    fun `should return false on calling isDisposed after calling disposed`() {
        val disposable: Disposable = BasicDisposable()
        disposable.dispose()
        assertTrue(disposable.isDisposed())
    }
}