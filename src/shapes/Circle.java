package shapes;

public class Circle {

// This class should have a private radius property
// that is set through the constructor, and various methods
// for getting information about the circle
    private double radius;
    private static int circleCount;

//  Method
    public Circle(double radius){
        this.radius = radius;
        Circle.circleCount++;
    }

//  Method
    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }

//  Method
    public double getCircumference(){
        double circumference = 2 * Math.PI * this.radius;
        return circumference;
    }

    public static int getCircleCount() {
        return Circle.circleCount;
    }


}
