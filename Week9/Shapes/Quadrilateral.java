/**
 * The Quadrilateral class represents a quadrilateral shape.
 * It implements the IShape interface and provides common methods and properties for quadrilaterals.
 */
public abstract class Quadrilateral implements IShape, Cloneable, Comparable<Quadrilateral> {
    protected double side1;
    protected double side2;
    protected double side3;
    protected double side4;
    protected double angle1;
    protected double angle2;
    protected double angle3;
    protected double angle4;
    protected double diagonal1;
    protected double diagonal2;

    /**
     * Constructs a Quadrilateral object with the specified sides, angles, and diagonals.
     *
     * @param side1     the length of side 1
     * @param side2     the length of side 2
     * @param side3     the length of side 3
     * @param side4     the length of side 4
     * @param angle1    the measure of angle 1
     * @param angle2    the measure of angle 2
     * @param angle3    the measure of angle 3
     * @param angle4    the measure of angle 4
     * @param diagonal1 the length of diagonal 1
     * @param diagonal2 the length of diagonal 2
     */
    public Quadrilateral(double side1, double side2, double side3, double side4, double angle1, double angle2, double angle3, double angle4, double diagonal1, double diagonal2) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = angle3;
        this.angle4 = angle4;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    /**
     * Calculates the perimeter of the quadrilateral.
     *
     * @return the perimeter of the quadrilateral
     */
    public double calculatePerimeter() {
        return side1 + side2 + side3 + side4;
    }

    /**
     * Calculates the area of the quadrilateral.
     * This method needs to be implemented by concrete subclasses.
     *
     * @return the area of the quadrilateral
     */
    public abstract double calculateArea();

    /**
     * Scales the quadrilateral by the specified factor.
     *
     * @param scaleFactor the factor by which to scale the quadrilateral
     */
    public void scale(double scaleFactor) {
        side1 *= scaleFactor;
        side2 *= scaleFactor;
        side3 *= scaleFactor;
        side4 *= scaleFactor;
        diagonal1 *= scaleFactor;
        diagonal2 *= scaleFactor;
    }

    // Getters and setters for the properties

    // ...

    /**
     * Returns a string representation of the quadrilateral.
     *
     * @return a string representation of the quadrilateral
     */
    public String toString() {
        return "Quadrilateral: Side1: " + side1 + ", Side2: " + side2 + ", Side3: " + side3 + ", Side4: " + side4 + ", Angle1: " + angle1 + ", Angle2: " + angle2 + ", Angle3: " + angle3 + ", Angle4: " + angle4 + ", Diagonal1: " + diagonal1 + ", Diagonal2: " + diagonal2;
    }

    /**
     * Creates and returns a copy of this quadrilateral.
     *
     * @return a copy of this quadrilateral
     */
    @Override
    public abstract Quadrilateral clone();

    /**
     * Compares this quadrilateral with the specified quadrilateral for order.
     *
     * @param o the quadrilateral to be compared
     * @return a negative integer, zero, or a positive integer as this quadrilateral is less than, equal to, or greater than the specified quadrilateral
     */
    @Override
    public int compareTo(Quadrilateral o) {
        if (this.calculateArea() > o.calculateArea()) {
            return 1;
        } else if (this.calculateArea() < o.calculateArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
