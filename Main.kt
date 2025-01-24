fun main() {
    val square = Square("square")
    val circle = Circle("circle")
    val triangle = Triangle("triangle")
    val eqTriangle = EquilateralTriangle("eqTriangle")

    println("Please enter in height and length for square:")
    square.setDimensions(readln().toDouble(), readln().toDouble())

    println("Please enter in a radius for circle: ")
    circle.setDimensions(readln().toDouble())

    println("Please enter in 3 sides for a triangle: ")
    triangle.setDimensions(readln().toDouble(), readln().toDouble(), readln().toDouble())

    println("Please enter in 1 side for an equilateral triangle: ")
    eqTriangle.setDimensions(readln().toDouble())

    val shapeArray = arrayOf(square, circle, triangle, eqTriangle)

    for (shape in shapeArray) {
        shape.printDimensions(shape)
        println("The area of ${shape.name} is ${shape.getArea()}\n")
    }

}