class CarBmw(override val brandName: String) :Car {
    override fun brand() {
        println("The brand in this case is $brandName")
    }
}