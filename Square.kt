class Square(_name: String) : Shape(_name) {

    var length = 0.0
    var height = 0.0

    override fun printDimensions(dimensions: Dimensionable) {
        println("Shape is: $name, with dimensions: length: $length and height: $height")
    }

    fun setDimensions(length: Double, height: Double) {
        this.height = height
        this.length = length
    }

    override fun getArea() : Double
    {

        val area = length * height

        return area
    }

}