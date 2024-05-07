/**
 * The Equilateral class represents an equilateral triangle, which is a type of triangle
 * where all three sides are equal in length.
 */
public class Equilateral extends Triangle {

    /**
     * Constructs a new Equilateral object with the specified side length.
     *
     * @param side the length of each side of the equilateral triangle
     * @throws InvalidTriangleException 
     */
    public Equilateral(double side) throws InvalidTriangleException { 
        super(side, side, side, 60.0, 60.0, 60.0);
    }

    /**
     * Calculates the area of the equilateral triangle.
     *
     * @return the area of the equilateral triangle
     */
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * side1 * side1;
    }

    /**
     * Creates and returns a copy of this Equilateral object.
     *
     * @return a new Equilateral object with the same side length as this object
     */
    public Equilateral clone() {
        try {
            return new Equilateral(side1);
        } catch (InvalidTriangleException e) {
            return null;
        }
    }
}

