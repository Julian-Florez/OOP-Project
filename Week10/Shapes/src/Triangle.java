/**
 * The Triangle class represents a triangle shape.
 * It implements the IShape interface and provides methods to calculate the area, perimeter, and scale the triangle.
 * It also provides methods to get and set the side lengths and angles of the triangle.
 * The Triangle class is abstract and cannot be instantiated directly.
 * Subclasses of Triangle must implement the calculateArea and clone methods.
 */
public abstract class Triangle implements IShape, Cloneable, Comparable<Triangle> {
    protected double side1;
    protected double side2;
    protected double side3;
    protected double angle1;
    protected double angle2;
    protected double angle3;

    /**
     * Constructs a Triangle object with the specified side lengths and angles.
     *
     * @param side1   the length of side 1
     * @param side2   the length of side 2
     * @param side3   the length of side 3
     * @param angle1  the measure of angle 1 in degrees
     * @param angle2  the measure of angle 2 in degrees
     * @param angle3  the measure of angle 3 in degrees
     */
    Triangle(double side1, double side2, double side3, double angle1, double angle2, double angle3) throws InvalidTriangleException {
        if (!isValidTriangle(side1, side2, side3)) {
            throw new InvalidTriangleException("Invalid triangle");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = angle3;
    }
    
    /**
     * Checks if the given side lengths form a valid triangle.
     *
     * @param side1 the length of side 1
     * @param side2 the length of side 2
     * @param side3 the length of side 3
     * @return true if the side lengths form a valid triangle, false otherwise
     */
    public boolean isValidTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2;
    }

    /**
     * Gets the length of side 1.
     *
     * @return the length of side 1
     */
    public double getSide1() {
        return side1;
    }

    /**
     * Gets the length of side 2.
     *
     * @return the length of side 2
     */
    public double getSide2() {
        return side2;
    }

    /**
     * Gets the length of side 3.
     *
     * @return the length of side 3
     */
    public double getSide3() {
        return side3;
    }

    /**
     * Gets the measure of angle 1 in degrees.
     *
     * @return the measure of angle 1 in degrees
     */
    public double getAngle1() {
        return angle1;
    }

    /**
     * Gets the measure of angle 2 in degrees.
     *
     * @return the measure of angle 2 in degrees
     */
    public double getAngle2() {
        return angle2;
    }

    /**
     * Gets the measure of angle 3 in degrees.
     *
     * @return the measure of angle 3 in degrees
     */
    public double getAngle3() {
        return angle3;
    }

    /**
     * Sets the length of side 1.
     *
     * @param side1 the length of side 1
     */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /**
     * Sets the length of side 2.
     *
     * @param side2 the length of side 2
     */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /**
     * Sets the length of side 3.
     *
     * @param side3 the length of side 3
     */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    /**
     * Sets the measure of angle 1 in degrees.
     *
     * @param angle1 the measure of angle 1 in degrees
     */
    public void setAngle1(double angle1) {
        this.angle1 = angle1;
    }

    /**
     * Sets the measure of angle 2 in degrees.
     *
     * @param angle2 the measure of angle 2 in degrees
     */
    public void setAngle2(double angle2) {
        this.angle2 = angle2;
    }

    /**
     * Sets the measure of angle 3 in degrees.
     *
     * @param angle3 the measure of angle 3 in degrees
     */
    public void setAngle3(double angle3) {
        this.angle3 = angle3;
    }

    /**
     * Calculates the area of the triangle.
     * Subclasses must implement this method.
     *
     * @return the area of the triangle
     */
    public abstract double calculateArea();

    /**
     * Calculates the perimeter of the triangle.
     *
     * @return the perimeter of the triangle
     */
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    /**
     * Scales the triangle by the specified factor.
     *
     * @param scaleFactor the scaling factor
     */
    public void scale(double scaleFactor) {
        side1 = side1 * scaleFactor;
        side2 = side2 * scaleFactor;
        side3 = side3 * scaleFactor;
    }

    /**
     * Returns a string representation of the triangle.
     *
     * @return a string representation of the triangle
     */
    public String toString() {
        return "Triangle: Side1: " + side1 + " Side2: " + side2 + " Side3: " + side3 + " Angle1: " + angle1 + " Angle2: " + angle2 + " Angle3: " + angle3;
    }

    /**
     * Creates and returns a copy of this triangle.
     * Subclasses must implement this method.
     *
     * @return a copy of this triangle
     */
    public abstract Triangle clone();

    /**
     * Compares this triangle with the specified triangle for order.
     * Returns a negative integer, zero, or a positive integer as this triangle is less than, equal to, or greater than the specified triangle.
     *
     * @param t the triangle to be compared
     * @return a negative integer, zero, or a positive integer as this triangle is less than, equal to, or greater than the specified triangle
     */
    public int compareTo(Triangle t) {
        if (this.calculateArea() > t.calculateArea()) {
            return 1;
        } else if (this.calculateArea() < t.calculateArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
