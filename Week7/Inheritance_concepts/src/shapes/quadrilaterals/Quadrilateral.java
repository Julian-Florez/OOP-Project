package shapes.quadrilaterals;

public abstract class Quadrilateral {
    protected double side1;
    protected double side2;
    protected double side3;
    protected double side4;

    public Quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3 + side4;
    }

    public abstract double calculateArea();
}
