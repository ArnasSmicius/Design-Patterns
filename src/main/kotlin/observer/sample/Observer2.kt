package observer.sample

class Observer2 : IObserver<Int?> {

    override fun update(value: Int?) {
        println("${javaClass.simpleName}: value changed to $value")
    }

}