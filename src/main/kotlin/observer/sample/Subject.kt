package observer.sample

class Subject: ISubject<Int?> {

    private val observerList = arrayListOf<IObserver<Int?>>()
    var flag: Int? = null
    set(value) {
        field = value
        notifyObservers(value)
    }

    override fun notifyObservers(value: Int?) {
        observerList.forEach {
            it.update(value)
        }
    }

    override fun register(vararg observer: IObserver<Int?>) {
        observerList.addAll(observer)
    }

    override fun unregister(vararg observer: IObserver<Int?>) {
        observerList.removeAll(observer)
    }
}