/**
 * The `Irregular` class represents an irregular quadrilateral shape.
 * It extends the `Quadrilateral` class and provides methods to calculate the area and clone the object.
 */
public class Irregular extends Quadrilateral {

    /**
     * Constructs a new `Irregular` object with the specified side lengths, angles, and diagonals.
     *
     * @param side1     the length of the first side
     * @param side2     the length of the second side
     * @param side3     the length of the third side
     * @param side4     the length of the fourth side
     * @param angle1    the measure of the first angle in degrees
     * @param angle2    the measure of the second angle in degrees
     * @param angle3    the measure of the third angle in degrees
     * @param angle4    the measure of the fourth angle in degrees
     * @param diagonal1 the length of the first diagonal
     * @param diagonal2 the length of the second diagonal
     */
    public Irregular(double side1, double side2, double side3, double side4, double angle1, double angle2, double angle3, double angle4, double diagonal1, double diagonal2) {
        super(side1, side2, side3, side4, angle1, angle2, angle3, angle4, diagonal1, diagonal2);
    }

    /**
     * Calculates the area of the irregular quadrilateral using Brahmagupta's formula.
     *
     * @return the area of the irregular quadrilateral
     */
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3 + side4) / 2; // Calculate the semi-perimeter
        double area = Math.sqrt((s - side1) * (s - side2) * (s - side3) * (s - side4)); // Apply Brahmagupta's formula
        return area;
    }

    /**
     * Creates and returns a new `Irregular` object that is a copy of the current object.
     *
     * @return a new `Irregular` object that is a copy of the current object
     */
    public Irregular clone() {
        return new Irregular(side1, side2, side3, side4, angle1, angle2, angle3, angle4, diagonal1, diagonal2);
    }

}