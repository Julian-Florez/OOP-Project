package shapes.quadrilaterals;

public class Trapezium extends Quadrilateral{
    
    private double height;

    public Trapezium(double side1, double side2, double side3, double side4, double height) {
        super(side1, side2, side3, side4);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((side1 + side2) * height) / 2;
    }
}
