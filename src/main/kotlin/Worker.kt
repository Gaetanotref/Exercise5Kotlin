open class Worker(open val hour:Int) {
    open fun workerhours(){
        println("The person is working ${hour}")
    }
}