class Circle(_name: String) : Shape(_name) {

    var radius = 0.0

    override fun printDimensions(dimensions: Dimensionable) {
        println("Shape is: $name, with a radius of $radius")
    }

    fun setDimensions(radius: Double) {
        this.radius = radius
    }

    override fun getArea(): Double {
        val area = kotlin.math.PI * radius

        return area
    }
}