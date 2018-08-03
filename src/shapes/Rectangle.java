package shapes;

//Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.

public class Rectangle extends Quadrilateral implements Measurable {


//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//
//    public Rectangle(double l, double w) {
////   Calls the super class constructor (creates Quadrilateral -command click)
//        super(l, w);
//    }

    public Rectangle(double l, double w) {
        super(l, w);
    }

    @Override
    public double getPerimeter() {
        return 2 * (length * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public void setLength ( double length){
        this.length = length;

    }

    @Override
    public void setWidth ( double width){
        this.width = width;

    }


    }


//Shapes exercise below relates to Inheritance and polymorphism section of Java
////Inside of your shapes directory, create a class named Rectangle. It should have protected properties for both length and width.
//
//public class Rectangle {
////    fields/properties/variables(has state)
//    protected double length;
//    protected double width;
//
////   Rectangle should define a constructor that accepts two numbers for length
//// and width, and sets those properties.
////    constructor below
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
////getters and setters to grab or change the state of property
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//            this.width = width;
//    }
//
////    function a METHOD we are creating--gets two numbers/parameters
//    public double getPerimeter(){
//        return (2 * length) + (2 * width);
//    }
//
//    public double getArea(){
//        return length * width;
//    }
//
//
//}