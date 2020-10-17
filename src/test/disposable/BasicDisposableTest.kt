import disposable.BasicDisposable

class BasicDisposableTest: DisposableTest<BasicDisposable> {
    override fun createDisposable(): BasicDisposable {
        return BasicDisposable()
    }
}