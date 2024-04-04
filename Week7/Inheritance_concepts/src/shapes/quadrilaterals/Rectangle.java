package shapes.quadrilaterals;

public class Rectangle extends Parallelogram{
    
    public Rectangle(double side1, double side2) {
        super(side1, side2, side1, side2);
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }
}
