class EquilateralTriangle(_name: String) : Triangle(_name) {

    override var side1 = 0.0
    override var side2 = 0.0
    override var side3 = 0.0

    override fun printDimensions(dimensions: Dimensionable) {
        println("Shape is: $name, with all sides measuring: $side1")
    }

    fun setDimensions(side1: Double)
    {
        super.setDimensions(side1, side1, side1)
    }

}