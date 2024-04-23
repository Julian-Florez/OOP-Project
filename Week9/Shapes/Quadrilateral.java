public abstract class Quadrilateral {
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

    public double calculatePerimeter() {
        return side1 + side2 + side3 + side4;
    }

    public abstract double calculateArea();
}
