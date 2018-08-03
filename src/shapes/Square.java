package shapes;

//Change your existing Square class to extend Quadrilateral.
//
//Because the length of all sides of a square are the same,
// the methods for setting the length and the width should
// set both protected properties.


public class Square extends Quadrilateral{

    public Square(double l){
        super(l, l);
    }

    @Override
    void setLength(double length) {
        this.length = this.width = length;
    }

    @Override
    void setWidth(double width) {
        this.length = this.width =width;

    }
    @Override
    public double getPerimeter(){
        return (this.length * 4);
    }

    @Override
    public double getArea(){
        return length * length;
    }

}



















//Shapes exercise below relates to Inheritance and polymorphism section of Java
//public class Square extends Rectangle {
//
//    public Square(double side) {
//        super(side, side);
//    }
//
////    In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
////
////
////perimeter = 4 x side
////area = side ^ 2
//
//    @Override
//    public double getPerimeter(){
//        System.out.println("Square version");
//        return super.getWidth() * 4;
//    }
//
//    @Override
//    public double getArea(){
//        System.out.println("Square version");
//        return super.getWidth() * super.getLength();
//
//    }
//}