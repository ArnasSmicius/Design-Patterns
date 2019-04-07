package observer.sample

fun main() {
    println("***Observer Pattern Demo***\n")

    val subject = Subject()
    val observer1 = Observer1()
    val observer2 = Observer2()

    subject.register(observer1, observer2)

    println("Setting value to 5")
    subject.flag = 5
    println("Setting value to 25")
    subject.flag = 25

    println("Unregistering observer1")
    subject.unregister(observer1)
    println("Setting value to 100")
    subject.flag = 100
}