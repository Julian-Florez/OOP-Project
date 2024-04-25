public abstract class Triangle implements IShape, Cloneable{
    protected double side1;
    protected double side2;
    protected double side3;
    protected double angle1;
    protected double angle2;
    protected double angle3;

    Triangle(double side1, double side2, double side3, double angle1, double angle2, double angle3) { 
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.angle1 = angle1;
        this.angle2 = angle2;
        this.angle3 = angle3;
    
    }
    public double getSide1() { 
        return side1;
    }
    public double getSide2() {
        return side2; 
    }
    public double getSide3() { 
        return side3; 
    }
    public double getAngle1() { 
        return angle1; 
    }
    public double getAngle2() { 
        return angle2; 
    }
    public double getAngle3() { 
        return angle3; 
    }
    public void setSide1(double side1) { 
        this.side1 = side1; 
    }
    public void setSide2(double side2) { 
        this.side2 = side2; 
    }
    public void setside3(double side3) { 
        this.side3 = side3; 
    }
    public void setAngle1(double angle1) { 
        this.angle1 = angle1; 
    }
    public void setAngle2(double angle2) { 
        this.angle2 = angle2; 
    }
    public void setAngle3(double angle3) { 
        this.angle3 = angle3; 
    }
    public abstract double calculateArea();

    public double calculatePerimeter() { 
        return side1+side2+side3; 
    }

    public void scale(double scaleFactor) { 
        side1 = side1*scaleFactor;
        side2 = side2*scaleFactor;
        side3 = side3*scaleFactor;
    }

    public String toString() { 
        return "Triangle: Side1: " + side1 + " Side2: " + side2 + " Side3: " + side3 + " Angle1: " + angle1 + " Angle2: " + angle2 + " Angle3: " + angle3;
    }

    public abstract Triangle clone();

}
