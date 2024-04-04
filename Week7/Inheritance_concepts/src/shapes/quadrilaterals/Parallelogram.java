package shapes.quadrilaterals;

public class Parallelogram extends Quadrilateral{
    
    private double base;
    private double height;

    public Parallelogram(double side1, double side2, double base, double height) {
        super(side1, side2, side1, side2);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }
}
