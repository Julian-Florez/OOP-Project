public abstract class Quadrilateral implements IShape{
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

    public void scale(double scaleFactor) {
        side1 *= scaleFactor;
        side2 *= scaleFactor;
        side3 *= scaleFactor;
        side4 *= scaleFactor;
        diagonal1 *= scaleFactor;
        diagonal2 *= scaleFactor;
    }
    
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide4() {
        return side4;
    }

    public void setSide4(double side4) {
        this.side4 = side4;
    }

    public double getAngle1() {
        return angle1;
    }

    public void setAngle1(double angle1) {
        this.angle1 = angle1;
    }

    public double getAngle2() {
        return angle2;
    }

    public void setAngle2(double angle2) {
        this.angle2 = angle2;
    }

    public double getAngle3() {
        return angle3;
    }

    public void setAngle3(double angle3) {
        this.angle3 = angle3;
    }

    public double getAngle4() {
        return angle4;
    }

    public void setAngle4(double angle4) {
        this.angle4 = angle4;
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }
}
