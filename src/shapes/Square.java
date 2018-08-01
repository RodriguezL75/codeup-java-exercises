package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

//    In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
//
//
//perimeter = 4 x side
//area = side ^ 2

    @Override
    public double getPerimeter(){
        System.out.println("Square version");
        return super.getWidth() * 4;
    }

    @Override
    public double getArea(){
        System.out.println("Square version");
        return super.getWidth() * super.getLength();

    }
}
