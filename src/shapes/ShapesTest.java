package shapes;

import org.w3c.dom.css.Rect;

public class ShapesTest {

    public static void main(String[] args) {
//create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5

//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());

//For the Interfaces and Abstract Classes
        Measurable myShape = new Square(5);
        System.out.println((int) myShape.getArea());
        System.out.println((myShape.getPerimeter()));

        Measurable anotherShape = new Rectangle(2, 3);
        System.out.println(anotherShape.getPerimeter());
        System.out.println(anotherShape.getArea());



    }
}
