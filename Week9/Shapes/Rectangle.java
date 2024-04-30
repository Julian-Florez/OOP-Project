/**
 * Represents a rectangle shape.
 * 
 * A rectangle is a quadrilateral with four right angles.
 * It is a subclass of the Parallelogram class.
 */
public class Rectangle extends Parallelogram {

    /**
     * Constructs a new Rectangle object with the specified side lengths.
     * 
     * @param side1 the length of the first side of the rectangle
     * @param side2 the length of the second side of the rectangle
     */
    public Rectangle(double side1, double side2) {
        super(side1, side2, 90, 90, 0, 0);
        this.diagonal1 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        this.diagonal2 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    /**
     * Calculates the area of the rectangle.
     * 
     * @return the area of the rectangle
     */
    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    /**
     * Creates a copy of the rectangle.
     * 
     * @return a new Rectangle object with the same side lengths as the original rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(side1, side2);
    }
}
