package disposable

import reactor.core.Disposable

class CompositeDisposable : Disposable.Composite {
    private val disposables = mutableListOf<Disposable>()
    private var disposed = false

    override fun isDisposed(): Boolean {
        return disposed
    }

    override fun add(d: Disposable): Boolean {
        return disposables.add(d)
    }

    override fun remove(d: Disposable): Boolean {
        TODO("Not yet implemented")
    }

    override fun size(): Int {
        return 1
    }

    override fun dispose() {
        disposed = true
        disposables.map { disposable ->
            disposable.dispose()
        }
    }

}
