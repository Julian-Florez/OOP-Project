public class Isosceles extends Triangle{
    private double base;

    public Isosceles(double side1, double side2, double base, double angle1, double angle2, double angle3) {
        super(side1, side2, side1, angle1, angle2, angle3);
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * Math.sqrt(side1 * side1 - 0.25 * base * base);
    }
    
    


}
