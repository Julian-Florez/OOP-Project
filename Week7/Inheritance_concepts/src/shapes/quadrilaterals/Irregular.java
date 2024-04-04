package shapes.quadrilaterals;

public class Irregular extends Quadrilateral {
    private double angle1;
    private double angle2;
    private double angle3;
    private double angle4;

    public Irregular(double side1, double side2, double side3, double side4, double angle1, double angle2, double angle3, double angle4) {
        super(side1, side2, side3, side4);
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = angle3;
        this.angle4 = angle4;
    }

    @Override
    public double calculateArea() {
        return 0;
    }


}