# Disposable-project-reactor-learning-test
Explore the Disposable interface in Project Reactor (src:https://github.com/reactor/reactor-core/blob/master/reactor-core/src/main/java/reactor/core/Disposable.java)

# Notes

### Disposable is a functional interface with a dispose function.
##### https://projectreactor.io/docs/core/snapshot/api/reactor/core/Disposable.html

More on Disposable
https://projectreactor.io/docs/core/snapshot/api/reactor/core/Disposable.html

- Composite Disposable: A disposable container that holds a bunch of disposables. Disposing the container would dispose all the diposable it contains.

- Swap Disposable: A disposable container that holds the next disposable to be disposed

Disposable Factory: https://projectreactor.io/docs/core/snapshot/api/reactor/core/Disposables.html
