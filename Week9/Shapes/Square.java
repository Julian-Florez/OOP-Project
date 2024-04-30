/**
 * The Square class represents a square shape.
 * It is a subclass of the Rectangle class.
 */
public class Square extends Rectangle{

    /**
     * Constructs a Square object with the given side length.
     * @param side1 the length of the side of the square
     */
    public Square(double side1) {
        super(side1, side1);
    }

    /**
     * Calculates the area of the square.
     * @return the area of the square
     */
    @Override
    public double calculateArea() {
        return side1 * side1;
    }

    /**
     * Creates a copy of the square.
     * @return a new Square object with the same side length
     */
    @Override
    public Square clone() {
        return new Square(side1);
    }
}