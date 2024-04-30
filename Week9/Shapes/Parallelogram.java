/**
 * The Parallelogram class represents a parallelogram shape.
 * It extends the Quadrilateral class and inherits its properties and methods.
 */
public class Parallelogram extends Quadrilateral {

    /**
     * Constructs a Parallelogram object with the specified side lengths, angles, and diagonals.
     *
     * @param side1     the length of side 1
     * @param side2     the length of side 2
     * @param angle1    the measure of angle 1
     * @param angle2    the measure of angle 2
     * @param diagonal1 the length of diagonal 1
     * @param diagonal2 the length of diagonal 2
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
     * Creates and returns a copy of this Parallelogram object.
     *
     * @return a clone of this Parallelogram object
     */
    @Override
    public Parallelogram clone() {
        return new Parallelogram(side1, side2, angle1, angle2, diagonal1, diagonal2);
    }
}
