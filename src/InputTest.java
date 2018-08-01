import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();//instantiate an object / create an object
        System.out.println("enter a message");
        System.out.println(input.getString()); //inline variable -> it is the opposite of extract variable
        System.out.println("Do you want to continue (y/n)?");
        System.out.println("Enter a number between 6, 18");
        System.out.println(input.getInt(6, 18));
        System.out.println("Enter any integer number");
        int anyNumber = input.getInt();
        System.out.println("Enter a number between 2.5 and 7.9");
        double doubleInRange = input.getDouble(2.5, 7.9);
        System.out.println(doubleInRange);
        System.out.println("Enter any number");
        double anyDouble = input.getDouble();
        System.out.println(anyDouble);

        double number = input.getDouble(3.5, 8.9);

        System.out.println(number);
    }

}
