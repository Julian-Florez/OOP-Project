public class Main {
    /**
     * The main method is the entry point of the program.
     * It creates instances of various shape objects, calculates their areas,
     * and performs some operations on them.
     *
     * @param args The command-line arguments passed to the program.
     */
    public static void main(String[] args) {


        try{

            Square square = new Square(5);
            Square square1 = new Square(2);

            Deltoid deltoid = new Deltoid(3, 4, 60, 120, 5, 6);
            Deltoid deltoid1 = new Deltoid(3, 4, 60, 120, 5, 6);

            Equilateral equilateral = new Equilateral(2);
            Equilateral equilateral1 = new Equilateral(8);

            Irregular irregular = new Irregular(3, 4, 5,2,20,60,70, 80, 90, 100);
            Isosceles isosceles = new Isosceles(3, 4, 5, 60, 60, 60);
            IsoscelesTrapezium isoscelesTrapezium = new IsoscelesTrapezium(3, 4, 5, 60, 30, 6);
            Parallelogram parallelogram = new Parallelogram(3, 4, 60, 120, 5,6);
            Rectangle rectangle = new Rectangle(3, 4);
            Rhombus rhombus = new Rhombus(3, 60, 30, 6, 5);
            Scalene scalene = new Scalene(3, 4, 5, 60, 70, 50);
            Trapezium trapezium = new Trapezium(3, 4, 5, 6, 60, 60, 120, 120, 7, 8);

            System.out.println("Square Area: " + square.calculateArea());
            System.out.println("Deltoid Area: " + deltoid.calculateArea());
            System.out.println("Equilateral Area: " + equilateral.calculateArea());
            System.out.println("Irregular Area: " + irregular.calculateArea());
            System.out.println("Isosceles Area: " + isosceles.calculateArea());
            System.out.println("IsoscelesTrapezium Area: " + isoscelesTrapezium.calculateArea());
            System.out.println("Parallelogram Area: " + parallelogram.calculateArea());
            System.out.println("Rectangle Area: " + rectangle.calculateArea());
            System.out.println("Rhombus Area: " + rhombus.calculateArea());
            System.out.println("Scalene Area: " + scalene.calculateArea());
            System.out.println("Trapezium Area: " + trapezium.calculateArea());

            System.out.println(square);
            System.out.println(deltoid);
            System.out.println(equilateral);
            System.out.println(irregular);
            System.out.println(isosceles);
            System.out.println(isoscelesTrapezium);
            System.out.println(parallelogram);
            System.out.println(rectangle);
            System.out.println(rhombus);
            System.out.println(scalene);
            System.out.println(trapezium);
            
            Square square2 = square.clone();

            System.out.println(square.clone().equals(square));

            System.out.println(square2);  
            
            square.scale(2);

            System.out.println(square);

            System.out.println(square2);

            System.out.println(square.equals(square2));

            System.out.println(square.compareTo(square1));

            System.out.println(deltoid.compareTo(deltoid1));

            System.out.println(equilateral.compareTo(equilateral1));
        
        } catch (InvalidTriangleException e) {
            System.out.println(e.getMessage());
        } catch (InvalidQuadrilateralException e) {
            System.out.println(e.getMessage());
        }  
    }
}
