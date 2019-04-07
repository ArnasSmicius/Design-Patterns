package observer.sample

interface ISubject<T> {
    fun notifyObservers(value: T)
    fun register(vararg observer: IObserver<T>)
    fun unregister(vararg observer: IObserver<T>)
}