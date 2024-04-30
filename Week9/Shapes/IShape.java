/**
 * The IShape interface represents a geometric shape.
 * It provides methods to calculate the area and perimeter of the shape,
 * as well as to scale the shape by a given factor.
 */
public interface IShape {
    /**
     * Calculates the area of the shape.
     *
     * @return the area of the shape.
     */
    double calculateArea();

    /**
     * Calculates the perimeter of the shape.
     *
     * @return the perimeter of the shape.
     */
    double calculatePerimeter();

    /**
     * Scales the shape by the given factor.
     *
     * @param scaleFactor the factor by which to scale the shape.
     */
    void scale(double scaleFactor);
}
