class Circle(_name: String) : Shape(_name) {

    var radius = 0.0

    override fun printDimensions(dimensions: Dimensionable) {
        TODO("Not yet implemented")
    }

    fun setDimensions(radius: Double) {
        TODO("Not yet implemented")
        this.radius = radius
    }

    override fun getArea(): Double {
        val area = kotlin.math.PI * radius

        return area
    }
}