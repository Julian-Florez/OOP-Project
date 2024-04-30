import java.lang.Cloneable;
import java.lang.Comparable;
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

    // Constructor
    public Quadrilateral(double side1, double side2, double side3, double side4,
                         double angle1, double angle2, double angle3, double angle4,
                         double diagonal1, double diagonal2) {
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

    // Calculate perimeter
    public double calculatePerimeter() {
        return side1 + side2 + side3 + side4;
    }

    // Calculate area (to be implemented by subclasses)
    @Override
    public abstract double calculateArea();

    // Scale the quadrilateral by a given factor
    public void scale(double scaleFactor) {
        // Scaling sides and diagonals by the factor
        side1 *= scaleFactor;
        side2 *= scaleFactor;
        side3 *= scaleFactor;
        side4 *= scaleFactor;
        diagonal1 *= scaleFactor;
        diagonal2 *= scaleFactor;
        
        // Note: Scaling may affect angles as well.
        // If you want to maintain specific angles, you may need to adjust them.
    }

    // Getter and setter methods for properties
    // Getter and setter methods for the sides, angles, and diagonals
    // These methods are optional, but provide flexibility in handling properties.

    public double getSide1() { return side1; }
    public void setSide1(double side1) { this.side1 = side1; }

    public double getSide2() { return side2; }
    public void setSide2(double side2) { this.side2 = side2; }

    public double getSide3() { return side3; }
    public void setSide3(double side3) { this.side3 = side3; }

    public double getSide4() { return side4; }
    public void setSide4(double side4) { this.side4 = side4; }

    public double getAngle1() { return angle1; }
    public void setAngle1(double angle1) { this.angle1 = angle1; }

    public double getAngle2() { return angle2; }
    public void setAngle2(double angle2) { this.angle2 = angle2; }

    public double getAngle3() { return angle3; }
    public void setAngle3(double angle3) { this.angle3 = angle3; }

    public double getAngle4() { return angle4; }
    public void setAngle4(double angle4) { this.angle4 = angle4; }

    public double getDiagonal1() { return diagonal1; }
    public void setDiagonal1(double diagonal1) { this.diagonal1 = diagonal1; }

    public double getDiagonal2() { return diagonal2; }
    public void setDiagonal2(double diagonal2) { this.diagonal2 = diagonal2; }

    // toString method for debugging and logging purposes
    @Override
    public String toString() {
        return "Quadrilateral: Side1: " + side1 + ", Side2: " + side2 + ", Side3: " + side3 + ", Side4: " + side4 +
               ", Angle1: " + angle1 + ", Angle2: " + angle2 + ", Angle3: " + angle3 + ", Angle4: " + angle4 +
               ", Diagonal1: " + diagonal1 + ", Diagonal2: " + diagonal2;
    }

    // Clone method implementation
    @Override
    public Quadrilateral clone() {
        try {
            // Shallow copy
            Quadrilateral cloned = (Quadrilateral) super.clone();
            // If you have any mutable objects in the class, you should deep copy them here
            return cloned;
        } catch (CloneNotSupportedException e) {
            // This exception should not happen since we implement Cloneable
            throw new AssertionError("Cloning not supported for Quadrilateral", e);
        }
    }

    // Implementing the Comparable interface
    @Override
    public int compareTo(Quadrilateral other) {
        // Comparison based on area (you can choose a different comparison criterion)
        double thisArea = this.calculateArea();
        double otherArea = other.calculateArea();

        // Return comparison result
        if (thisArea < otherArea) {
            return -1; // This quadrilateral is smaller in area
        } else if (thisArea > otherArea) {
            return 1; // This quadrilateral is larger in area
        } else {
            return 0; // Both quadrilaterals have equal area
        }
    }
}
