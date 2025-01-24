class EquilateralTriangle(_name: String) : Triangle(_name) {

    override fun printDimensions(dimensions: Dimensionable) {
        TODO("Not yet implemented")
    }

    fun setDimensions(side1: Double)
    {
        super.setDimensions(side1, side1, side1)
    }

}