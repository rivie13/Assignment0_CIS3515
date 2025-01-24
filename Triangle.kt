open class Triangle(_name: String) : Shape(_name) {

    open var side1 = 0.0
    open var side2 = 0.0
    open var side3 = 0.0

    override fun printDimensions(dimensions: Dimensionable) {
        println("Shape is: $name, with dimensions: side1: $side1, side2: $side2, side3: $side3")
    }

    fun setDimensions(side1: Double, side2: Double, side3: Double){
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }

    override fun getArea(): Double {
        val area = kotlin.math.sqrt(getPerimeter() * (getPerimeter() - side1) * (getPerimeter() - side2) * (getPerimeter() - side3) * (getPerimeter() - side3))
        return area
    }

    private fun getPerimeter(): Double {
        val perimeter = side1 + side2 + side3
        return perimeter
    }

}