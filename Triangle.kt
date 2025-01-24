open class Triangle(_name: String) : Shape(_name) {

    var side1 = 0.0
    var side2 = 0.0
    var side3 = 0.0

    override fun printDimensions(dimensions: Dimensionable) {
        TODO("Not yet implemented")
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

    fun getPerimeter(): Double {
        var perimeter = 0.0

        perimeter = side1 + side2 + side3
        return perimeter
    }

}