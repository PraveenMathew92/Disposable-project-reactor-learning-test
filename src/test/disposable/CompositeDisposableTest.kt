import disposable.BasicDisposable
import disposable.CompositeDisposable
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import reactor.core.Disposable

class CompositeDisposableTest : DisposableTest<CompositeDisposable> {
    override fun createDisposable(): CompositeDisposable {
        return CompositeDisposable()
    }

    @Test
    fun `should add a disposable to composite disposable`() {
        val disposable: Disposable = BasicDisposable()
        val compositeDisposable = CompositeDisposable()
        val response = compositeDisposable.add(disposable)

        assertTrue(response)
    }

    @Test
    fun `should dispose the composite disposable when the container is disposed`() {
        val disposable: Disposable = BasicDisposable()
        val anotherDisposable: Disposable = BasicDisposable()
        val compositeDisposable = CompositeDisposable()

        compositeDisposable.add(disposable)
        compositeDisposable.add(anotherDisposable)
        compositeDisposable.dispose()

        assertTrue(disposable.isDisposed)
        assertTrue(anotherDisposable.isDisposed)
    }

    @Test
    fun `should not dispose the disposable that has been removed from the composite disposable`() {
        val disposable: Disposable = BasicDisposable()
        val anotherDisposable: Disposable = BasicDisposable()
        val compositeDisposable = CompositeDisposable()

        compositeDisposable.add(disposable)
        compositeDisposable.add(anotherDisposable)
        val response = compositeDisposable.remove(disposable)
        compositeDisposable.dispose()

        assertTrue(response)
        assertFalse(disposable.isDisposed)
        assertTrue(anotherDisposable.isDisposed)
    }
}