/**
 * Represents a square shape.
 * A square is a special type of rectangle where all sides are equal.
 */
public class Square extends Rectangle {

    /**
     * Constructs a square with the specified side length.
     *
     * @param side1 the length of the side of the square
     */
    public Square(double side1) {
        super(side1, side1);
    }

    /**
     * Calculates the area of the square.
     *
     * @return the area of the square
     */
    @Override
    public double calculateArea() {
        return side1 * side1;
    }

    /**
     * Creates a copy of the square.
     *
     * @return a new square with the same side length
     */
    @Override
    public Square clone() {
        return new Square(side1);
    }
}