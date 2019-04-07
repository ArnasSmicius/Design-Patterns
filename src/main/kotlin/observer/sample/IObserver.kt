package observer.sample

interface IObserver<T> {
    fun update(value: T)
}