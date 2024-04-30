/**
 * Represents an isosceles trapezium, a quadrilateral with two parallel sides of equal length.
 * Inherits properties and methods from the Trapezium class.
 */
public class IsoscelesTrapezium extends Trapezium {

    /**
     * Constructs a new IsoscelesTrapezium object with the specified dimensions.
     *
     * @param side1     The length of the first side of the trapezium.
     * @param side2     The length of the second side of the trapezium.
     * @param side3     The length of the third side of the trapezium.
     * @param angle1    The measure of the first angle of the trapezium.
     * @param angle2    The measure of the second angle of the trapezium.
     * @param diagonal1 The length of the first diagonal of the trapezium.
     */
    public IsoscelesTrapezium(double side1, double side2, double side3, double angle1, double angle2, double diagonal1) {
        super(side1, side2, side3, side1, angle1, angle2, angle1, angle2, diagonal1, diagonal1);
        rads = Math.toRadians(angle1);
        height = Math.sin(rads) * side1;
    }

    /**
     * Calculates the area of the isosceles trapezium.
     *
     * @return The area of the isosceles trapezium.
     */
    @Override
    public double calculateArea() {
        return (side1 + side2) * height / 2;
    }

    /**
     * Creates a deep copy of the isosceles trapezium object.
     *
     * @return A new IsoscelesTrapezium object with the same dimensions as the original.
     */
    public IsoscelesTrapezium clone() {
        return new IsoscelesTrapezium(side1, side2, side3, angle1, angle2, diagonal1);
    }
}