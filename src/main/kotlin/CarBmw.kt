class CarBmw(override val brandName: String) :Car {
    override fun Brand() {
        println("The brand in this case is $brandName")
    }
}