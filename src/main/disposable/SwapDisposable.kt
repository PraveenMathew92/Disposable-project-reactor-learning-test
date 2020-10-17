package disposable

import reactor.core.Disposable

class SwapDisposable: Disposable.Swap {
    companion object {
        val DEFAULT_DISPOSABLE = BasicDisposable()
    }
    private var disposable: Disposable? = null

    override fun update(next: Disposable?): Boolean {
        disposable?.dispose()
        disposable = next
        return true
    }

    override fun replace(next: Disposable?): Boolean {
        disposable = next
        return true
    }

    override fun get(): Disposable {
        return disposable?: DEFAULT_DISPOSABLE
    }

    override fun dispose() {
        TODO("Not yet implemented")
    }

}
