public class Equilateral extends Triangle{
    public Equilateral(double side) { 
        super(side, side, side, 60.0,60.0,60.0);
        
    }

    public double calculateArea() {
        return (Math.sqrt(3)/4) * side1 * side1;
    }

    public Equilateral clone() {
        return new Equilateral(side1);
    }

}
