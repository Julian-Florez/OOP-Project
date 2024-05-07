/**
 * Represents an isosceles triangle, a type of triangle with two equal sides.
 * Extends the Triangle class.
 */
public class Isosceles extends Triangle {
    private double base;

    /**
     * Constructs a new Isosceles object with the specified side lengths, base length, and angles.
     * 
     * @param side1 the length of the first side
     * @param side2 the length of the second side
     * @param base the length of the base
     * @param angle1 the measure of the first angle
     * @param angle2 the measure of the second angle
     * @param angle3 the measure of the third angle
     */
    public Isosceles(double side1, double side2, double base, double angle1, double angle2, double angle3) throws InvalidTriangleException{
        super(side1, side2, side1, angle1, angle2, angle3);
        this.base = base;
    }

    /**
     * Calculates and returns the area of the isosceles triangle.
     * 
     * @return the area of the isosceles triangle
     */
    @Override
    public double calculateArea() {
        return 0.5 * base * Math.sqrt(side1 * side1 - 0.25 * base * base);
    }
    
    /**
     * Creates and returns a deep copy of the Isosceles object.
     * 
     * @return a deep copy of the Isosceles object
     */
    public Isosceles clone() {
        try {
            return new Isosceles(side1, side2, base, angle1, angle2, angle3);
        } catch (InvalidTriangleException e) {
            return null;
        }
    }
}
