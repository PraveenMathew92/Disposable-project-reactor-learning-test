import disposable.BasicDisposable
import org.junit.Assert.assertFalse
import org.junit.Test
import reactor.core.Disposable

public class DisposableTest {
    @Test
    internal fun `should return false on calling isDisposed on new Disposable`() {
        val disposable: Disposable = BasicDisposable()
        assertFalse(disposable.isDisposed())
    }
}