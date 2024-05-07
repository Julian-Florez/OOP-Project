/**
 * The Scalene class represents a scalene triangle, which is a type of triangle
 * with three unequal sides and three unequal angles.
 * It extends the Triangle class and inherits its properties and methods.
 */
public class Scalene extends Triangle {

    /**
     * Constructs a new Scalene object with the specified side lengths and angles.
     *
     * @param side1   the length of the first side
     * @param side2   the length of the second side
     * @param side3   the length of the third side
     * @param angle1  the measure of the first angle in degrees
     * @param angle2  the measure of the second angle in degrees
     * @param angle3  the measure of the third angle in degrees
     */
    public Scalene(double side1, double side2, double side3, double angle1, double angle2, double angle3) throws InvalidTriangleException{
        super(side1, side2, side3, angle1, angle2, angle3);
    }

    /**
     * Calculates and returns the area of the scalene triangle using Heron's formula.
     *
     * @return the area of the scalene triangle
     */
    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * Creates and returns a new Scalene object that is a copy of the current object.
     *
     * @return a new Scalene object that is a copy of this object
     */
    public Scalene clone() {
        try {
            return new Scalene(side1, side2, side3, angle1, angle2, angle3);
        } catch (InvalidTriangleException e) {
            return null;
        }
    }
}
