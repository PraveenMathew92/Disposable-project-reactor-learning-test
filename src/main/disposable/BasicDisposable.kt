package disposable

import reactor.core.Disposable

class BasicDisposable : Disposable {
    private var disposed = false

    override fun dispose() {
        disposed = true
    }

    override fun isDisposed(): Boolean {
        return disposed
    }
}
