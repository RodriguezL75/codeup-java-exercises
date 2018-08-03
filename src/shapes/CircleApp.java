package shapes;


import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Let's create a circle");
        Input input = new Input();


        do {
            System.out.println(("Please provide a radius for your circle"));
            double radius = input.getInt();

            Circle myCircle = new Circle(radius);

            System.out.println("Here's the circumference: " + myCircle.getCircumference());

            System.out.println("Would you like to make another circle?");
        } while(input.yesNo());

        int circleCount = Circle.getCircleCount();
        System.out.println("Thanks for using CircleApp, You created " + circleCount + " circle objects.");
    }
}

