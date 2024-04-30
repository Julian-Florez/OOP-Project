public class Main {
    public static void main(String[] args) {
        // Create instances of Rectangle and Square
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(3, 6);
        Square square1 = new Square(4);

        // Test compareTo method
        System.out.println("Comparing rect1 and rect2: " + rect1.compareTo(rect2)); // Expected output: Comparison based on area
        System.out.println("Comparing rect1 and square1: " + rect1.compareTo(square1)); // Expected output: Comparison based on area

        // Test clone method
        Quadrilateral clonedRect = rect1.clone();
        System.out.println("Original rectangle: " + rect1);
        System.out.println("Cloned rectangle: " + clonedRect);
        System.out.println("Are original and clone the same object? " + (rect1 == clonedRect)); // Expected output: false
        System.out.println("Do original and clone have the same properties? " + rect1.equals(clonedRect)); // Expected output: true
    }
}

// Concrete subclass for Rectangle
class Rectangle extends Quadrilateral {
    public Rectangle(double side1, double side2) {
        super(side1, side2, side1, side2, 90.0, 90.0, 90.0, 90.0, Math.sqrt(side1 * side1 + side2 * side2), Math.sqrt(side1 * side1 + side2 * side2));
    }

    @Override
    public double calculateArea() {
        return side1 * side2; // Area = length * width
    }

    @Override
    public int compareTo(Quadrilateral other) {
        return Double.compare(this.calculateArea(), other.calculateArea());
    }
}

// Concrete subclass for Square
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public Quadrilateral clone() {
        return new Square(side1);
    }
}

abstract class Quadrilateral implements Comparable<Quadrilateral> {
    protected double side1;
    protected double side2;
    
    public abstract double calculateArea(); // Added calculateArea() method
    
    // ... rest of the code
    
    @Override
    public int compareTo(Quadrilateral other) {
        return Double.compare(this.calculateArea(), other.calculateArea());
    }

    @Override
    public Quadrilateral clone() {
        return new Rectangle(side1, side2);
    }
}
