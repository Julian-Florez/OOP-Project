/**
 * Represents a parallelogram, a quadrilateral with opposite sides that are parallel and equal in length.
 * Inherits properties and methods from the Quadrilateral class.
 */
public class Parallelogram extends Quadrilateral {

    /**
     * Constructs a Parallelogram object with the specified side lengths, angles, and diagonals.
     *
     * @param side1 the length of the first side
     * @param side2 the length of the second side
     * @param angle1 the measure of the first angle in degrees
     * @param angle2 the measure of the second angle in degrees
     * @param diagonal1 the length of the first diagonal
     * @param diagonal2 the length of the second diagonal
     */
    public Parallelogram(double side1, double side2, double angle1, double angle2, double diagonal1, double diagonal2) {
        super(side1, side2, side1, side2, angle1, angle2, angle1, angle2, diagonal1, diagonal2);
    }

    /**
     * Calculates the area of the parallelogram.
     *
     * @return the area of the parallelogram
     */
    @Override
    public double calculateArea() {
        double base = side1; // Assuming side1 is the base
        double height = Math.abs(diagonal2 * Math.sin(angle1)); // Assuming diagonal2 is the height
        return base * height;
    }
    
    /**
     * Creates a deep copy of the parallelogram object.
     *
     * @return a new Parallelogram object with the same property values as the original
     */
    @Override
    public Parallelogram clone() {
        return new Parallelogram(side1, side2, angle1, angle2, diagonal1, diagonal2);
    }
    
}
